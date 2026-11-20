public class Main {
    public static void main(String[] args) {
        String str = "abcabcbb";
        int ans = LongestSubstring.findLengthOfLongestSubstring(str);
        System.out.println("The length of the longest substring without repeating characters is: " + ans);
    }
}