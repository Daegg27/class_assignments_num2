public class arrayassignment {



    static public void main(String[] args){


        char alphabet[] = {'G', 'F', 'E', 'D', 'C', 'B', 'A'};


        for (int i = 0; i < alphabet.length; i++){
            System.out.println(alphabet[i]);
        }

        System.out.println("\n Reverse!");
        System.out.print("\n");

        for (int i = alphabet.length - 1; i >= 0; i--){
            System.out.println(alphabet[i]);
        }
    }
    
}
