package easy;

/**
 * 无重复字符的最长子串
 */
public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        String[] a = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(a));
    }

    static String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }
        if (strs.length < 2) {
            return "";
        }

        String minStr = strs[0];
        for (String str : strs) {
            if (minStr.length() > str.length()) {
                minStr = str;
            }
        }

        String current = minStr;
        for (int i = minStr.length(); i > 0; i--) {
            boolean flag = true;
            for (String str : strs) {
                if (!str.contains(current)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return current;
            }
            current = minStr.substring(0, i);
        }
        return "";
    }
}
