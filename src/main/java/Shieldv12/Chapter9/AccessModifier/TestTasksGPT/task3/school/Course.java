package Shieldv12.Chapter9.AccessModifier.TestTasksGPT.task3.school;

public class Course {
    public String courseName;
    private int courseCode;
    private Teacher assignedTeacher;

    public Course(String courseName, int courseCode, Teacher assignedTeacher) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.assignedTeacher = assignedTeacher;
    }

    public Teacher getAssignedTeacher() {
        return assignedTeacher;
    }
}
