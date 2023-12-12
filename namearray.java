import java.util.Scanner;


public class namearray {


    static public void main(String[] args){

        Scanner newObj = new Scanner(System.in);
        String presetNames[] = {"Dalton", "John", "Jade", "Micah", "Anthony"};

        System.out.print("What is your name? ");
        String userInput = newObj.nextLine();

        for (int i = 0; i < presetNames.length; i++){
            if (userInput.equals(presetNames[i])){
                System.out.println("\nYou have a generic name!\n");
            }
        }

        for (String name : presetNames){
            if (!name.equals("Anthony")){
                System.out.print(name + ", ");
            }
            else {
                System.out.print("and " + name);
            }
        }
    }
    
}
