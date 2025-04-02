import java.util.ArrayList;
import java.util.Scanner;
// for final project we can add onto this by adding visuals and using the api key from chatgpt to create the storys
public class Main {
    public static void main (String[] args){

        // testing code
        Person brixton = new Person("Brixton", 16, "6'0", true, 100000.1);
        //Suspect mason = new Suspect("mason", 15, "5'10", false, 2000, "i was walking my pet fish", false);
        Player allen = new Player();

        detectiveAgency game = new detectiveAgency(7, allen);

        // line 9 is needed becuase the arraylist is made as part fo the agency's constructor
        ArrayList<Suspect> suspects = game.getSuspects();
        ArrayList<Person> people = game.getPeopleList();
        // uses the to string from person
        //System.out.println(banana);
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
