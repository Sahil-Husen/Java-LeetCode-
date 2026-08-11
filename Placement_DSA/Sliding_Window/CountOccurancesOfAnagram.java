package Sliding_Window;

public class CountOccurancesOfAnagram {

    public static boolean allZero(int[] arr) {
        for (int i : arr) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    public static int countOccurancesOfAnagram(String str, String pat) {
        int patLen = pat.length();
        int strLen = str.length();

        int arr[] = new int[26]; // only lowercase letters

        // counts the frequency of each character in pattern string
        for (int i = 0; i < patLen; i++) {
            char ch = pat.charAt(i);
            arr[ch - 'a']++;
        }

        int i = 0, j = 0, result = 0;

        while (j < strLen) {
            arr[str.charAt(j) - 'a']--;

            int length = j - i + 1;
            if (length == patLen) {
                if (allZero(arr)) {
                    result++;
                }
                arr[str.charAt(i) - 'a']++;
                i++;
            }
            // j will be always increase
            j++;
        }

        return result;
    }

    public static void main(String[] args) {
        String str = "forxxorfxdofr";
        String pat = "fox";
        my m = new my();

        // System.out.println(countOccurancesOfAnagram(str, pat));
        System.out.println(m.countOccurance(str, pat));
    }
}

class my {

    public static boolean allZeros(int[] arr) {
        for (int i : arr) {
            if (i != 0) {
                return false;
            }
        }

        return true;
    }

    public int countOccurance(String str, String ptn) {

        /*
         * str = foxxdroxf
         * ptn = fox
         */

        int strLen = str.length();
        int ptnLen = ptn.length();
        int arr[] = new int[26];

        // counted the frequency of the characters
        for (int i = 0; i < ptnLen; i++) {
            char ch = ptn.charAt(i);
            arr[ch - 'a']++;
        }

        int i = 0;
        int j = 0;
        int result = 0;

        while (j < strLen) {

            arr[str.charAt(i) - 'a']--;

            int length = j - i + 1;
            if (length == ptnLen) {
                if (allZeros(arr)) {
                    result++;
                }
                arr[str.charAt(i) - 'a']++;

                i++;

            }
            j++;

        }

        return result;

        //

    }
}