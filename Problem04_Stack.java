import java.util.Stack;

public class Problem04_Stack {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();


        stack.push(10);
        stack.push(20);
        stack.push(30);


        System.out.println("Stack: " + stack);


        int removed = stack.pop();

        System.out.println("Popped: " + removed);


        System.out.println("Peek: " + stack.peek());


        System.out.println("Stack after operations: " + stack);
    }
}