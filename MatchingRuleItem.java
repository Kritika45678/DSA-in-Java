import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class MatchingRuleItem {
    public static void main(String[] args) {
       List<List<String>> items = new ArrayList<>();
        items.add(Arrays.asList("phone", "silver", "android"));
        items.add(Arrays.asList("laptop", "white", "apple"));
        items.add(Arrays.asList("phone", "blue", "pixel"));
        String value="phone";
        String color="blue";
        String name="pixel";
        int c=0;
        for(int i=0;i<3;i++){
            for(String s:items.get(i)){
                if(s==value||s==color||s==name){
                    c++;
                    break;
                }
        
            }
        }
        System.out.println("The no of items matching the rule is:"+c);
    }
}
