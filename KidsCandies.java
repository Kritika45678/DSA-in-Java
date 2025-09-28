import java.util.Scanner;
public class KidsCandies {
    public static void main(String[] args) {
        int[] candies=new int[6];
        int i=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the no of candies each kid currently has:");
        while(i!=candies.length){
            candies[i]=obj.nextInt();
            i++;
        }
        System.out.println("Enter the no of Extra candies:");
        int Extra=obj.nextInt();
        
            int max=candies[0];
            for(int j=1;j<candies.length;j++){
                if(max<candies[j]){
                    max=candies[j];
                }
            }
            for (int k=0;k<(candies.length);k++){
                if( candies[k]+Extra>=max){
                  System.out.println("Kid "+(k+1)+" has greatest no of candies among all kids");
            }
                else{
                  System.out.println("Kid "+(k+1)+ " has not greatest no of candies among all kids");
            }
            
            }
            obj.close();
    
        }
    }


