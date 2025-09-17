public class Main {
    public static void main(String[] args) {
       // Create school
        School school = new School("Bal Bharti Public School");

        // Create people
        Student s1 = new Student("Pranjal", 20, 101);
        Student s2 = new Student("Ankit", 18, 102);
        Teacher t1 = new Teacher("Mr. Sharma", 40, 50000);

        System.out.println("--------------------------------Student Management System-------------------------------------------");
        System.out.println("============================");
        // Add to school
        school.addPerson(s1);
        school.addPerson(s2);
        school.addPerson(t1);

        System.out.println("============================");
        // Create course
        Course javaCourse = new Course("Java Programming");
        javaCourse.assignTeacher(t1);
        javaCourse.addStudent(s1);
        javaCourse.addStudent(s2);


        System.out.println("============================");
        // Add course to school
        school.addCourse(javaCourse);


        System.out.println("============================");
        // Show People
        school.showAllPeople();

        System.out.println("============================");
        // Show Course
        school.showCourses();


        System.out.println("============================");
        // Pay teacher salary
        t1.paySalary();

        System.out.println("============================");
    }
}
