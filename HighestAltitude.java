class CalcAltitude{
   public int altitude(int[] g){
    int current=0;
    int max=0;
    for(int i=0;i<g.length;i++){
        current=g[i];
        if(max<=current){
            max=current;
        }
        }
        return max;
         
    }
}
public class HighestAltitude {
    public static void main(String[] args){
    int gain[]={-5,6,1,4,3};
    CalcAltitude obj=new CalcAltitude();
    int res=obj.altitude(gain);
    System.out.println("The highest altitude is"+" "+res);
}
}
