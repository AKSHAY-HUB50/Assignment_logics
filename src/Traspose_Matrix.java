import java.util.Arrays;

public class Traspose_Matrix {
    public static void main(String[] args) {
        int[][] arr1={{1,2,3},
                     {4,5,6}};
        int[][]ans=new int[arr1[0].length][arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                  ans[j][i]=arr1[i][j];
            }
        }
        for (int[] a:ans) {
            System.out.println(Arrays.toString(a));
        }

    }
}
