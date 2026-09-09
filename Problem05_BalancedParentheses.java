import java.util.Stack;

public class Problem05_BalancedParentheses {

    static boolean isBalanced(String expression) {

        Stack<Character> stack = new Stack<>();


        for (char ch : expression.toCharArray()) {

            // Opening brackets
            if (ch == '(' || ch == '[' || ch == '{') {

                stack.push(ch);
            }

            // Closing brackets
            else if (ch == ')' || ch == ']' || ch == '}') {

                if (stack.isEmpty()) {

                    return false;
                }


                char opening = stack.pop();


                if (ch == ')' && opening != '(') {

                    return false;
                }


                if (ch == ']' && opening != '[') {

                    return false;
                }


                if (ch == '}' && opening != '{') {

                    return false;
                }
            }
        }


        return stack.isEmpty();
    }


    public static void main(String[] args) {

        String expression = "{[()]}";


        if (isBalanced(expression)) {

            System.out.println("Balanced");

        } else {

            System.out.println("Not Balanced");
        }
    }
}