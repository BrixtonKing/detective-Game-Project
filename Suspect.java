public class Suspect extends Person {
    private String alibi;
    private boolean isTheCriminal;
    
    public Suspect(){
        super();
    }
    public Suspect(String name, int age, String height, boolean isMale, double weight, String alibi, boolean isTheCriminal){
        super(name, age, height, isMale, weight);
        this.alibi = alibi;
        this.isTheCriminal = isTheCriminal;
    }
    public String hearAlibi(){
        return alibi;
    }

    @Override
    public String talk(){
        return("ngl allen idk yet");
    }
}
