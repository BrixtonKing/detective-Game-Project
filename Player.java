import java.util.Scanner;

public class Player extends Person{
    // player is the detective from the sheet

    // instance variables
    private boolean validInput;

    public Player(){
        super();
    }
    public Player(String name, int age, String height, boolean isMale, double weight){
        super(name,  age,  height,  isMale,  weight);
    }

    public void investigate(Person x){
        System.out.println("smth intresting about investgating or smth like that");
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("What would you like to do\n1. Hear their alibi\n2. Get physical details\n3. chit-chat with them");
        String userInput = scanner1.nextLine();
        Boolean validInput = Tools.validate(userInput, 3);
        // validate needs work to condense code/create larger simplicity
        while(validInput == false){
            System.out.println("Input one of the choices from above by typing the number: ");
            userInput = scanner1.nextLine();
            validInput = Tools.validate(userInput, 3);
        }
        
    }
}
