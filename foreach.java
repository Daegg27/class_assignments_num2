import java.util.Scanner;


public class foreach {


    static public void main(String[] args){

        Scanner newObj = new Scanner(System.in);
        
        System.out.print("Please enter a word: ");
        String userInput = newObj.nextLine();

        for (char letter : userInput.toCharArray()){
            System.out.println(letter);
        }

    }
    
}
