package by.bsu.tsylko.andrei.dao;


import by.bsu.tsylko.andrei.model.Student;

import java.util.List;

public interface StudentDao {

    void addStudent(Student student);

    void editStudent(Student student);

    void deleteStudent(int id);

    Student getStudentById(int studentId);

    List<Student> getAllStudents();

    Student getStudentByUserName(String userName);



}
