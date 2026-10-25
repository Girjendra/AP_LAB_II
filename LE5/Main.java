import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

// TC : O(n * TC(isTaxicabNumber(i))) SC : O(1)
// This class will be used for first 3 approaches present in TaxicabNumber.java file
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the value of n: ");
//         int n = sc.nextInt();

//         for(int i = 1; i <= n; i++) {
//             HashMap<Integer, ArrayList<ArrayList<Integer>>> map = TaxicabNumber.isTaxicabNumber(i);
//             if(map.get(i).size() > 1) {
//                 System.out.print(i + " = ");
//                 for(ArrayList<Integer> it : map.get(i))
//                     System.out.print(it + ", ");
                
//                 System.out.println();
//             }
//         }

//         sc.close();
//     }
// }









// TC : O(n^(2/3)) = O(n^(0.667)) SC : O(1)
// This class don't use any of the approaches present in TaxicabNumber.java file
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        long n = sc.nextLong();
        int cb = (int) Math.cbrt(n);

        // HashMap<Long, ArrayList<ArrayList<Integer>>> ans = new HashMap<>();
        TreeMap<Long, ArrayList<ArrayList<Integer>>> ans = new TreeMap<>(); // Using TreeMap to sort the keys in ascending order
        
        for(int a = 1; a <= cb; a++) {
            for(int b = a; b <= cb; b++) {
                if(a * a * a + b * b * b <= n) {
                    long sum = (long) a * a * a + (long) b * b * b;
                    if(!ans.containsKey(sum))
                        ans.put(sum, new ArrayList<>());
                
                    ArrayList<Integer> pair = new ArrayList<>();
                    pair.add(a);
                    pair.add(b);
                    ans.get(sum).add(pair);
                }
            }
        }

        for(Map.Entry<Long, ArrayList<ArrayList<Integer>>> entry : ans.entrySet()) {
            if(entry.getValue().size() > 1) {
                System.out.print(entry.getKey() + " = ");
                for(ArrayList<Integer> it : entry.getValue())
                    System.out.print(it + ", ");
                
                System.out.println();
            }
        }

        sc.close();
    }
}