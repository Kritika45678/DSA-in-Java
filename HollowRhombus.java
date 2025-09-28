public class HollowRhombus {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            //spaces
            for(int k=1;k<=(n-i);k++){
                System.out.print("  ");
            }
            //stars&spaces
            for(int j=1;j<=n;j++){
            if(i==1|| i==n||j==1||j==n){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.println();
        }
    }
}
