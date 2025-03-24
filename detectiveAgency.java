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
            suspects.add(new Suspect("Harold Vance", 57,"6'0",true,195, "I was in the ballroom giving a speech",true));
            suspects.add(new Suspect("Olivia Hawthorne(Former Employee)",34,"5'6",false,140,"I was outside terrace during the poinsoning",true));
            suspects.add(new Suspect("Lucian Devereux (Mansion Owner)",52,"5'11",true,180,"I was in the wine cellar giving a private tour",true));
            suspects.add(new Suspect("Isabella Rosetti (Socialite)",29,"5'8",false,135,"I was in the powder room at the time",true));
            suspects.add(new Suspect("Edwin Carlisle (Cousin)",36,"5'10",true,175,"I was in the billiards room playing a game",true));
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