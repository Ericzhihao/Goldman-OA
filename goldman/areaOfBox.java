package goldman;

import java.util.ArrayList;
import java.util.List;

public class areaOfBox {
    public int[] numberOfWays(int[][] queries){
        int m = 0;
        int n = 0;

        List<Integer> list = new ArrayList<>();
        for(int[] query : queries){
            m = query[0];
            n = query[1];
            int res = 0;
            int min = Math.min(m,n);

            for(int i = 1; i <= min; i++){
                res += (m - i + 1) * (n - i + 1);
            }
            list.add(res);
        }
        int[] res = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            res[i] = list.get(i);
        }
        return res;
    }
}
