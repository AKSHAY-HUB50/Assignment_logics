import java.util.Arrays;

public class Total_numbers_of_ovels {
    public static void main(String[] args) {
        String str="Method Overloading Program";
        String onlyVowels = str.replaceAll("[^aeiouAEIOU]", "");
        System.out.println("Total Vowels "+onlyVowels.length());
    }
}
