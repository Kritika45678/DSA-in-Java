import java.util.Scanner;
public class ArrayinAscending {
    public static void main(String[] args) {
        boolean flag=true;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the positive integer");
         int[] arr=new int[5];
         //input 
        for(int j=0;j<arr.length;j++){
          arr[j]=obj.nextInt();
        }
        for(int i=0;i<arr.length-1;i++){
          if(arr[i]>arr[i+1]){
             flag=false;
             break;
          }
        }
        if(flag){
           System.out.println("The array is in ascending order");
        }
        else{
            System.out.println("The given array is not in ascending order");
        }
        obj.close();
    }
}
