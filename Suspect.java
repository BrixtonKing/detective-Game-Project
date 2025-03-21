public class Suspect extends Person {
    // instance variables
    private String alibi;
    private boolean isTheCriminal;
    
    // blank and real constructor
    public Suspect(){
        super();
    }
    public Suspect(String name, int age, String height, boolean isMale, double weight, String alibi, boolean isTheCriminal){
        super(name, age, height, isMale, weight);
        this.alibi = alibi;
        this.isTheCriminal = isTheCriminal;
    }

    // getters and setters
    public String hearAlibi(){
        return alibi;
    }

    @Override
    public String talk(){
        return("ngl allen idk yet");
    }
}
