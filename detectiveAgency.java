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
        int temp1 = (int)Math.random()*5+1;

        // hard coded victims
        Person v1 = new Victim();
        Person v2 = new Victim();
        Person v3 = new Victim();
        Person v4 = new Victim();
        Person v5 = new Victim();

        // hard coded suspects
        Person s1 = new Suspect();
        Person s2 = new Suspect();
        Person s3 = new Suspect();
        Person s4 = new Suspect();
        Person s5 = new Suspect();
        
        // chat gpt list of random suspects
        Person[][] fakeCriminals = new Person[5][6];


        // the victim has to be the last thing
        if(temp1 == 1){
            for(int i = 0; i < fakeCriminals[0].length; i++){
                people.add(fakeCriminals[temp1-1][i]);
            }
            people.add(s1); 
            people.add(v1); 
        }
        if(temp1 == 2){
            for(int i = 0; i < fakeCriminals[0].length; i++){
                people.add(fakeCriminals[temp1-1][i]);
            }
            people.add(s2); 
            people.add(v2); 
        }
        if(temp1 == 3){
            for(int i = 0; i < fakeCriminals[0].length; i++){
                people.add(fakeCriminals[temp1-1][i]);
            }
            people.add(s3); 
            people.add(v3); 
        }
        if(temp1 == 4){
            for(int i = 0; i < fakeCriminals[0].length; i++){
                people.add(fakeCriminals[temp1-1][i]);
            }
            people.add(s4); 
            people.add(v4); 
        }
        if(temp1 == 5){
            for(int i = 0; i < fakeCriminals[0].length; i++){
                people.add(fakeCriminals[temp1-1][i]);
            }
            people.add(s5); 
            people.add(v5); 
        }

        for(int i = 0; i < suspectNumber; i++){
        }
        // change to make it so its the real victim
        //people.add(new Victim());
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