public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 4, 2};
        int  k = 2;

        System.out.println("Pairs with absolute difference of " +
                            k + ": " + PairsWithDifference.findPairsWithDifference(arr, k));
    }
}