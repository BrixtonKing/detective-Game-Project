public class Person {

    // instance variables
    protected String name;
    protected int age;
    protected String height;
    protected boolean isMale;
    protected double weight;
    //protected static int personCount;

    // blank constructor + normal constructor
    public Person (){}
    public Person (String name, int age, String height, boolean isMale, double weight){
        this.name = name;
        this.age = age;
        this.height = height;
        this.isMale = isMale;
        this.weight = weight;
        //personCount++;
    }

        // Getter methods
        public String getName() {
            return name;
        }
    
        public int getAge() {
            return age;
        }
    
        public String getHeight() {
            return height;
        }
    
        public boolean isMale() {
            return isMale;
        }
    
        public double getWeight() {
            return weight;
        }
    
    // talk is rly js to be overridden
    public String talk(){
        return "debugging purposes, hi allen: " + name +", "+ height;
    }

    // description and toString can be changed as needed for visual purposes
    public String description(){
        String temp = null;
        if(isMale == true){
            temp = "is a male";
        }
        else{
            temp = "is a female";
        }
        return "this person is named: " + name +"\nhas a age of " + age + "\nhas a height of " + height + "\n"+ temp + "\nthey weight in at: " + weight + "lbs";
    }

    public String toString(){
        return name;
    }
}
