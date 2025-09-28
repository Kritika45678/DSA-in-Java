import java.util.Scanner;
public class MaxMin {
      int smallest,largest;
     int max( int num1, int num2, int num3){
        largest=num1;
        if(largest<num2){
            largest=num2;
        }
        if(largest<num3){
            largest=num3;
            return largest;
    }
    else{
        return largest;
    }
    }
    int min(int N1,int N2,int N3){
        smallest=N1;
        if(smallest>N2){
            smallest=N2;
        }
        if(smallest>N3){
            smallest=N3;
            return smallest;
        }
        else{
            return smallest;
        }

    }
    public static void main(String[] args){
       Scanner obj=new Scanner(System.in);
       System.out.println("Enter three numbers:");
       int n1=obj.nextInt();
       int n2=obj.nextInt();
       int n3=obj.nextInt();
       MaxMin myobj=new MaxMin();
       int large=myobj.max(n1,n2,n3);
       int small=myobj.min(n1,n2,n3);
       System.out.println("The largest no is:"+large);
       System.out.println("The smallest no is:"+small);
       obj.close();
    }

}
