public class Duplicate_Words_String {
    public static void main(String[] args) {
        String str="Java is easy and Java is very easy";

        String[] s=str.toLowerCase().split(" ");

        for (int i = 0; i < s.length; i++) {
            int count=1;
            for (int j = i+1; j <s.length ; j++) {
                if(s[i].equals(s[j])){
                    count++;
                }
            }
            if (count > 1) {
                System.out.println(s[i] + " : " + count);
            }
        }

    }
}
