import java.util.Scanner;
import java.util.Arrays;
public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] nums={5,6,6,10,1};
        int n=nums.length;
        int[] ans=new int[2*n];
        int[] res=new int[2*n];
        Scanner obj=new Scanner(System.in);
        //System.out.println("Enter numbers:");
       /*  for(int j=0;j<nums.length;j++){
            nums[j]=obj.nextInt();
        }*/
        for(int i=0;i<n;i++){
            res[i]=nums[i];
            res[5+i]=nums[i];
        }
        for(int j=0;j<res.length;j++){
            ans[j]= res[j];
        }
        System.out.println(Arrays.toString(ans));
        obj.close();
    }
}
