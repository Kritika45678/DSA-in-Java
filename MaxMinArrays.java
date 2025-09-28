import java.util.Scanner;
public class MaxMinArrays {
    public int MaxInteger(int[] a){
        int max=a[0];
        for(int i=1;i<a.length;i++){
           if(max<a[i]){
            max=a[i];
           }
        }
        return max;
    }
    public int MinInteger(int[] b){
        int min=b[0];
        for(int i=1;i<b.length;i++){
            if(min>b[i]){
                min=b[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        MaxMinArrays o=new MaxMinArrays();
        System.out.println("Enter the positive integer");
         int[] arr=new int[10];
         //input 
        for(int j=0;j<arr.length;j++){
          arr[j]=obj.nextInt();
        }
       System.out.println("Enter your choice");
       System.out.println("Choose Max or Min");
       String ch=obj.next();
       switch (ch) {
        case "Max":
            int res=o.MaxInteger(arr);
            System.out.println("The maximum value is"+ res);
            break;
        case "Min":
            int result=o.MinInteger(arr);
            System.out.println("The minimum value is"+result);
            break;
        default:
        System.out.println("Invalid Choice,please enter Max or Min");
            break;
       }
       obj.close();
    }
}
