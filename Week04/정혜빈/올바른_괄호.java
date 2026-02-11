import java.util.*;

class Solution {
    boolean solution(String s) {
        List<Character> stack = new ArrayList<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.add(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.remove(stack.size() - 1);
            }
        }

        return stack.isEmpty();
    }
}
