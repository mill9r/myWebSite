package by.bsu.tsylko.andrei.dao.impl;


import by.bsu.tsylko.andrei.dao.StudentDao;
import by.bsu.tsylko.andrei.model.Authorities;
import by.bsu.tsylko.andrei.model.Student;
import by.bsu.tsylko.andrei.model.Users;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class StudentDaoImpl implements StudentDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addStudent(Student student) {
        Session session = sessionFactory.getCurrentSession();

        session.saveOrUpdate(student);

        Users newUser = new Users();
        newUser.setUsername(student.getName());
        newUser.setPassword(student.getPassword());
        newUser.setStudentId(student.getStudentId());
        newUser.setEnabled(true);


        Authorities newAuthorities = new Authorities();
        newAuthorities.setUsername(student.getUsername());
        newAuthorities.setAuthority("ROLE_USER");
        session.saveOrUpdate(newUser);
        session.saveOrUpdate(newAuthorities);

        session.flush();

    }

    @Override
    public void deleteStudent(int id) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(getStudentById(id));
        session.flush();
    }

    @Override
    public void editStudent(Student student) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(student);
        session.flush();
    }

    @Override
    public Student getStudentById(int studentId) {
        Session session = sessionFactory.getCurrentSession();
        return (Student) session.get(Student.class, studentId);
    }

    @Override
    public List<Student> getAllStudents() {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Student");
        List<Student> studentList = query.list();
        return studentList;
    }

    @Override
    public Student getStudentByUserName(String userName) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Student WHERE lastName =? ");
        query.setString(0, userName);
        return (Student) query.uniqueResult();
    }
}
