package goldman;

import java.util.*;

public class AnagramFinder {
    public List<List<String>> findAnagrams(String[] A, String[] B) {
        // 用一个map来存储排序后的字符串和它们对应的anagrams
        Map<String, List<String>> anagramMap = new HashMap<>();

        // 填充map
        for (String str : A) {
            String sortedStr = sortString(str);
            anagramMap.computeIfAbsent(sortedStr, k -> new ArrayList<>()).add(str);
        }

        // 对B数组中的每个字符串，找到对应的anagrams并排序
        List<List<String>> result = new ArrayList<>();
        for (String str : B) {
            String sortedStr = sortString(str);
            List<String> anagrams = anagramMap.getOrDefault(sortedStr, new ArrayList<>());
            Collections.sort(anagrams);
            result.add(anagrams);
        }

        return result;
    }
    private String sortString(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
