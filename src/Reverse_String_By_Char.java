public class Reverse_String_By_Char {
    public static void main(String[] args) {
        String str="I Love Programming";
        String[] s=str.split(" ");

        for (int i = 0; i < s.length; i++) {
            System.out.print(rev(s[i])+" ");
        }
    }
    static String rev(String str){
        char[] ch=str.toCharArray();
        int s=0,e=ch.length-1;

        while (s<e){
            char c=ch[s];
            ch[s]=ch[e];
            ch[e]=c;
            s++;
            e--;
        }
        return new String(ch);
    }
}
