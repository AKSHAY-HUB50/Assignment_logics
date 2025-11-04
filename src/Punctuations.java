public class Punctuations {
    public static void main(String[] args) {
        String str = "Hello, how are you? I'm fine! Thanks.";
        String restr=str.replaceAll("[^!?\'\";:,._-]","");  // or str.replaceAll("[^\\p{Punct}]", "");
        System.out.println(restr.length());
    }
}
