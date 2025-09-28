import java.util.Scanner;

public class StringBuilderExample {
    public static void main(String[] args) {
        /* 
        StringBuilder s=new StringBuilder("Tony");
        s.setCharAt(0,'P');
        System.out.println(s);
   
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter the number:");
    int n=obj.nextInt();
    if(n>0 && (n & (n-1))==0){
        System.out.println("The number is power of 2");
    }
    else{
        System.out.println("The number is not a power of 2");
    }
    */
    /* 
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter the number:");
    int n=obj.nextInt();
    int pos=2;
    int newnum=n<<pos;
    System.out.println(newnum);
    */
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter the number:");
    int n=obj.nextInt();
    int count=0;
    while(n>0){
        if((n & 1)==1){ //check last bit
            count++;
        }
        n=n>>1;
    }
    System.out.println("The count of 1's is:"+ count);
    obj.close();
    }
}
