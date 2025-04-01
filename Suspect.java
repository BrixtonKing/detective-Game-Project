public class Suspect extends Person {
    // instance variables
    private String alibi;
    private String talkValue;
    private boolean isTheCriminal;
    
    // blank and real constructor
    public Suspect(){
        super();
    }
    public Suspect(String name, int age, String height, boolean isMale, double weight, String alibi, boolean isTheCriminal, String talkValue){
        super(name, age, height, isMale, weight);
        this.alibi = alibi;
        this.isTheCriminal = isTheCriminal;
        this.talkValue = talkValue;
    }

    // getters and setters
    public String hearAlibi(){
        return alibi;
    }
    public boolean getIsCriminal(){
        return isTheCriminal;
    }

    @Override
    public String talk(){
        return talkValue;
    }
}
