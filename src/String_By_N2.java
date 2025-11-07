public class String_By_N2 {
    public static void main(String[] args) {
        String str = "abcDEFPQR9";
        int parts=4;

        int len=str.length();
        int partSize=len/parts;
        int remainder = len % parts;


        int index = 0;
        for (int i = 0; i < parts; i++) {
            int end = index + partSize;

            if (remainder > 0) {
                end++;
                remainder--;
            }

            if (end > len) end = len;

            System.out.println(str.substring(index, end));
            index = end;
        }

    }
}
