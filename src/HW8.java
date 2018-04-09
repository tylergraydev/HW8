public class HW8 {

    public static void main(String args[]){
        Graphmu gmu = new Graphmu();
        gmu.Init(5);
        System.out.println(gmu);
        gmu.printMatrix();
        gmu.setEdge(4,3,3);
        gmu.setEdge(4,0,10);
        gmu.setEdge(4, 2 ,2);
        System.out.println(gmu.weight(2, 3));

        System.out.println(gmu.weight(3, 2));
        //gmu.delEdge(0,4);
        System.out.println(gmu);
        System.out.println(gmu.isEdge(4,2));
        //gmu.setMark(4,9);
        System.out.println(gmu.toString());
        //System.out.println(gmu.getMark(4));
        System.out.println(gmu.next(4,0));
    }
}

