import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String text = "cbaebabacd";
        String pat = "abc";

        ArrayList<Integer> result = FindAllPermutations.findAllPermutations(text, pat);
        System.out.println("All permutations of '" + pat + "' in '" + text + "': " + result); // 
    }
}