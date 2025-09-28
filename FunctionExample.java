import java.util.Scanner;
public class FunctionExample {
    public  int GreatestCommonDivisor(int num1,int num2){
        int div=1;
        if(num1>num2){
         for(int i=1;i<=num1;i++){
            if(num1%i==0 && num2%i==0){
                if(div<i){
                  div=i;
                }
            }
         }
        }
        else{
         for(int i=1;i<=num2;i++){
            if(num1%i==0 && num2%i==0){
                if(div<i){
                  div=i;
                }
            }
         }
        }
        return div;
    } 
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter first number");
        int num1= obj.nextInt();
        System.out.println("Enter second number");
        int num2=obj.nextInt();
        FunctionExample call=new FunctionExample();
        int res=call.GreatestCommonDivisor(num1, num2); 
        System.out.println(res);
        obj.close();;
    }
}
