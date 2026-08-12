package Sliding_Window;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringKDistinct {
    public static int longestSubstring(String s, int k) {
        int low = 0;
        int max = -1;

        Map<Character, Integer> map = new HashMap<>();

        for (int high = 0; high < s.length(); high++) {
            map.put(s.charAt(high), map.getOrDefault(s.charAt(high), 0) + 1);

            while (map.size() > k) {

                char leftchar = s.charAt(low);

                map.put(leftchar, map.get(leftchar)-1);

                if (map.get(leftchar) == 0) {
                    map.remove(leftchar);
                }
                low++;

            }

            if (map.size() == k) {
                int len = high - low + 1;
                max = Math.max(max, len);
            }

          
        }
          return max;
    }

    public static void main(String[] args) {
        String str = "aabaaab";
        System.out.println(longestSubstring(str, 2));

    }

}