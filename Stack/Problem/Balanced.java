import java.util.Stack;


public class Balanced {
    static boolean checkBalanced(String expr) {
        Stack<Character> stack = new Stack<Character>();
       // Deque<Character> stack = new ArrayDeque<Character>();
        for (int i = 0; i < expr.length(); i++) {
            char c = expr.charAt(i);
            // if (stack.isEmpty()) {
            //     return false;
            // } 
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
                continue;
            }

            if (stack.isEmpty()) {
                return false;
            } 

            char check;
            switch (c) {
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[') {
                        return false;
                    }
                    break;

                case '}':
                    check = stack.pop();
                    if (check == '[' || check == '(') {
                        return false;
                    }
                    break;

                case ']':
                    check = stack.pop();
                    if (check == ')' || check == '}') {
                        return false;
                    }
                    break;
            }
        }
        return (stack.isEmpty());
    }

    public static void main(String[] args) {
        String expr = "([{}])";
        boolean result = checkBalanced(expr);
        // Function call
        if (result)
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }
}
