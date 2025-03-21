import java.util.ArrayList;
// for final project we can add onto this by adding visuals and using the api key from chatgpt to create the storys
public class Main {
    public static void main (String[] args){

        // testing code
        Person brixton = new Person("Brixton", 16, "6'0", true, 100000.1);
        detectiveAgency tester = new detectiveAgency(10);
        // line 9 is needed becuase the arraylist is made as part fo the agency's constructor
        ArrayList<Suspect> banana = tester.getSuspects();
        // uses the to string from person
        System.out.println(banana);

        Player allen = new Player();
        allen.investigate(brixton);

    }
}
