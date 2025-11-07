//Java Program to Determine Whether a Given String is a Palindrome
public class Pallindrome_String {
    public static void main(String[] args) {
        String str="madam";
        if (solution(str)){
            System.out.println("Palindrome");
        }
        else
            System.out.println("not a Palindrome");
    }
    static boolean solution(String str){
        String rev="";
        for (int i = str.length()-1; i >=0 ; i--) {
            rev+=str.charAt(i);
        }
        return rev.equals(str);
    }
}
