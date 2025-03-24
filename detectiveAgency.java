import java.util.ArrayList;
import java.util.Scanner;

public class detectiveAgency{
    // instance variables
    private ArrayList<Suspect> suspects = new ArrayList<>();
    private ArrayList<Person> people = new ArrayList<>();
    private int suspectNumber;
    private Player player;
    
    public detectiveAgency(int suspectNumber, Player player){
        // basic set up for what will be our arraylist of random suspects
        this.player = player;
        this.suspectNumber = suspectNumber;
        Suspect temp = null;
        for(int i = 0; i < suspectNumber; i++){
            // in the future the part on both lines that says new Suspect() will change
            // however, they both need to be changed to the exact same thing
            suspects.add(new Suspect());
            people.add(new Suspect());
        }
        // change to make it so its the real victim
        people.add(new Victim());
    }

    // getters
    public ArrayList<Suspect> getSuspects(){
        return suspects;
    }
    
    // call this when the player wants to investigate someone
    public void selectInvestigate(){
        // temp variables, doesnt matter
        int j = 1;
        Scanner fellInLuv = new Scanner(System.in);

        System.out.println("Who would you like the investigate:");
        // useable no matter the length of the suspect length 
        for(int i = 0; i < suspectNumber; i++){
            System.out.println("Suspect #" + j + ", Name: " + suspects.get(i).getName());
            j = i+1;
        }
        System.out.println("The Victim (option #"+ j + "), Name: " + people.get(people.size()-1).getName());
        String userInput = fellInLuv.nextLine();
        int selected = Tools.validatedInput(userInput, suspectNumber);
        if(people.get(selected) instanceof Suspect){
            player.investigateSuspect((Suspect)people.get(selected));
        }
        else{
            player.investigateVictim((Victim)people.get(selected));
        }
    }
}