import java.util.Arrays;
public class Bubble_sort {
    public static void main(String[] args) {
        int[] arr={3,2,5,6,2,2,4,3,1,7,4};
        System.out.println(Arrays.toString(bubble(arr)));
    }
    static int[] bubble(int[] arr){
        boolean check=false;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    check=true;
                }
            }
            if(!check){
                return arr;
            }
        }
        return arr;
    }
}
