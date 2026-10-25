import java.util.ArrayList;
import java.util.HashMap;


// TC : O(n^4) SC : O(1)
// public class TaxicabNumber {
//     public static HashMap<Integer, ArrayList<ArrayList<Integer>>> isTaxicabNumber(int n) {
//         HashMap<Integer, ArrayList<ArrayList<Integer>>> ans = new HashMap<>();
//         ans.put(n, new ArrayList<>());
//         for(int a = 1; a <= n; a++) {
//             for(int b = 1; b <= n; b++) {
//                 for(int c = 1; c <= n; c++) {
//                     for(int d = 1; d <= n; d++) {
//                         if(a * a * a + b * b * b == c * c * c + d * d * d && a * a * a + b * b * b == n && a != c && a != d && b != c && b != d) {
//                             ArrayList<Integer> pair = new ArrayList<>();
//                             pair.add(a);
//                             pair.add(b);
//                             Collections.sort(pair);
//                             ans.get(n).add(pair);
//                         }
//                     }
//                 }
//             }
//         }

//         return ans;
//     }
// }









// TC : O(n^2) SC : O(1)
// public class TaxicabNumber {
//     public static HashMap<Integer, ArrayList<ArrayList<Integer>>> isTaxicabNumber(int n) {
//         HashMap<Integer, ArrayList<ArrayList<Integer>>> ans = new HashMap<>();
//         ans.put(n, new ArrayList<>());
//         for(int a = 1; a <= n; a++) {
//             for(int b = 1; b <= n; b++) {
//                 if((long) a * a * a + (long) b * b * b == n) {
//                     ArrayList<Integer> pair = new ArrayList<>();
//                     pair.add(a);
//                     pair.add(b);
//                     Collections.sort(pair);
//                     if(!ans.get(n).contains(pair))
//                         ans.get(n).add(pair);
//                 }
//             }
//         }

//         return ans;
//     }
// }









// TC : O(n^(2/3)) = O(n^(1.667)) SC : O(1)
public class TaxicabNumber {
    public static HashMap<Integer, ArrayList<ArrayList<Integer>>> isTaxicabNumber(int n) {
        HashMap<Integer, ArrayList<ArrayList<Integer>>> ans = new HashMap<>();
        ans.put(n, new ArrayList<>());
        for(int a = 1; a <= Math.cbrt(n); a++) {
            for(int b = a; b <= Math.cbrt(n); b++) {
                if(a * a * a + b * b * b == n) {
                    ArrayList<Integer> pair = new ArrayList<>();
                    pair.add(a);
                    pair.add(b);
                    ans.get(n).add(pair);
                }
            }
        }

        return ans;
    }
}