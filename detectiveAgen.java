import java.util.ArrayList;

public class detectiveAgen{
    // instance variables
    private ArrayList<Suspect> suspects = new ArrayList<>();
    private int suspectNumber;
    public detectiveAgen(int suspectNumber){
        // basic set up for what will be our arraylist of random suspects
        this.suspectNumber = suspectNumber;
        for(int i = 0; i < suspectNumber; i++){
            suspects.add(new Suspect());
        }
    }

    // getters
    public ArrayList<Suspect> getSuspects(){
        return suspects;
    }
}