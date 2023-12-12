import java.util.Scanner;
import java.util.Random;

public class projecttwo {

    static String convertInt(int choice){ // Helper function with one parameter to avoid repeating code that converts the integer to a readable string value

        if (choice == 1){
            return "Rock";
        }
        else if (choice == 2){
            return "Paper";
        }
        else { // I can use an else statement because I am preventing the user from inputing anything besides 1-3 in the program (ln 46)
            return "Scissors";
        }
    }

    public static void main(String[] args){


        Random rand = new Random();
        Scanner newObj = new Scanner(System.in);

        int userChoice = 0; // Rock is 1, Paper is 2, Scissors is 3
        int cpuChoice = 0;

        int ties = 0;
        int userWins = 0;
        int CPUwins = 0;

        boolean playingGame = false;
        int continuePlaying = 0;

        System.out.print("Would you like to play a game? Enter '1' for yes and '2' for no: ");
        int startProgram = newObj.nextInt(); // User has option to begin program

        if (startProgram == 2){
            System.out.println("\nNo worries! Come back later.");
        }
        else if (startProgram == 1){

            playingGame = true;

            do {

                cpuChoice = rand.nextInt(3) + 1;
                System.out.print("\nPlease make your selection: Enter '1' for rock, '2' for paper, or '3' for scissors: ");
                userChoice = newObj.nextInt();
                if (userChoice < 1 || userChoice > 3){ // Checks for proper input from user
                    System.out.println("\nYou chose an unvalid option");
                    System.out.print("\nWould you like to try again? Enter '1' for yes or '2' for no: ");
                    continuePlaying = newObj.nextInt();
                    if (continuePlaying != 1){ // Either stops the program, or restarts the loop
                        System.out.println("\nEnding on a negative note is never good!");
                        playingGame = false;
                    }
                }
                else {

                    System.out.println("\nThe user has chosen: " + convertInt(userChoice)); // Uses proper variable for the argument
                    System.out.println("The computer has chosen: " + convertInt(cpuChoice)); 

                    if (userChoice == cpuChoice){ // Accounts for a tie 
                        System.out.println("\nThe game has ended in a tie");
                        ties++;
                    }
                    else if (userChoice == 1 && cpuChoice == 2){ // User has chosen Rock, CPU has chosen Paper
                        System.out.println("\nThe computer has won the game!");
                        CPUwins++;
                    }
                    else if (userChoice == 1 && cpuChoice == 3){ // User has chosen Rock, CPU has chosen Scissors
                        System.out.println("\nThe user has won the game!");
                        userWins++;
                    }
                    else if (userChoice == 2 && cpuChoice == 1){ // User has chosen Paper, CPU has chosen Rock
                        System.out.println("\nThe user has won the game!");
                        userWins++;
                    }
                    else if (userChoice == 2 && cpuChoice == 3){ // User has chosen Paper, CPU has chosen Scissors
                        System.out.println("\nThe computer has won the game!");
                        CPUwins++;
                    }
                    else if (userChoice == 3 && cpuChoice == 1){ // User has chosen Scissors, CPU has chosen Rock
                        System.out.println("\nThe computer has won the game!");
                        CPUwins++;
                    }
                    else if (userChoice == 3 && cpuChoice == 2){ // User has chosen Scissors, CPU has chosen Paper
                        System.out.println("\nThe user has won the game!");
                        userWins++;
                    }

                    System.out.println("\nWould you like to play again? Enter '1' for yes or '2' for no");
                    continuePlaying = newObj.nextInt();
                    if (continuePlaying != 1){
                        System.out.println("\nThank you for playing! (Ties: " + ties + " || User wins: " + userWins + 
                        " || CPU wins: " + CPUwins + ")");
                        playingGame = false;
                    }
                }
            }
            while(playingGame);
        }
        else {
            System.out.println("\nWrong decision");
        }
    }
    
}
