package commonJavaPrograms;

import java.util.HashMap;
import java.util.Map;

public class CheckAnagram {

    public static void main(String[] args) {
        String str1 = "LISTEN";
        String str2 = "SILENT";

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (char c : str1.toCharArray()) {
            if (map1.containsKey(c)) {
                map1.put(c, map1.get(c) + 1);
            } else {
                map1.put(c, 1);
            }
        }
        for (char c : str2.toCharArray()) {
            if (map2.containsKey(c)) {
                map2.put(c, map2.get(c) + 1);
            } else {
                map2.put(c, 1);
            }
        }

        if(map1.equals(map2)){
            System.out.println("Strings are Anagram");
        }else
            System.out.println("Strings aren't Anagram");
    }
}
