public class MatrixDiagonals {
    public static void main(String[] args) {
        int[][] arr={{4,2,3,5},
                     {4,6,6,8},
                     {5,7,10,1},
                     {8,2,5,3} };
        int mat=0;
        int i;
        for(i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i==j){
                  mat+=arr[i][j];
                }
            }
        }
         mat+=arr[0][arr.length-1];
         mat+=arr[arr.length-1][0];
         System.out.println("The sum of all diagonal elements is"+" "+mat);
    }
}
