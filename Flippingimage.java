import java.util.Arrays;
public class flippingimage {
   public int[][] flip(int[][] a){
    for(int i=0;i<a.length;i++){
        int m=a[i].length;
            for(int j=0;j<m/2;j++){
              int temp=a[i][j];
              a[i][j]=a[i][m-1-j];
              a[i][m-1-j]=temp;
            }
        }
        for(int k=0;k<a.length;k++){
            for(int t=0;t<a[k].length;t++){
                if(a[k][t]==0){
                    a[k][t]=1;
                }
                else if(a[k][t]==1){
                    a[k][t]=0;
                }
            }
        }
        return a;

    }
    public static void main(String[] args) {
        flippingimage f=new flippingimage();
        int[][] arr={{1,0,1},{1,1,0},{0,0,1}};
        int[][] image=f.flip(arr);
        System.out.println("The flipped image is:");
        System.out.println(Arrays.deepToString(image));
}
}
