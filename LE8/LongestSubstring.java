import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public static int findLengthOfLongestSubstring(String s) {
        int n = s.length();

        if (n == 0)
            return 0;

        int maxLength = 0;
        int left = 0;
        int right = 0;
        Set<Character> set = new HashSet<>();

        while (right < n) {
            if (!set.contains(s.charAt(right))) {
                maxLength = Math.max(maxLength, right - left + 1);
                set.add(s.charAt(right++));
            } else
                set.remove(s.charAt(left++));
        }

        return maxLength;
    }
}