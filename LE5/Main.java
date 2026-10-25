import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

// TC : O(n * TC(isTaxicabNumber(i))) SC : O(1)
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            HashMap<Integer, ArrayList<ArrayList<Integer>>> map = TaxicabNumber.isTaxicabNumber(i);
            if(map.get(i).size() > 1) {
                System.out.print(i + " = ");
                for(ArrayList<Integer> it : map.get(i))
                    System.out.print(it + ", ");
                
                System.out.println();
            }
        }

        sc.close();
    }
}