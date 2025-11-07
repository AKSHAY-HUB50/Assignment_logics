//Java Program to Find the Maximum and Minimum Occurring Characters in a String
public class Occurance_of_char {
    public static void main(String[] args) {
        String str="I Love Programminggaa".toLowerCase();

        int[] arr = new int[127];


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                arr[ch]++;
            }
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;


        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {

                if (arr[i] > max) {
                    max = arr[i];

                }

                if (arr[i] < min) {
                    min = arr[i];

                }
            }
        }


        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==max){
                System.out.print((char)i+" ");
            }
        }
        System.out.println("="+max);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==min){
                System.out.print((char)i+" ");
            }
        }
        System.out.println("="+min);



    }
}
