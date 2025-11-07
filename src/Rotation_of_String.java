import java.util.Locale;

public class Rotation_of_String {
    public static void main(String[] args) {
        String s1="ABCD".toLowerCase().replaceAll(" ","");

        String s2="DABC".toLowerCase();
        String s3=s1+s1;

        if (s1.length()!=s2.length()){
            System.out.println("Not Rotation");
            return;
        }

        for (int i = 0; i < s1.length(); i++) {

            String ans=s3.substring(i,i+s1.length());
            if(s2.equals(ans)){
                System.out.println("String is a Rotation of Another");
                return;
            }

        }
        System.out.println("not Rotation");

    }
}
