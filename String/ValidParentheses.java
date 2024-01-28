package String;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {

        String s = "()[{}";

        System.out.println(isValidUsingStack(s));
        System.out.println(isValidUsingStack2(s));
        System.out.println(isValidUsingStack3(s));
    }

    static boolean isValidUsingStack(String s) {
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);

            if (map.keySet().contains(curr)) {
                stack.push(curr);
            } else if (map.values().contains(curr)) {
                char top = stack.empty() ? '#' : stack.peek();
                if (!stack.empty() && map.get(top) == curr) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.empty();
    }

    static boolean isValidUsingStack2(String s) {
        Stack<Character> stack = new Stack<Character>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }

        return stack.isEmpty();
    }

    static boolean isValidUsingStack3(String s) {
        Stack<Character> stack = new Stack<Character>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);

            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();

            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();

            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();

            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }

}
