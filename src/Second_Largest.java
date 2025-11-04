import java.util.Arrays;

public class Second_Largest {
    public static void main(String[] args) {
        int[] arr={39,22,49,68,21,29,49,35,11,17,54};
        System.out.println((solution(arr)));
    }
    static int solution(int[] arr){
        int max=Integer.MIN_VALUE;
        int secmax=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                secmax=max;
                max=arr[i];
            }

            else if (arr[i]>secmax && arr[i]<max) {
                secmax=arr[i];
            }
        }
       return secmax;
    }
}
