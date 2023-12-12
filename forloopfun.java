import java.util.Scanner;

public class forloopfun {


    public static void main(String[] args){

        Scanner newObj = new Scanner(System.in);


        System.out.print("Enter a number between 1-20: ");
        int userChoice = newObj.nextInt();

        if (userChoice < 1 || userChoice > 20){
            System.out.println("\nTry again");
        }
        else{
            System.out.print("Numerical Order:");
            for (int i = 1; i <= userChoice; i++){
                System.out.print(" " + i);
            }

            System.out.print("\nEven Numbers:");
            for (int i = 1; i <= userChoice; i++){
                if (i % 2 == 0){
                    System.out.print(" " + i);
                }
            }
            System.out.print("\nStrings:");
            for (int i = 1; i <= userChoice; i++){
                if (i % 2 == 0){
                    System.out.print(" " + i);
                }
                else {
                    System.out.print(" odd");
                }
            }
        }

    }
    
}
