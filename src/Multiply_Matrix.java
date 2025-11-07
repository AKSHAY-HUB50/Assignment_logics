import java.util.Arrays;

public class Multiply_Matrix {
    public static void main(String[] args) {
        int[][] arr1={{1,2},
                {3,4}};
        int[][] arr2={{1,2},
                {3,4}};
        int[][] arr3=new int[2][2];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                for (int k = 0; k < arr1[i].length; k++) {
                    arr3[i][j] =arr3[i][j]+arr1[i][k] * arr2[k][j];
                }
            }
        }
        for (int[] a :arr3) {
            System.out.println(Arrays.toString(a));
        }
    }
}
