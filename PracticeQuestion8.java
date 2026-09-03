import java.util.PriorityQueue;
public class PracticeQuestion8 {

    public static void main(String[] args) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : new int[]{12, 45, 3, 67, 21}) {
            minHeap.add(num);
            if (minHeap.size() > 2){
                minHeap.poll();
            }
        }
        System.out.println("Second Largest Element = " + minHeap.peek());

        // int[] arr = {12, 45, 3, 67, 21};

        // Arrays.sort(arr);

        // System.out.println("Second Largest Element = " + arr[arr.length - 2]);

        // int largest = Integer.MIN_VALUE;
        // int secondLargest = Integer.MIN_VALUE;

        // for (int i = 0; i < arr.length; i++)  {

        //     if (arr[i] > largest) {

        //         secondLargest = largest;
        //         largest = arr[i];

        //     } else if (arr[i] > secondLargest && arr[i] != largest) {

        //         secondLargest = arr[i];
        //     }
        // }

        // System.out.println("Second Largest Element = " + secondLargest);
    }
}