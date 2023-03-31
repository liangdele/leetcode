package easy;

/**
 * 2、回文数
 */
public class Palindrome {
    public static void main(String[] args) {
        Palindrome.isPalindrome1(121);
    }

    static boolean isPalindrome1(int x) {
        String s = String.valueOf(x);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            stringBuilder.append(s.charAt(i));
        }
        return s.contentEquals(stringBuilder);
    }

//    static boolean isPalindrome2(int x) {
//        if (x < 0) {
//            return false;
//        }
//        String s = String.valueOf(x);
//        int length = s.length();
//        if (length / 2 == 0) {
//
//        }
//    }
}
