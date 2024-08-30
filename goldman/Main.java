package goldman;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        areaOfBox ab = new areaOfBox();
//        int[][] queries = {{5, 3}};
//        int[] ans = ab.numberOfWays(queries);
//
//        for(int res : ans){
//            System.out.println(res);
//        }

//        alternate al = new alternate();
//        int n = 10;
//        List<List<Integer>> result = al.alternatingParityPermutation(n);
//
//        for (List<Integer> permutation : result) {
//            System.out.println(permutation);
//        }

//         Plusmult pm = new Plusmult();
//        int[] A = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
//
//        // Call the function and print the result
//        System.out.println(pm.plusMult(A));

//        Triangle t = new Triangle();
//        int x1 = 0, y1 = 0;
//        int x2 = 1, y2 = 1;
//        int x3 = 2, y3 = 2;
//        int xp = 12, yp = 21;
//        int xq = 21, yq = 21;
//
//        // Print the result
//        System.out.println(t.checkPointsInTriangle(x1, y1, x2, y2, x3, y3, xp, yp, xq, yq));

//        BetterStringCompression bsc = new BetterStringCompression();
//        String input = "a10c20b30a5";
//        String compressedString = bsc.compressString(input);
//        System.out.println(compressedString);

//         numberStirng ns = new numberStirng();
//         String s = "2101";
//         System.out.println(ns.numDecodings(s));

//          AnagramFinder af = new AnagramFinder();
//          String[] A = {"bat", "tab", "cat", "act", "tac"};
//          String[] B = {"tac", "bat"};
//          List<List<String>> result = af.findAnagrams(A, B);
//          System.out.println(result);

//            Product p = new Product();
//            String[] operations = {"push", "push", "push", "pop"};
//            int[] x = {1, 2, 3, 1};
//
//            List<Long> result = p.maxMin(operations, x);
//            System.out.println(result); // Output: [1, 2, 3, 6]

//            Encircular enc = new Encircular();
//            String[] commandsToTest = {"G", "L", "RGRG"};
//            List<String> results = enc.doesCircleExist(commandsToTest);
//
//        for (String result : results) {
//            System.out.println(result);
//        }
        int N = 26;
        int[][] queries = {
                {1, 2, 1009}, // First query: l = 1, r = 2, m = 1009
                {3, 3, 5}     // Second query: l = 3, r = 3, m = 5
        };

        // Construct the goodArray using the first function
        GoodArray ga = new GoodArray();
        ArrayList<Integer> goodArray = ga.constructGoodArray(N);

        // Process each query using the second function
        for (int[] query : queries) {
            int l = query[0];
            int r = query[1];
            int m = query[2];

            int result = ga.processQuery(goodArray, l, r, m);
            System.out.println(result);
        }
    }
}
