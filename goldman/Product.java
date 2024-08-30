package goldman;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Product {
    public List<Long> maxMin(String[] operations, int[]x){
        TreeSet<Integer> set = new TreeSet<>();
        List<Long> list = new ArrayList<>();

        for(int i = 0; i < operations.length; i++){
            if(operations[i].equals("push")){
                set.add(x[i]);

            }else if (operations[i].equals("pop")){
                set.remove(x[i]);
            }

            if(!set.isEmpty()){
                int minVal = set.first();
                int maxVal = set.last();
                list.add((long) minVal * maxVal);

            }
        }
        return list;
    }

}
