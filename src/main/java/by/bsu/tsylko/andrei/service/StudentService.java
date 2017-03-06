package by.bsu.tsylko.andrei.service;


import by.bsu.tsylko.andrei.model.Student;

import java.util.List;

public interface StudentService {
    void addStudent(Student student);
    void editStudent(Student student);

    void deleteStudent(int id);

    Student getStudentById(int studentId);

    List<Student> getAllStudents();

    Student getStudentByUserName(String userName);

}
