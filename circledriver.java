import java.util.Scanner;

public class circledriver {


    static public void main(String[] args){

        Scanner newObj = new Scanner(System.in);
        circle circleOne = new circle(); // Forgot to capitilize the class

        System.out.println("The radius of circle one is " + circleOne.getRadius());

        System.out.print("How big of a radius would you like your circle to have? ");
        int userInput = newObj.nextInt();

        circle circleTwo = new circle(userInput);

        System.out.print("Circle two has a radius of " + circleTwo.getRadius() + " initially.");
        System.out.print(" Which makes a diameter of " + circleTwo.getDiameter());
        System.out.println(", and an area of " + circleTwo.getArea());

        System.out.print("\nWhat would you like the new radius to be? Enter '0' for no change ");
        userInput = newObj.nextInt();
        if (userInput == 0 || userInput == circleTwo.getRadius()){
            System.out.println("You have decided to keep the radius of " + circleTwo.getRadius());
        }
        else if (userInput < 0){
            System.out.println("Circles can not have a radius less than 0");
        }
        else {
            circleTwo.setRadius(userInput);
            System.out.println("Circle two now has a radius of " + circleTwo.getRadius());
            System.out.println("\n" + circleTwo);
        }

    }
    
}
