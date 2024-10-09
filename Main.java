import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId='Run'/> or
// click the <icon src='AllIcons.Actions.Execute'/> icon in the gutter.
public class Main {

 
    public static void main(String[] args) {

    }

    private static final Map<Character, Integer> map = new HashMap<>() {{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};


    public int romanToInt(String s) {

        int sum = 0;
        int last = 10001;
        for (int i = 0; i < s.length(); i++) {
            int currentValue =  map.get(s.charAt(i));
            sum+= currentValue;
            if(last < currentValue){
                sum = sum - last *2;
            }
            last = currentValue;
        }
        return sum;
    }
}