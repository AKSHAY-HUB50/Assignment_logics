public class Frequency_String {
    public static void main(String[] args) {
        int[] arr ={1,1,1,2,2,3,3,3,3,3,4,1,1,2};
        int[] n =new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
           n[arr[i]]++;
        }
        for (int i = 0; i < n.length; i++) {
           if(n[i]>0){                            // n[i]==1   to remove dublicate values
                                                   // n[i]>=2   to print only  dublicate values
               System.out.println(i+" = "+n[i]);

           }
       }
}
}
