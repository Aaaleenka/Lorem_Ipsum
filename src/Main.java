import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        Map<Character, Integer> map = new HashMap<>();
        for (int i=0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (map.containsKey(c)) {
                int q = map.get(c);
                q++;
                map.replace(c,q);
            } else map.put(c, 1);
        }
        int MAX_VALUE = -1;
        int MIN_VALUE = 2147483647;
        char maxC = ' ';
        char minC = ' ';

        for (Map.Entry<Character, Integer> kv : map.entrySet()){
            if (kv.getValue() > MAX_VALUE) {
                maxC = kv.getKey();
                MAX_VALUE = kv.getValue();
            }
            if (kv.getValue() < MIN_VALUE) {
                minC = kv.getKey();
                MIN_VALUE = kv.getValue();
            }
        }

        System.out.println("Максимальное количесвто раз встретился символ " + "'"+ maxC + "'");
        System.out.println("Минимальное количесвто раз встретился символ " + "'" + minC + "'" );
    }
}