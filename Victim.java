public class Victim extends Person{
    private String story;
    private String talkValue;

    // blank constructor + normal constructor
    public Victim(){
        super();
    }
    public Victim(String name, int age, String height, boolean isMale, double weight, String story, String talkValue){
        super(name, age, height, isMale, weight);
        this.story = story;
    }
    
    public String hearStory(){return story;}

    @Override
    public String talk(){
        return story;
    }
}
