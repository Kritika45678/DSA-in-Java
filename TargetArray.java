import java.util.Arrays;
public class targetArray{
    
    public  void array(int[] n,int[] in,int[] t){
         for(int i=0;i<n.length;i++){
            t[in[i]]=n[i];
         }
         System.out.println("The target array is:"+(Arrays.toString(t)));
    }
    public static void main(String[] args) {
        int[] nums={4,5,1,0,2,3};
    int[] index={1,4,0,3,2,5};
    int[] target=new int[6];
        targetArray obj=new targetArray();
        obj.array(nums,index,target);
    }
}
