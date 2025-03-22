public class Victim extends Person{
    private String story;

    // blank constructor + normal constructor
    public Victim(){
        super();
    }
    public Victim(String name, int age, String height, boolean isMale, double weight, String story){
        super(name, age, height, isMale, weight);
        this.story = story;
    }
    
    public String hearStory(){return story;}

    @Override
    public String talk(){
        return story;
    }
}
