import java.util.Scanner;
public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the no of rows");
        int rows=obj.nextInt();
        System.out.println("Enter the no of columns");
        int col=obj.nextInt();
        int[][] matrix = new int[rows][col];
        System.out.println("Enter the elements of matrix");
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=obj.nextInt();
            }
        }
        //print the elements of matrix
        System.out.println("Matrix:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
        System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("The Spiral Matrix is:");
         int row_start=0;
         int row_end=rows-1;
         int col_start=0;
         int col_end=col-1;
         while(row_start<=row_end && col_start<=col_end){
            //1 moving left to right on top row of matrix
            for(int i=col_start;i<=col_end;i++){
                System.out.print(matrix[row_start][i]+" ");
            }
            row_start++;
            //2 moving top to bottom on most right column of matrix 
            for(int i=row_start;i<=row_end;i++){
                System.out.print(matrix[i][col_end]+" ");
            }
            col_end--;
            //3 moving right to left on bottom row
            if(row_start<=row_end){ //if any row is left
                for(int i=col_end;i>=col_start;i--){
                    System.out.print(matrix[row_end][i]+" ");
                }
                row_end--;
            }
            //4 
           if(col_start<=col_end) {//check if any column is left
                for(int i=row_end;i>=row_start;i--){
                    System.out.print(matrix[i][col_start]+" ");
                }
            col_start++;
         }
    }
    obj.close();
}
}
