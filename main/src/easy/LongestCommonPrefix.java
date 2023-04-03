package easy;

/**
 * 14、最长公共前缀
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"ab", "a"};
        longestCommonPrefix(strs);
    }

    static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        //从最短的字符串中找
        String minStr = strs[0];
        for (String str : strs) {
            if (minStr.length() >= str.length()) {
                minStr = str;
            }
        }

        for (int i = minStr.length() - 1; i >= 0; i--) {
            boolean flag = true;
            for (String str : strs) {
                if (!str.substring(0, i + 1).equals(minStr)) {
                    minStr = minStr.substring(0, i);
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return minStr;
            }
        }
        return "";
    }
}
