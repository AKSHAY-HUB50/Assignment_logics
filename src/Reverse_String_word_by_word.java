import java.util.Arrays;

//Java Program to Reverse a String Word by Word (Example: "I Love Programming" -> "Programming Love I"
public class Reverse_String_word_by_word {
    public static void main(String[] args) {
        String str="I Love Programming";
        String[] s=str.split(" ");

        int start=0,end=s.length-1;

        while(start < end) {
            String temp=s[start];
            s[start]=s[end];
            s[end]=temp;
            start++;
            end--;
        }
        System.out.println(String.join(" ",s));
    }
}
