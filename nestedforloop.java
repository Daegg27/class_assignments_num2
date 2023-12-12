public class nestedforloop {

    public static void main(String[] args){

        for (int i = 1; i < 13; i++){
            for (int x = 1; x < 13; x++){
                int currentSum = i * x;
                System.out.print(" " + currentSum);
            }
            System.out.println("\n");
        }
    }
    
}
