// Abstract Class (Abstraction + Base Class)
abstract class Person {
  private String name;
  private int age;

  public Person(String name, int age){
    this.name = name;
    this.age = age;
  }

  // Getter method(Encapsulation)
  public String getName(){
    return name;
  }
  public int getAge(){
    return age;
  }

  //Abstract method (Polymorphusm in child classes)
  abstract void printRole();

  @Override
  public  String toString(){
    return "Name: "+ name +" Age: "+ age;
  }

}