public class Thired_largest {
    public static void main(String[] args) {
        int[] arr={39,22,59,68,21,29,49,35,11,17,54};
        System.out.println((solution(arr)));
    }
    static int solution(int[] arr){
        int max=Integer.MIN_VALUE;
        int semax=Integer.MIN_VALUE;
        int thmax=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                semax=max;
                thmax=semax;
                max=arr[i];
            } else if (arr[i]>semax && arr[i]<max) {
                semax=arr[i];
            } else if (arr[i]>thmax && arr[i]<semax && arr[i]<max) {
                thmax=arr[i];
            }
        }
        return thmax;
    }
}
