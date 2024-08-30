package goldman;

import java.util.HashMap;

public class Music {
    public int countPairs(int[] songs) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for(int duration : songs){
            int remainder = duration % 60;
            int complement = remainder == 0 ? 0 : 60 - remainder;
            if(map.containsKey(complement)){
                count += map.get(complement);
            }

            map.put(remainder, map.getOrDefault(remainder, 0) + 1);
        }
        return count;
    }
}
