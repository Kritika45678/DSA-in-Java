import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the strings");
        String[] arr=new String[10];
        for(int i=0;i<5;i++){
           arr[i]=obj.nextLine();
        } 
        for(int i=0;i<5;i++){
        System.out.println(arr[i]);
        }
        obj.close();
    }
}
