public class Pattern4 {
    public static void main(String[] args) {
        for(int i=4;i>0;i--){
            for(int j=4;j>(5-i-1);j--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
