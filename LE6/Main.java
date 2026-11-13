import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements of the array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println("Enter the value of k: ");
        int  k = sc.nextInt();

        System.out.println("Pairs with absolute difference of " +
                            k + ": " + PairsWithDifference.findPairsWithDifference(arr, k));
        
        sc.close();
    }
}