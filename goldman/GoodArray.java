package goldman;

import java.util.ArrayList;
import java.util.Collections;

public class GoodArray {
    public static ArrayList<Integer> constructGoodArray(int N) {
        ArrayList<Integer> goodArray = new ArrayList<>();
        for (int i = 0; (1 << i) <= N; i++) {
            if ((N & (1 << i)) != 0) {
                goodArray.add(1 << i);
            }
        }
        Collections.sort(goodArray);
        return goodArray;
    }

    // Function to process a query on the goodArray
    public static int processQuery(ArrayList<Integer> goodArray, int l, int r, int m) {
        long product = 1;
        for (int j = l - 1; j <= r - 1; j++) {
            product = (product * goodArray.get(j));
        }
        product %= m;
        return (int) product;
    }
}
