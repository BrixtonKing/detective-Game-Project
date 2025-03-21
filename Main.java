import java.util.ArrayList;
public class Main {
    public static void main (String[] args){

        // testing code
        Person brixton = new Person("Brixton", 16, "6' 0", true, 100000.1);
        detectiveAgen tester = new detectiveAgen(10);
        // line 9 is needed becuase the arraylist is made as part fo the agency's constructor
        ArrayList<Suspect> banana = tester.getSuspects();
        // uses the to string from person
        System.out.println(banana);

    }
}
