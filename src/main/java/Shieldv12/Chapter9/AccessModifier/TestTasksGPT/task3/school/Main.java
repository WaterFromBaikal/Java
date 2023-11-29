package Shieldv12.Chapter9.AccessModifier.TestTasksGPT.task3.school;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Joe", 2);
        Student st2 = new Student("Bob", 1);

        Teacher teacher1 = new Teacher(1, "Marat", "Study");
        Teacher teacher2 = new Teacher(2, "Steve", "Study");

        Course course1 = new Course("Math", 112, teacher1);
        Course course2 = new Course("Music", 1555, teacher2);

        st1.assignedToCourse(course1);
        st1.assignedToCourse(course2);

        st1.getInfo();

    }
}
