package goldman;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class alternate {

    // Method to merge two lists alternately based on parity
    public static List<Integer> merge(List<Integer> A, List<Integer> B) {
        int i = 0;
        int j = 0;
        List<Integer> t = new ArrayList<>();

        for (int k = 1; k <= A.size() + B.size(); k++) {
            if (k % 2 != 0 && i < A.size()) {
                t.add(A.get(i++));
            } else if (k % 2 == 0 && j < B.size()) {
                t.add(B.get(j++));
            }
        }
        return t;
    }

    // Method to generate alternating parity permutations
    public static List<List<Integer>> alternatingParityPermutation(int N) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> E = new ArrayList<>();
        List<Integer> O = new ArrayList<>();

        // Divide numbers into even and odd lists
        for (int i = 1; i <= N; i++) {
            if (i % 2 != 0) {
                O.add(i);
            } else {
                E.add(i);
            }
        }

        // Generate permutations of odd and even numbers and merge them
        do {
            do {
                res.add(merge(O, E));
                if (N % 2 == 0) {
                    res.add(merge(E, O));
                }
            } while (nextPermutation(O));
        } while (nextPermutation(E));

        // Sort the result list
        res.sort(Comparator.comparing(List::toString));
        return res;
    }

    // Helper method to generate the next permutation in lexicographic order
    private static boolean nextPermutation(List<Integer> list) {
        int i = list.size() - 2;
        while (i >= 0 && list.get(i) >= list.get(i + 1)) {
            i--;
        }
        if (i < 0) {
            return false;
        }

        int j = list.size() - 1;
        while (list.get(j) <= list.get(i)) {
            j--;
        }

        Collections.swap(list, i, j);
        Collections.reverse(list.subList(i + 1, list.size()));
        return true;
    }
}
