public class fixarray {


    public static void main(String[] args){

        int[] arr = {28, 26, 29, 20, 31, 17, 22, 27, 25, 27};

        System.out.print("\nOriginal Array:");
        for (int i = 0; i < arr.length; i++){
            System.out.print(" " + arr[i]);
        }
        System.out.print("\n");
        
        int temp = arr[2];
        arr[2] = arr[7];
        arr[7] = temp;

        System.out.print("Changed Array:");
        for (int i = 0; i < arr.length; i++){
            System.out.print(" " + arr[i]);
        }
    }
}
