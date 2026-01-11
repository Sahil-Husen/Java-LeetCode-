package String;

import java.util.Stack;

public class ParanthesisMatching {
    public static void main(String[] args) {
        String str = "{(])";
        System.out.println(isMatched(str));
    }

    static boolean isMatched(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {

            if (ch == '(' || ch == '{' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.empty())
                    return false;
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '['))
                    return false;
            }

        }
        return stack.empty();
    }
}
