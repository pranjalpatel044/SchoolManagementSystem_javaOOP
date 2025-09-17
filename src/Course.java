// Course Class (Composition)

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private Teacher teacher;
    private List<Student> students;

    Course(String courseName){
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public void assignTeacher(Teacher teacher){
        this.teacher = teacher;
        System.out.println("Assigned " + teacher.getName() + " to "+ courseName);
    }
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Added student " + student.getName() + " to " + courseName);
    }
    public void showCourseDetails(){
        System.out.println("Course: "+ courseName);
        if (teacher != null) {
            System.out.println("Teacher: "+ teacher.getName());
        }
        System.out.println("Students: ");
        for(Student s : students) {
            System.out.println(" - "+ s.getName()+ " (Roll No: " + s.getRollNumber() + ")");
        }
    }

}
