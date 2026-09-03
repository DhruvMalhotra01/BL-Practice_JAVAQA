import java.util.*;

public class SnakeLadder{

    public static void Game(){
        
        int position  = 0;
        int steps = 0;

        Random r = new Random();

             // Snakes
        int[] snakeStart = {99, 95, 92, 70, 64, 62, 56, 49, 47, 16};
        int[] snakeEnd   = {54, 75, 35, 55, 36, 19,  1, 11, 26,  6};

        // Ladders
        int[] ladderStart = {2, 7, 8, 15, 21, 28, 36, 51, 71, 78};
        int[] ladderEnd   = {38, 14, 31, 26, 42, 84, 44, 67, 91, 98};

        while ( position < 100){
            int dice = r.nextInt(6) + 1;
            System.out.println("Dice rolled: " + dice);
            steps++;

            if(position + dice <= 100){
                position +=dice;
            }
            for(int i = 0 ;i < snakeStart.length; i++){
                if(position == snakeStart[i]){
                    position = snakeEnd[i];
                    System.out.println("Oops! Snake bite! Back to " + position);
                }else if(position == ladderStart[i]){
                    position = ladderEnd[i];
                    System.out.println("Yay! Climb the ladder! Move to " + position);
                }
            }
        
        System.out.println("Current Position: " + position);
        }
        
        System.out.println("Congratulations! You reached the end.");
        System.out.println("Total steps taken: " + steps);

        
    }
    public static void main(String[] args){
        System.out.println("=====================================");
        System.out.println("Welcome to Snake and Ladder Game");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the player1 name:");
        String name1 = sc.nextLine();
        System.out.print("Enter the Player2 name:");
        String name2 = sc.nextLine();

        System.out.println("Player1 begins.. " + name1);
        Game();
 

    }
}