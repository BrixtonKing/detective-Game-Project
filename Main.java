import java.util.ArrayList;
// for final project we can add onto this by adding visuals and using the api key from chatgpt to create the storys
public class Main {
    public static void main (String[] args){

        // testing code
        Person brixton = new Person("Brixton", 16, "6'0", true, 100000.1);
        Suspect mason = new Suspect("mason", 15, "5'10", false, 2000, "i was walking my pet fish", false);
        Player allen = new Player();

        detectiveAgency tester = new detectiveAgency(5, allen);

        Victim Eleanor = new Victim("Eleanor Whitmore", 42,"5;7", false, 145, 
        "I was investigating a political scandal and I believe someone tried to silence me. Someone attempted to strangle me with a pearl necklace, it didn't work. I fought back, and that guy ran away. I remember seeing a gold cufflink drop during the attack.");
        //Suspect Senator = new Suspect("Harold Vance", 57,"6'0",true,195, "I was in the ballroom giving a speech");
        
        // line 9 is needed becuase the arraylist is made as part fo the agency's constructor
        ArrayList<Suspect> banana = tester.getSuspects();
        // uses the to string from person
        System.out.println(banana);

        tester.selectInvestigate();
        

        // investigate victim and suspect work
        //allen.investigateVictim(Eleanor);
        //allen.investigateSuspect(mason);
        //System.out.println(allen.accuse(mason));

        // real code/important to project

    }
    
}
