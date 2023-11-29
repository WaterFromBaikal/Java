package Shieldv12.Chapter9.AccessModifier.TestTasksGPT.task3.school;

public class Teacher {
    private int id;
    public String name;
    public String department;

    public Teacher(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public int getId() {
        return id;
    }
}
