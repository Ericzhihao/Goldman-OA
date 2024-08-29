package goldman;

public class Main {
    public static void main(String[] args) {
        areaOfBox ab = new areaOfBox();
        int[][] queries = {{5, 3}};
        int[] ans = ab.numberOfWays(queries);

        for(int res : ans){
            System.out.println(res);
        }
    }
}
