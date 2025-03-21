import java.util.Scanner;

public class Player extends Person{

    // instance variables
    
    public Player(){
        super();
    }
    public Player(String name, int age, String height, boolean isMale, double weight){
        super(name,  age,  height,  isMale,  weight);
    }

    public void investigate(Person x){
        System.out.println("smth intresting about investgating or smth like that");
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("What would you like to do\n1. Hear their alibi\n2. Get physical details\n 3. Talk with them");
        String userInput = scanner1.nextLine();
        Tools.validate();
        
    }
}
