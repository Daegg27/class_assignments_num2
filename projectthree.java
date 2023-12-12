import java.util.Scanner;

public class projectthree {


    static public void main(String[] args){

        Scanner newObj = new Scanner(System.in);
        int numbersWanted;
        int sum = 0;
        int product = 1;
        boolean playingGame = false;

        System.out.print("Would you like to do some math? Enter '1' for yes and '2' for no: ");
        int startPlaying = newObj.nextInt();

        if (startPlaying == 1){
            playingGame = true;
            do {
            
            System.out.print("Would you like to add or multiply? Enter 'stop' to quit: ");
            String userInput = newObj.next();

            if (userInput.toLowerCase().equals("stop")){
                System.out.println("Have a good day!");
                playingGame = false;
            }
            else if (userInput.toLowerCase().equals("add")){
                System.out.print("How many numbers would you like to add? ");
                numbersWanted = newObj.nextInt();
                for (int i = 0; i < numbersWanted; i++){
                    System.out.print("Please enter a number: ");
                    int newNum = newObj.nextInt();
                    sum += newNum;
                }
                System.out.println("\nThe sum is: " + sum + "\n");
            }
            else if (userInput.toLowerCase().equals("multiply")){
                System.out.print("How many numbers would you like to multiply? ");
                numbersWanted = newObj.nextInt();
                for (int i = 0; i < numbersWanted; i++){
                    System.out.print("Please enter a number: ");
                    int newNum = newObj.nextInt();
                    product *= newNum;
                }
                System.out.println("\nThe product is: " + product + "\n");
            }
            else {
                System.out.println("Try Again!");  
            }
            sum = 0;
            product = 1;

        }
        while (playingGame);

        }
        else {
            System.out.println("No worries!");
        }


    }
    
}
