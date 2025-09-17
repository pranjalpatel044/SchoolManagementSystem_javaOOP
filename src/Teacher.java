//  Teacher Class (Inheritance + Implements Interface)

public class Teacher extends Person implements Payable {
    private double salary;

    Teacher(String name, int age, double salary){
        super(name, age);
        this.salary = salary;
    }

    @Override
    void printRole(){
        System.out.println(getName() + " is a Teacher (Salary: " + salary + ")");
    }

   @Override
    public void paySalary() {
        System.out.println("Paying salary: " + salary + " to " + getName());
    }
    public double getSalary(){
        return salary;
    }
}
