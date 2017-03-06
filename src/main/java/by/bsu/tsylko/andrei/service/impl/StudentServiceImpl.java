package by.bsu.tsylko.andrei.service.impl;

import by.bsu.tsylko.andrei.dao.StudentDao;
import by.bsu.tsylko.andrei.model.Student;
import by.bsu.tsylko.andrei.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public void deleteStudent(int id) {
        studentDao.deleteStudent(id);
    }

    @Override
    public void addStudent(Student student) {
        studentDao.addStudent(student);
    }

    @Override
    public void editStudent(Student student) {
        studentDao.editStudent(student);
    }

    @Override
    public Student getStudentById(int studentId) {
        return studentDao.getStudentById(studentId);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }

    @Override
    public Student getStudentByUserName(String userName) {
        return studentDao.getStudentByUserName(userName);
    }
}
