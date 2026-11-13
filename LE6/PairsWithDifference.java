// // TC : O(n^2) SC : O(1)
// public class PairsWithDifference {
//     public static int findPairsWithDifference(int[] arr, int k) {
//         int count = 0;
//         for(int i = 0; i < arr.length; i++) {
//             for(int j = i + 1; j < arr.length; j++) {
//                 if(Math.abs(arr[i] - arr[j]) == k)
//                     count++;
//             }
//         }

//         return count;
//     }
// }

import java.util.HashMap;
import java.util.Map;

// // TC : O(nlogn) SC : O(1)
// public class PairsWithDifference {
//     public static int findPairsWithDifference(int[] arr, int k) {
//         Arrays.sort(arr);
//         int n = arr.length;
//         int count = 0;
//         int i = 0;
//         int j = 0;
        
//         while(j < n) {
//             if(arr[j] - arr[i] > k)
//                 i++;
//             else if(arr[j] - arr[i] < k)
//                 j++;
//             else {
//                 int n1 = arr[i], n2 = arr[j];
//                 int c1 = 0, c2 = 0;
                
//                 while(i < n && arr[i] == n1) {
//                     i++;
//                     c1++;
//                 }
                
//                 while(j < n && arr[j] == n2) {
//                     j++;
//                     c2++;
//                 }
                
//                 if(n1 == n2)
//                     count += c1 * (c1 - 1) / 2;
//                 else
//                     count += c1 * c2;
//             }
//         }

//         return count;
//     }
// }










// TC : O(n) SC : O(n)
public class PairsWithDifference {
    public static int findPairsWithDifference(int[] arr, int k) {
        int n = arr.length;
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < n; i++) {
            if(map.containsKey(arr[i] + k))
                count += map.get(arr[i] + k);
                
            if(map.containsKey(arr[i] - k))
                count += map.get(arr[i] - k);
                
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        
        return count;
    }
}