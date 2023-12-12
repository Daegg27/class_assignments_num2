import java.util.Scanner;

public class rectangledriver {


    static public void main(String[] args){

        Scanner newObj = new Scanner(System.in);

        rectangle rectangleOne = new rectangle(); // Keep forgetting to capitilize the class name :P 
        System.out.println(rectangleOne);

        rectangle rectangleTwo = new rectangle(12, 6);
        
        System.out.println("\nRectangle two has an area of " + rectangleTwo.getArea() + "\n");

        System.out.print("What would you like to change the length of your rectangle(length: " + rectangleTwo.getLength() + ") to? Enter '0' to keep the same! ");
        int userInput = newObj.nextInt();
        if (userInput == 0 || userInput == rectangleTwo.getLength()){
            System.out.println("You have decided to keep the length of " + rectangleTwo.getLength());
        }
        else if (userInput < 0){
            System.out.println("The length must be greater than 0");
        }
        else {
            rectangleTwo.setLength(userInput);
        }
        System.out.println("\nWhat would you like to change the width of your rectangle(width: " + rectangleTwo.getWidth() +") to? Enter '0' to keep the same! ");
        userInput = newObj.nextInt();
        if (userInput == 0 || userInput == rectangleTwo.getWidth()){
            System.out.println("You have decided to keep the width of " + rectangleTwo.getWidth());
        }
        else if (userInput < 0){
            System.out.println("The width must be greater than 0");
        }
        else {
            rectangleTwo.setWidth(userInput);
        }
        System.out.println("\nRectangle two(length: " + rectangleTwo.length + " width: " + rectangleTwo.getWidth() + 
        ") now has an area of " + rectangleTwo.getArea());
        
    }
    
}
