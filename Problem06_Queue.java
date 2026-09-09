import java.util.LinkedList;
import java.util.Queue;

public class Problem06_Queue {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();


        queue.offer(10);
        queue.offer(20);
        queue.offer(30);


        System.out.println("Queue: " + queue);


        int removed = queue.poll();

        System.out.println("Polled: " + removed);


        System.out.println("Peek: " + queue.peek());


        System.out.println("Queue after operations: " + queue);
    }
}