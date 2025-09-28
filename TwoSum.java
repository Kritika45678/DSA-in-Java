import java.util.Arrays;
public class TwoSum {
    public static void main(String[] args) {
        int[] arr={3,4,5,4};
        int target=9;
        System.out.println("The indices which add up to target are:");
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
             System.out.println(Arrays.toString(new int[]{i,j}));
                }
            }
        }
    }
    }

