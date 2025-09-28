public class ZerobasedPermutation {
    public static void main(String[] args){
    int[] nums={2,4,3,1,0};
    int[] ans=new int [5];
    for(int i=0;i<nums.length;i++){
     int n= nums[i];
     ans[i]=nums[n];
}
    System.out.println("The result permutation array is:");
    for(int i=0;i<5;i++){
        System.out.println(ans[i]);
    }
}
}
