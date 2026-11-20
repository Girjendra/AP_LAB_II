import java.util.ArrayList;
import java.util.Arrays;

public class FindAllPermutations {
    public static ArrayList<Integer> findAllPermutations(String text, String pat) {
        ArrayList<Integer> ans = new ArrayList<>();

        if (pat.isEmpty() || text.length() < pat.length())
            return ans;

        int[] patfreq = new int[26];
        for (char ch : pat.toCharArray())
            patfreq[ch - 'a']++;

        int[] tempfreq = new int[26];
        int i = 0, j = 0;
        while(j < text.length()) {
            if(j < pat.length())
                tempfreq[text.charAt(j++) - 'a']++;
            else {
                if(Arrays.equals(tempfreq, patfreq))
                    ans.add(i);

                tempfreq[text.charAt(i++) - 'a']--;
                tempfreq[text.charAt(j++) - 'a']++;
            }
        }

        if(Arrays.equals(tempfreq, patfreq))
            ans.add(i);

        return ans;
    }
}