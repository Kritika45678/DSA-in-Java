public class Pattern7 {
    public static void main(String[] args) {
        int  rows=5,n=1;
        for(int i=0;i<rows;i++){
            for(int j=0;j<=i;j++){
                System.out.print(n+" ");
                n++;
            }
            System.out.println();
        }
    }
}
