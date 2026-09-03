// 1. Finding the "Odd One Out" (The Cancellation Trick)
// 2. Finding the Missing Number in a Range
// 3. Toggling or Flipping Bits
// 4. Swapping Two Variables (Without a Temp Variable)

public class XOR {

    public static void main(String[] args) {
        // int[] arr = {2,4,3,2,4};
        // int result = 0;

        // for (int num : arr){
        //     result = result ^ num;
        // }
        // System.out.print(result);



        // int[] arr = {1,2,3,5};
        // int result =0;
        // int size = 5;

        // for (int i = 1;i<=size;i++){
        //     result = result ^ i;
        // }

        // for(int num : arr){
        //     result = result ^ num;
        // }
        // System.out.print(result);

        // int a = 10;
        // int b = 20;

        // a = a^ b;
        // b = a^ b;
        // a = a^b;
        // System.out.print(a + " " + b);


        //Q. check whether the number is the power of 2 or not 
        int n = 16;
        boolean reurn = (n & (n-1)) == 0;
        System.out.print(reurn);
    }
}