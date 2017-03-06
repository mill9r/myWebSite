package by.bsu.tsylko.andrei.service.impl;


import by.bsu.tsylko.andrei.dao.TeacherDao;
import by.bsu.tsylko.andrei.model.Teacher;
import by.bsu.tsylko.andrei.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherDao teacherDao;

    @Override
    public void addTeacher(Teacher teacher) {
        teacherDao.addTeacher(teacher);
    }

    @Override
    public void editTeacher(Teacher teacher) {
        teacherDao.editTeacher(teacher);
    }

    @Override
    public void deleteTeacher(int id) {
        teacherDao.deleteTeacher(id);
    }

    @Override
    public Teacher getTeacherByTeacherName(String userName) {
        return teacherDao.getTeacherByTeacherName(userName);
    }

    @Override
    public Teacher getTeacherById(int teacherId) {
        return teacherDao.getTeacherById(teacherId);
    }

    @Override
    public List<Teacher> getAllTeachers() {
        return teacherDao.getAllTeachers();
    }


}
