package easy;

/**
 * 2、回文数
 */
public class Palindrome {
    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome2(121));
        ;
    }

    static boolean isPalindrome1(int x) {
        String s = String.valueOf(x);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            stringBuilder.append(s.charAt(i));
        }
        return s.contentEquals(stringBuilder);
    }

    static boolean isPalindrome2(int x) {

        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }


        int reverseNumber = 0;
        while (x > reverseNumber) {
            reverseNumber = (reverseNumber * 10) + (x % 10);
            x /= 10;
        }
        return reverseNumber == x || x == reverseNumber / 10;
    }
}
