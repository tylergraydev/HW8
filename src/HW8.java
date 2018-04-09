public class HW8 {

    public static void main(String args[]){
        Graphmu gmu = new Graphmu();
        gmu.Init(5);
        System.out.println(gmu);
        gmu.printMatrix();
        gmu.setEdge(1,3,1);
        gmu.setEdge(4,0,1);
        gmu.setEdge(3, 2 ,2);
        System.out.println(gmu.weight(2, 3));

        System.out.println(gmu.weight(3, 2));
        gmu.delEdge(0,4);
        System.out.println(gmu);
        System.out.println(gmu.isEdge(4,2));
        gmu.setMark(0,9);
        System.out.println(gmu.toString());
    }
}

