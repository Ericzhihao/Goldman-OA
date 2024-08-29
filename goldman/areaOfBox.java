package goldman;

import java.util.ArrayList;
import java.util.List;

public class areaOfBox {
    public int[] numberOfWays(int[][] queries){
        int m = 0;
        int n = 0;
        int min = 0;
        int res = 0;

        List<Integer> list = new ArrayList<Integer>();
        for(int[] query : queries){
            m = query[0];
            n = query[1];
            min = Math.min(m,n);
            res = 0;
            for(int i = 1; i <= min; i++){
                res += (n - i + 1) * (m - i + 1);
            }
            list.add(res);
        }
        int[] result = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            result[i] = list.get(i);
        }
        return result;
    }
}
