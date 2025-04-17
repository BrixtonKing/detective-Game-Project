import java.util.ArrayList;
import java.util.Scanner;
// for final project we can add onto this by adding visuals and using the api key from chatgpt to create the storys

// Mr. Thai feedback 4/17/25: "set the stage" + bug fixxing

public class Main {
    public static void main (String[] args){

        // testing code
        Person brixton = new Person("Brixton", 16, "6'0", true, 100000.1);
        
        Player allen = new Player();

        detectiveAgency game = new detectiveAgency(7, allen);

        ArrayList<Suspect> suspects = game.getSuspects();
        ArrayList<Person> people = game.getPeopleList();

        boolean continueInvestigations = true;
        Scanner scanner2 = new Scanner(System.in);
        String userInput = null;
        while(continueInvestigations){
            game.selectInvestigate();
            System.out.println("\nDo you want to keep investigating [type 1], or do you want to accuse [type 2]:");
            userInput = scanner2.nextLine();
            continueInvestigations = Tools.userContinues(userInput);
        }
        Scanner scanner3 = new Scanner(System.in);
        game.printAccusable();

        userInput = scanner3.nextLine();
        boolean won = allen.selectAndAccuse(userInput, game);

        if(won == true){System.out.println("Congratulations, you won and caught the criminal!!!");}
        else if(won == false){System.out.println("Wow.. I am so disappointed you just imprisoned an innocent person :(");}
        
    }
    
}
