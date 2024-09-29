package commonJavaPrograms;

import java.util.HashMap;
import java.util.Map;

public class CheckDuplicateCharacters {

    public static void main(String[] args) {

        String str = "TOMORROW";

        Map<Character, Integer> map1 = new HashMap<>();


        for (char c : str.toCharArray()) {
            if (map1.containsKey(c)) {
                map1.put(c, map1.get(c) + 1);
            } else {
                map1.put(c, 1);
            }
        }
    }

    }

