import java.util.*;
class Valid_Paranthesis {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] a = s.toCharArray();

        for(char c:a){
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            } else if (c == ']') {
                if (stack.isEmpty() || stack.pop() != '[') {
                    return false;
                }
            } else if (c == '}') {
                if (stack.isEmpty() || stack.pop() != '{') {
                    return false;
                }

            }

        }
        return stack.isEmpty();
    }
}