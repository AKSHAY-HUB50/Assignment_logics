public class String_By_N {
    public static void main(String[] args) {
        String s="Hellojavaadsjhk";
        int n=3;
        int len=s.length();
        int partsize=len/n;

        for (int i = 0; i < len; i += partsize) {
            String part = s.substring(i, i + partsize);
            System.out.println(part);
        }
    }
}
// {
//    public static void main(String[] args) {
//        String str = "abcdefghijk"; // sample string
//        int n = 4; // number of parts
//
//        int len = str.length();
//        int partSize = len / n;
//        int remainder = len % n;
//
//        int index = 0;
//        for (int i = 0; i < n; i++) {
//            int end = index + partSize;
//
//            // add one extra character if remainder > 0
//            if (remainder > 0) {
//                end++;
//                remainder--;
//            }
//
//            // make sure we don't go out of bounds
//            if (end > len) end = len;
//
//            System.out.println(str.substring(index, end));
//            index = end;
//        }
//    }
//}
