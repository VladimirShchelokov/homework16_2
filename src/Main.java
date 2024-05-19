import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] list = {"man", "moon", "good", "night"};
        Map<String,String> map1 = new HashMap<>();
        for (String items : list) {
            char word1 = items.charAt(0);
            char word2 = items.charAt(items.length() - 1);
            String str1 = String.valueOf(word1);
            String str2 = String.valueOf(word2);
            map1.put(str1, str2);
        }
        System.out.println(map1);

    }
}
