import java.util.ArrayList;
public class Main {
    public static void main (String[] args){
      
        Person brixton = new Person("Brixton", 16, "6' 0", true, 4.1);
        System.out.println(brixton.talk());
        System.out.println(brixton.description());
        detectiveAgen tester = new detectiveAgen(10);
        ArrayList<Suspect> banana = tester.getSuspects();
        System.out.println(banana);

    }
}
