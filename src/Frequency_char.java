public class Frequency_char {
    public static void main(String[] args) {
       String str="aaabbcdddf";
       int[] arr=new int[127];
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i)]++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0){
                System.out.println((char)i+" = "+arr[i]);
            }
        }
    }
}
