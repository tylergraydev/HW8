/*
Tyler Gray
implements the Graph ADT
Uses a triangle representation to save space with the matrix
This one used the Upper Triangle Representation.
Had to redo majority to support the upper triangle over the lower bound triangle.


 */

import java.util.Arrays;



public class Graphmu implements Graph  {

    private int[][] matrix;                // The edge matrix
    private int numEdge;                   // Number of edges
    public int[] Mark;                     // The mark array

    public Graphmu() {}                     // Constructors
    public Graphmu(int n) {
        Init(n);
    }

    public void Init(int n) {
        Mark = new int[n];
        matrix = genTri(n);
        numEdge = 0;
    }
    //Generates a triable array
    //Assumes loops are possible so it leaves the diaganol in which may not be needed with a graph with no loops
    /** @return generated triangle array */
    public int[][] genTri(int n){
        int[][] tri = new int[n][];
        int row = 0;
        for(int i = n; i > 0; i--){

            tri[row++] = new int[i];

        }
        return tri;


    }

    public int n() { return Mark.length; } // # of vertices
    public int e() { return numEdge; }     // # of edges

    /** @return v's first neighbor */
    public int first(int v) {
        for (int i=0; i<Mark.length; i++)
            if (matrix[v][i] != 0) return i;
        return Mark.length;  // No edge for this vertex
    }

    /** @return v's next neighbor after w */
    public int next(int v, int w) {
        for (int i=w+1; i<Mark.length; i++)
            if (matrix[v][i] != 0)
                return i;
        return Mark.length;  // No next edge;
    }

    /** Set the weight for an edge */
    public void setEdge(int i, int j, int wt) {
        assert wt!=0 : "Cannot set weight to 0";
        if(i<j) {
            if (matrix[i][j-i] == 0) numEdge++;
            matrix[i][j-i] = wt;
            return ;
        }

        if (matrix[j][i-j] == 0) numEdge++;
        matrix[j][i-j] = wt;
    }

    /** Delete an edge */
    public void delEdge(int i, int j) {
        if(i<j) {
            if (matrix[i][j-i] != 0) numEdge--;
            matrix[i][j-i] = 0;
            return;
        }
        if (matrix[j][i-j] != 0) numEdge--;
        matrix[j][i-j] = 0;
    }

    /** Determine if an edge is in the graph */
    public boolean isEdge(int i, int j)
    {
        if(i<j) return matrix[i][j-i] != 0;
        return matrix[j][i-j] != 0;


    }

    /** @return an edge's weight */
    public int weight(int i, int j) {
        if(i<j) return matrix[j][i];
        return matrix[i][j];
    }


    public String toString(){
        return "Edges: "+ e() + "\n" + "Vertices: " + n() + "\n" + printMatrix();
    }

    public String printMatrix(){
        String s = "  ";
        for(int header = 0; header < matrix.length;header++)
            s += header + " ";
        s+= "\r\n";

        for(int row = 0; row < matrix.length; row++) {
            s+= row;
            for(int i = 0; i <  row;i++){
                s+= "  ";
            }
            for(int col = 0; col < matrix[row].length; col++) {
                s += " " + matrix[row][col];
            }
            s += "\r\n";
        }

        //s="";
        //for(int i = 0; i < matrix.length; i++){
        //    s = s + matrix[i].length + " ";
        //}
        return s;

    }


    /*
    public String printMatrix(){
        String s = "  ";
        for(int header = 0; header < matrix.length;header++)
            s += header + " ";
        s+= "\r\n";
        for(int row = 0; row < matrix.length; row++) {
            s+= row;
            for(int col = 0; col < matrix[row].length; col++) {
                s += " " + matrix[row][col];
            }
            s += "\r\n";
        }
        return s;
    }
    */

    /** Set/Get the mark value for a vertex */
    public void setMark(int v, int val) { Mark[v] = val; }
    public int getMark(int v) { return Mark[v]; }
}
