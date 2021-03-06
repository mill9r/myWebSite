package by.bsu.tsylko.andrei.service;

import by.bsu.tsylko.andrei.model.Teacher;

import java.util.List;


public interface TeacherService {
    void addTeacher(Teacher teacher);

    void editTeacher(Teacher teacher);

    void deleteTeacher(int id);

    Teacher getTeacherByTeacherName(String userName);

    Teacher getTeacherById(int teacherId);

    List<Teacher> getAllTeachers();

}
