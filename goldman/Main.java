package goldman;

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

         Plusmult pm = new Plusmult();
        int[] A = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};

        // Call the function and print the result
        System.out.println(pm.plusMult(A));
    }
}
