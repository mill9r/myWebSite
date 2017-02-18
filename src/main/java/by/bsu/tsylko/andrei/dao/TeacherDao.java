package by.bsu.tsylko.andrei.dao;


import by.bsu.tsylko.andrei.model.Teacher;

import java.util.List;

public interface TeacherDao {

    void addTeacher(Teacher teacher);

    void editTeacher(Teacher teacher);

    Teacher getTeacherById(int id);

    List<Teacher> getAllTeachers();

    void deleteTeacher(int id);


}
