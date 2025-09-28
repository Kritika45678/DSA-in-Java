import java.util.HashSet;
import java.util.Scanner;
import java.lang.String;
public class Pangram {
    public static boolean pangram(String s){
            HashSet<Character> list=new HashSet<>();
            for(char ch:s.toCharArray()){
                if(ch>='a' && ch<='z'){
                    list.add(ch);
                }
            }
                return list.size()==26;
    }
    //Pangram is a sentence where every letter of english alphabet appears atleast once.
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the String in lowercase");
        String  str=obj.nextLine().toLowerCase();
        if(pangram(str)){
           System.out.println("This is a pangram");
        }
        else{
            System.out.println("This is not a pangram");
        }
        obj.close();
    }
}
