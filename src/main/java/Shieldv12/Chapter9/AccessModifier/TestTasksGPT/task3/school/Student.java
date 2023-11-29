package Shieldv12.Chapter9.AccessModifier.TestTasksGPT.task3.school;


import java.util.ArrayList;
import java.util.List;

public class Student {
    public String name;
    public int grade;
    private List<Course> courselist;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        courselist = new ArrayList<>();
    }

    public List<Course> getCourselist() {
        return courselist;
    }

    void assignedToCourse(Course course){
        courselist.add(course);
    }

    public void getInfo(){
        System.out.println("Student name: " + name);
        System.out.println("Student grade: " + grade);
        System.out.print("Student courses:");
                for(Course c : getCourselist()){
                    System.out.print(" " + c.courseName);
                };
    }
}
