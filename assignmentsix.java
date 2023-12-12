import java.util.Scanner;
import java.util.Random;

public class assignmentsix {



    static public void main(String[] args){

        Scanner newObj = new Scanner(System.in);
        Random rand = new Random();

        int oneThrough10 = 0; 
        int elevenThrough20 = 0;
        int twentyOneThrough30 = 0;
        int thirtyOneThrough40 = 0;
        int fourtyOneThrough50 = 0;
        int fiftyOneThrough60 = 0;
        int sixtyOneThrough70 = 0;
        int seventyOneThrough80 = 0;
        int eightyOneThrough90 = 0;
        int ninetyOneThrough100 = 0; // // Make shift arrays ^^^^


        
        System.out.print("How many numbers would you like to generate? ");
        int userInput = newObj.nextInt();

        for (int i = 0; i < userInput; i++){
            int generatedNumber = rand.nextInt(100) + 1;
            // System.out.println(generatedNumber); // Messy console when generating a lot lol

            if (generatedNumber > 0 && generatedNumber < 11){ // 1-10
                oneThrough10++;
            }
            else if (generatedNumber > 10 && generatedNumber < 21){ // 11-20
                elevenThrough20++;
            }
            else if (generatedNumber > 20 && generatedNumber < 31){ // 21-30
                twentyOneThrough30++;
            }
            else if (generatedNumber > 30 && generatedNumber < 41){ // 31-40
                thirtyOneThrough40++;
            }
            else if (generatedNumber > 40 && generatedNumber < 51){ // 41-50
                fourtyOneThrough50++;
            }
            else if (generatedNumber > 50 && generatedNumber < 61){ // 51-60
                fiftyOneThrough60++;
            }
            else if (generatedNumber > 60 && generatedNumber < 71){ // 61-70
                sixtyOneThrough70++;
            }
            else if (generatedNumber > 70 && generatedNumber < 81){ // 71-80
                seventyOneThrough80++;
            }
            else if (generatedNumber > 80 && generatedNumber < 91){ // 81-90
                eightyOneThrough90++;
            }
            else {
                ninetyOneThrough100++;
            }

        }

        System.out.println("\n" + "1-10: " + oneThrough10);
        System.out.println("11-20: " + elevenThrough20);
        System.out.println("21-30: " + twentyOneThrough30);
        System.out.println("31-40: " + thirtyOneThrough40);
        System.out.println("41-50: " + fourtyOneThrough50);
        System.out.println("51-60: " + fiftyOneThrough60);
        System.out.println("61-70: " + sixtyOneThrough70);
        System.out.println("71-80: " + seventyOneThrough80);
        System.out.println("81-90: " + eightyOneThrough90);
        System.out.println("91-100: " + ninetyOneThrough100);
        System.out.print("\n");

        String starHolder = ""; // If the number is zero, the loop will not trigger, and the graph will display nothing.
        for (int i = 0; i < oneThrough10; i++){
            starHolder += "*";
        }
        System.out.println("1-10   | " + starHolder);

        starHolder = ""; // Resets back to blank
        for (int i = 0; i < elevenThrough20; i++){
            starHolder += "*";
        }
        System.out.println("11-20  | " + starHolder);

        starHolder = "";
        for (int i = 0; i < twentyOneThrough30; i++){
            starHolder += "*";
        }
        System.out.println("21-30  | " + starHolder);

        starHolder = "";
        for (int i = 0; i < thirtyOneThrough40; i++){
            starHolder += "*";
        }
        System.out.println("31-40  | " + starHolder);

        starHolder = "";
        for (int i = 0; i < fourtyOneThrough50; i++){
            starHolder += "*";
        }
        System.out.println("41-50  | " + starHolder);

        starHolder = "";
        for (int i = 0; i < fiftyOneThrough60; i++){
            starHolder += "*";
        }
        System.out.println("51-60  | " + starHolder);

        starHolder = "";
        for (int i = 0; i < sixtyOneThrough70; i++){
            starHolder += "*";
        }
        System.out.println("61-70  | " + starHolder);

        starHolder = "";
        for (int i = 0; i < seventyOneThrough80; i++){
            starHolder += "*";
        }
        System.out.println("71-80  | " + starHolder);

        starHolder = "";
        for (int i = 0; i < eightyOneThrough90; i++){
            starHolder += "*";
        }
        System.out.println("81-90  | " + starHolder);

        starHolder = "";
        for (int i = 0; i < ninetyOneThrough100; i++){
            starHolder += "*";
        }
        System.out.println("91-100 | " + starHolder);
        



    }
    
}
