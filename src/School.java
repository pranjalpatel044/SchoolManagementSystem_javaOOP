// School Class (Composition of People & Courses)

import java.util.ArrayList;
import java.util.List;

public class School {
    private String schoolName;
    private List<Person> people;
    private List<Course> courses;

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.people = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    public void addPerson(Person p) {
        people.add(p);
        System.out.println("Added " + p.getName() + " to school.");
    }

    public void addCourse(Course c) {
        courses.add(c);
        System.out.println("Created course: " + c);
    }

    public void showAllPeople() {
        System.out.println("\nPeople in " + schoolName + ":");
        for (Person p : people) {
            p.printRole(); // Polymorphism (different behavior per object)
        }
    }

    public void showCourses() {
        System.out.println("\nCourses in " + schoolName + ":");
        for (Course c : courses) {
            c.showCourseDetails();
        }
    }
}