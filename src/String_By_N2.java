public class String_By_N2 {
    public static void main(String[] args) {
        String str = "abcDEFPQR9";
        int parts=7;

        int len=str.length();
        int partSize=len/parts;
        int start=0,end=partSize;

        for (int i = 0; i < parts-1; i++) {
            System.out.println(str.substring(start,end));;
            start=end;
            end+=partSize;
        }
        System.out.println(str.substring(start));
    }
}
