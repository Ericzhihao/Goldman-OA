package goldman;

import java.util.Map;
import java.util.TreeMap;

public class BetterStringCompression {
    public static String compressString(String input) {
        Map<Character, Integer> map = new TreeMap<>();

        int i = 0;
        while (i < input.length()) {
            char currentChar = input.charAt(i);
            int j = i + 1;
            StringBuilder numBuilder = new StringBuilder();
            while (j < input.length() && Character.isDigit(input.charAt(j))) {
                numBuilder.append(input.charAt(j));
                j++;
            }
            int currentNum = Integer.parseInt(numBuilder.toString());

            map.put(currentChar, map.getOrDefault(currentChar, 0) + currentNum);

            i = j;
        }
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            result.append(entry.getKey()).append(entry.getValue());
        }
        return result.toString();
    }
}
