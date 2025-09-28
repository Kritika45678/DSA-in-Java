public class Goodpairs {
    int[] nums={4,6,5,6,4,2,2};
    
      int goodpairs(){
        int j;
        int d=0;
        System.out.println("Good Pairs are:");
        for( int i=0;i<nums.length;i++){
            for(j=i+1;j<(nums.length);j++){
                if(nums[i]==nums[j]&&i<j){
                    System.out.println((i+","+j));
                    d++;
                }
            }
         }
         System.out.println("These are "+ d +" pairs");
         return d;
    }
    public static void main(String[] args) {
        Goodpairs obj=new Goodpairs();
        obj.goodpairs();
    }
}
