import java.util.ArrayList;
// for final project we can add onto this by adding visuals and using the api key from chatgpt to create the storys
public class Main {
    public static void main (String[] args){

        // testing code
        Person brixton = new Person("Brixton", 16, "6'0", true, 100000.1);
        Suspect mason = new Suspect("mason", 15, "5'10", false, 2000, "i was walking my pet fish", false);
        Player allen = new Player();

        detectiveAgency tester = new detectiveAgency(5, allen);

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
