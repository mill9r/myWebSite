package by.bsu.tsylko.andrei.dao;

import by.bsu.tsylko.andrei.model.Teacher;
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
        session.flush();
    }

    public void editTeacher(Teacher teacher) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(teacher);
        session.flush();
    }

    public Teacher getTeacherById(int id) {
        Session session = sessionFactory.getCurrentSession();
        Teacher teacher = (Teacher) session.get(Teacher.class, id);
        session.flush();
        return teacher;
    }

    public List<Teacher> getAllTeachers() {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from teacher");
        List<Teacher> teachers = query.list();
        session.flush();
        return teachers;
    }

    public void deleteTeacher(int id) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(getTeacherById(id));
        session.flush();
    }
}
