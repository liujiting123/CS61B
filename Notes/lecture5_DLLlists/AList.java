package lecture5_DLLists;

public class AList {
    int[] x = new int[3];
    int[] y = new int[]{1, 2, 3, 4, 5};
    int[] z = {6, 7, 8, 9, 10};

    int[][] pascalsTriangle = {
        {1},
        {1, 1},
        {1, 2, 1},
        {1, 3, 3, 1},
        {1, 4, 6, 4, 1}
    };

    public static void main(String[] args) {
        AList list = new AList();
        System.out.println(list.y[2]);
        System.out.println(list.z[4]);
        System.out.println(list.x);
    }
}
