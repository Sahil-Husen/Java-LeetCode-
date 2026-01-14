
public class PangramChecker {

    public static boolean checkIfPangram(String sentence) {

        // Step 1: Create a boolean array for 26 letters
        boolean[] seen = new boolean[26];

        // Step 2: Traverse the string
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            // Map character to index (a → 0, b → 1, ..., z → 25)
            seen[ch - 'a'] = true;
        }

        // Step 3: Check if all letters are present
        for (boolean value : seen) {
            if (!value) {
                return false;
            }
        }

        return true;
    }

    // Main method for testing
    public static void main(String[] args) {
        String sentence1 = "thequickbrownfoxjumpsoverthelazydog";
        String sentence2 = "leetcode";

        System.out.println(checkIfPangram(sentence1)); // true
        System.out.println(checkIfPangram(sentence2)); // false
    }
}
