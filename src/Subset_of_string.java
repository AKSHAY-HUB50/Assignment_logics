public class Subset_of_string {
    public static void main(String[] args) {
        String str="FUN";
        for(int i=0 ; i<str.length() ; i++)
        {
            StringBuilder sub = new StringBuilder();

            for (int j = i; j < str.length(); j++) {
                sub =sub.append(str.charAt(j));
                System.out.print(sub+",");
            }

        }
    }
}
