package Shieldv12.Chapter9.AccessModifier.TestTasksGPT.task3.school.administration;

import Shieldv12.Chapter9.AccessModifier.TestTasksGPT.task3.school.Teacher;

import java.util.ArrayList;
import java.util.List;

public class SchoolAdministration {
    public List<Teacher> schoolTeachers;

    public SchoolAdministration() {
        this.schoolTeachers = new ArrayList<>();
    }

    void hireTeacher(Teacher teacher){
        schoolTeachers.add(teacher);
    }
}
