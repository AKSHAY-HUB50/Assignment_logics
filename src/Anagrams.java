import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String str1 = "Trian gle";
        String str2 = "integral";

        str1 = str1.replaceAll(" ", "").toLowerCase();
        str2 = str2.replaceAll(" ", "").toLowerCase();

        char[] ch1=str1.toCharArray();
        char[] ch2=str2.toCharArray();

        if(ch1.length!= ch2.length){
            System.out.println("Not Anagrams");
        }
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if (Arrays.equals(ch1, ch2)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }
}
