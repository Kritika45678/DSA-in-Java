public class Butterflypattern {
    public static void main(String[] args) {
        int n=4;
        //upper half
        for(int i=1;i<=n;i++){
            //print stars
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }//spaces
                for(int k=1;k<=(2*(n-i));k++){
                    System.out.print("  ");
                }//print stars
                for(int m=1;m<=i;m++){
                    System.out.print("* ");
                }
             System.out.println();
        }
         //lower half
         for(int i=n;i>=1;i--){
            //print stars
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }//spaces
                for(int k=1;k<=(2*(n-i));k++){
                    System.out.print("  ");
                }//print stars
                for(int m=1;m<=i;m++){
                    System.out.print("* ");
                }
             System.out.println();
        }
    }
    }

