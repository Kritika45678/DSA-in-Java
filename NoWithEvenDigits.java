public class NoWithEvenDigits {
    public static void main(String[] args) {
        int[] a={44,45,467,7823};
        int count=0;
        for(int i=0;i<a.length;i++){
            String s=Integer.toString(a[i]);
            if(s.length()%2==0){
               count++;
            }
        }
        System.out.println("The count of such numbers whose no of digits is even:");
        System.out.println(count);
    }
    
}
