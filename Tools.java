import java.util.Scanner;

public class Tools {
    public static boolean validate(String x, int numOfChoices){
        // this never has an error since if there is an error in the try it will just return false rather than erroring
        try {
            int r = Integer.valueOf(x);
                if(r >= 1 && r <= numOfChoices){
                    return true;
                }
        } catch (Exception e) {}
        return false;
    }
    public static int validatedInput(String x, int numOfChoices){
        // uses method above
        // int y is temporary variable which is returned
        // String x is original user input
        Scanner scanner1 = new Scanner(System.in);
        while(!validate(x, numOfChoices)){
            System.out.println("Input one of the choices from above by typing ONLY the number: ");
            x = scanner1.nextLine();
        }
        int y = Integer.valueOf(x);
        return y;
    }

}
