public class Victim extends Person{
    private String story;

    public Victim(){
        super();
    }
    public Victim(String name, int age, String height, boolean isMale, double weight, String story){
        super(name, age, height, isMale, weight);
        this.story = story;
    }

    @Override
    public String talk(){
        return story;
    }
}
