package easy;

import java.util.*;

/**
 * 20、有效的括号
 */
public class IsValid {
    public static void main(String[] args) {

    }

    static boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        final Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        final Deque<Character> stack = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            final char c = s.charAt(i);
            if (map.containsKey(c)) {
                if (stack.isEmpty() || stack.peek() != map.get(c)) {
                    return false;
                }
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
