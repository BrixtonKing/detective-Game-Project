import java.util.ArrayList;

public class detectiveAgen{
    private ArrayList<Suspect> suspects = new ArrayList<>();
    private int suspectNumber;
    public detectiveAgen(int suspectNumber){
        this.suspectNumber = suspectNumber;
        for(int i = 0; i < suspectNumber; i++){
            suspects.add(new Suspect());
        }
    }

    public ArrayList<Suspect> getSuspects(){
        return suspects;
    }
}