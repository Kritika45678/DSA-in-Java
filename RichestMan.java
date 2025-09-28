import java.util.Scanner;
public class RichestMan {   
     public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the money deposited in separate bank accounts ");
        int[][] accounts=new int[3][2];
        for(int k=0;k<3;k++){
           for(int s=0;s<2;s++){
              accounts[k][s]=obj.nextInt();
           }
        } 
    int wealthiest=0;                                         
    for(int i=0;i<accounts.length-1;i++){
        for(int j=0;j<(accounts[i].length-1);j++){
            wealthiest=accounts[i][j]+accounts[i][j+1];
            int sum=(accounts[i+1][j]+accounts[i+1][j+1]);
            if(wealthiest<sum){
                wealthiest=sum;
            }
        }
    }
    System.out.println("The wealthiest man has:$"+ wealthiest);
    obj.close();
    }
}
