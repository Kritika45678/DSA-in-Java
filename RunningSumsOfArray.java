
import java.util.Scanner;
public class RunningSumsOfArray {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int k=0;
        int[] nums=new int[4];
        while( k!=(nums.length)){
        int n=obj.nextInt();
        nums[k]=n;
        k++;
        }
        
        int[] sum= new int[nums.length];
        sum[0]=nums[0];
        int i=0;
        while(i!=(nums.length-1)){
            sum[i+1]=sum[i]+nums[i+1];
            i++;
        }
        System.out.println("The running sum of array is:");
        for(int j=0;j<sum.length;j++){
            System.out.println(sum[j]);
        }
        obj.close();
    }
}
