import java.util.Scanner;
public class PrimeNo{
    public static void main(String[] args){
        int i=2,n;
        boolean flag=true;
        System.out.println("Enter a number");
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
        if(n<=1){
            flag=false;
        }
        else{
        while(i*i<=n){
            if(n%i==0){
               flag=false;
               break;
            }
        else{
            i++;
        }
    }
    }
        if(flag){
            System.out.println("Eneterd no is prime no");
        }
        else{
            System.out.println("Entered no is not a prime number");
        }  
        obj.close();      
    }
}
