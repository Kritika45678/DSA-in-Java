public class Runningsum {
     static int[] nums={4,5,2,3,6};
     int i;
    static int sum(int l){
         int s=0;
         for(int j=l;j>=0;j--){   
             s+=nums[j];
         }
    return s;
        }
    public static void main(String[] args) {
        int[] runningsum=new int[5];
        System.out.println("The running sums are:");
        for( int k=0;k<runningsum.length;k++){
            runningsum[k]=sum(k);
            System.out.println(runningsum[k]);
        }
    }
}
