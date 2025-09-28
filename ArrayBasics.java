import java.util.Arrays;
import java.util.Scanner;
public class ArrayBasics {
    int a;
   public static void main(String[] args){
      int[][] arr=new int[3][4];
      
      Scanner obj=new Scanner(System.in);
      System.out.println("Enter the nums of matrix:");
      for(int row=0;row<arr.length;row++){
         for(int col=0;col<arr[row].length;col++){
             arr[row][col]=obj.nextInt();
         }
      }
      for(int[] a:arr){
        System.out.println(Arrays.toString(a));
      }
      obj.close();
    }
}
