import java.util.Arrays;

public class Binary_search_pro1 {
    public static void main(String[] args) {
        int[] arr={7,1,5,3,2,4};
        int target=10;
        int sum=0;
        int e=0;
        int len=0;
        for (int s = 0; s < arr.length; ) {
            if(sum==target){
                len= e-s;
                break;
            }
            else if (sum<target){
                sum+=arr[e];
                e++;
            } else if (sum>target) {
                s++;
                sum=0;
                e=s;
            }
        }
        System.out.println((len));
    }

}
