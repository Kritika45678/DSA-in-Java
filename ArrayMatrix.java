import java.util.Scanner;
public class ArrayMatrix {
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
        //Searching an element
        System.out.println("Enter which element you want to search");
        int x=obj.nextInt();
        boolean flag=false;
        int a=-1,b=-1;
        search:
        for(a=0;a<rows;a++){
           for(b=0;b<col;b++){
            if(matrix[a][b]==x){
                flag=true;
                break search;//search is used as a label to exit both loops immediately.
            }
           }
        }
        if(flag){
            System.out.println("The element is found at "+ a +","+ b);
        }
        else{System.out.println("The element is not found");
    }
    System.out.println("The transpose of the matrix is:");
        //transpose of matrix
        for(int k=0;k<col;k++){
            for(int m=0;m<rows;m++){
                System.out.print(matrix[m][k]+" ");
            }
            System.out.println();
        }
        obj.close();
    }
}
