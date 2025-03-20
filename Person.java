public class Person {
    protected String name;
    protected int age;
    protected String height;
    protected boolean isMale;

    public Person (){}
    public Person (String name, int age, String height, boolean isMale){
        this.name = name;
        this.age = age;
        this.height = height;
        this.isMale = isMale;
    }
    
    public String talk(){
        return "debugging purposes, hi allen: " + name +", "+ height;
    }
    public String description(){
        return "this person is named: " + name +"\nhas a age of " + age + "\nhas a height of " + height + "\nis male is: " + height;
    }
}
