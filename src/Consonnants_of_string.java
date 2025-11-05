public class Consonnants_of_string {
    public static void main(String[] args) {
        String str="Method Overloading Program";
        String onlyVowels = str.replaceAll("[aeiouAEIOU ]", "");
        System.out.println("Total Consonnants :"+onlyVowels.length());
    }
}
