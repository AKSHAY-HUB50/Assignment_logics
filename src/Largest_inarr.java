import java.util.Arrays;

public class Largest_inarr {
    public static void main(String[] args) {
        int[] arr={39,22,59,68,21,29,49,35,11,17,54};
        System.out.println(Arrays.toString(solution(arr)));
    }
    static int[] solution(int[] arr){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max)
                max=arr[i];
            else if (arr[i]<min) {
                min=arr[i];
            }
        }
        return new int[]{max,min} ;
    }
}
