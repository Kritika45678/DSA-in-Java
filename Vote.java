import java.util.Scanner;
public class Vote {
     void vote(int a){
        if(a>=18){
            System.out.println("You are eligible to vote");
        }
        else{
            System.out.println("You are not eligible to vote");
        }
     }
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the age:");
        int n=obj.nextInt();
        Vote myobj=new Vote();
        myobj.vote(n);
        obj.close();
    }    
}
