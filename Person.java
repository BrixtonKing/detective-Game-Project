public class Person {
    protected String name;
    protected int age;
    protected String height;
    protected boolean isMale;

    public Person (String name, int age, String height, boolean isMale){
        this.name = name;
        this.age = age;
        this.height = height;
        this.isMale = isMale;
    }
    
    public String talk(){
        return "not sure yet allen " + name +", "+ height;
    }
}
