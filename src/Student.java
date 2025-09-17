// Student Class (Inheritance from Person)

public class Student extends Person {
    private int rollnumber;
    
    Student(String name, int age,int rollnumber){
        super(name, age); // Call parent (Person) constructor
        this.rollnumber = rollnumber;
    }

    @Override
    void printRole(){
        System.out.println(getName() + " is a Student (Role No: "+ rollnumber + ")");
    }

    public int getRollNumber(){
        return rollnumber;
    }
}
