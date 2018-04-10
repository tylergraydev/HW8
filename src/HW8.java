public class HW8 {

    public static void main(String args[]){

        Graphmu gmu = new Graphmu();
        //Init with Szie of 5
        gmu.Init(5);
        //System.out.println(gmu);
        //gmu.printMatrix();
        gmu.setEdge(3 ,2 , 2);
        gmu.setEdge(1, 0 , 7);
        gmu.setEdge(0 , 2 , 4);
        gmu.setEdge(4,3,3);
        gmu.setEdge(4,0,10);
        gmu.setEdge(4, 2 ,2);
        //Weight of 3,2
        //Prints twice to show the 3,2 and 2,3 are the same
        System.out.println(gmu.weight(2, 3));
        System.out.println(gmu.weight(3, 2));
        gmu.delEdge(0,4);
        //System.out.println(gmu);
        //Should be true
        System.out.println(gmu.isEdge(4,2));
        //should be false
        System.out.println(gmu.isEdge(1,4));
        //System.out.println(gmu.toString());
        //System.out.println(gmu.getMark(4));
        //System.out.println(gmu.first(4));
        System.out.println(gmu.toString());
        //Edges should be 5
        System.out.println(gmu.e());
        //Vertices shouild be 5
        System.out.println(gmu.n());


        //Example Graph
        /*

        2--3--5
        |  |
        1--4
        | /
         0


        Expected Matrix

            0 1 2 3 4 5
          0 2
          1 1 0
          2 0 1 0
          3 0 0 1 0
          4 1 1 0 1 0
          5 0 0 0 1 0 0
ß
         */
        Graphmu g = new Graphmu(6);
        g.setEdge(1-1,1-1,2);
        g.setEdge(1-1,2-1,1);
        g.setEdge(1-1,5-1,1);
        g.setEdge(2-1,5-1,1);
        g.setEdge(2-1,3-1,1);
        g.setEdge(3-1,4-1,1);
        g.setEdge(4-1,5-1,1);
        g.setEdge(4-1,6-1,1);
        System.out.println(g);


    }
}

