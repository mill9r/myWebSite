package by.bsu.tsylko.andrei.dao.impl;


import by.bsu.tsylko.andrei.dao.TeacherDao;
import by.bsu.tsylko.andrei.model.Authorities;
import by.bsu.tsylko.andrei.model.Student;
import by.bsu.tsylko.andrei.model.Teacher;
import by.bsu.tsylko.andrei.model.Users;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository @Transactional
public class TeacherDaoImpl implements TeacherDao {

    @Autowired
    private SessionFactory sessionFactory;

    public void addTeacher(Teacher teacher) {
        Session session = sessionFactory.getCurrentSession();

        session.saveOrUpdate(teacher);

        Users newUser = new Users();
        newUser.setUsername(teacher.getName());
        newUser.setPassword(teacher.getPassword());
        newUser.setStudentId(teacher.getContractNumber());
        newUser.setEnabled(true);


        Authorities newAuthorities = new Authorities();
        newAuthorities.setUsername(teacher.getUsername());
        newAuthorities.setAuthority("ROLE_USER");
        session.saveOrUpdate(newUser);
        session.saveOrUpdate(newAuthorities);

        session.flush();
    }

    public void editTeacher(Teacher teacher) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(teacher);
        session.flush();
    }

    public Teacher getTeacherByTeacherName(String userName) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Teacher where username = ?");
        query.setString(0, userName);
        return (Teacher) query.uniqueResult();
    }

    public List<Teacher> getAllTeachers() {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Teacher");
        List<Teacher> teachers = query.list();
        session.flush();
        return teachers;
    }

    @Override
    public Teacher getTeacherById(int id) {
        Session session = sessionFactory.getCurrentSession();
        Teacher teacher = (Teacher) session.get(Teacher.class, id);
        session.flush();
        return teacher;
    }
    @Override
    public void deleteTeacher(int id) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(getTeacherById(id));
        session.flush();
    }

}
