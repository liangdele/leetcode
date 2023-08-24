package match;

/**
 * 最小偶倍数
 */
public class MinimumEvenMultiple {
    public static void main(String[] args) {

    }

    private int minimumEvenMultiple(int n) {
        if (n % 2 != 0) {
            return 2 * n;
        }else {
            return n;
        }
    }
}
