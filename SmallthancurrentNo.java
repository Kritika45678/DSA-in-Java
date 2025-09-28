public class SmallthancurrentNo {
    public static void main(String[] args) {
        int[]nums={8,2,3,1,2,9,0};
        int[] res=new int[7];
        int d=0;
        for(int i=0;i<nums.length;i++){
            d=0;
            for(int j=0;j<nums.length;j++){
              if(nums[i]>nums[j]&&i!=j){
                  d++;
              }
        }
          res[i]=d;
    }
    for(int k=0;k<res.length;k++){
        System.out.println("Count of numbers smaller than " + nums[k] + " = " + res[k]);
    }
}
}
