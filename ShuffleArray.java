import java.util.Arrays;
import java.util.Scanner;
public class ShuffleArray {
    public static void main(String[] args) {
        int[]nums=new int[8];
        int[] res=new int[8];
        int n=nums.length;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++){
            nums[i]=obj.nextInt();
        }
        for(int k=0;k<n/2;k++){
            res[(2*k)]=nums[k];
        }
        int j=n/2;
        for(int l=1;l<=n/2;l++){
            res[(2*l-1)]=nums[j];
            j++;
        }
        System.out.println("The shuffled array is:");
        System.out.println(Arrays.toString(res));
        obj.close();
    }    
}

