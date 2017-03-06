package by.bsu.tsylko.andrei.dao.impl;


import by.bsu.tsylko.andrei.dao.SubjectDao;
import by.bsu.tsylko.andrei.model.Subject;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class SubjectDaoImpl implements SubjectDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addSubject(Subject subject) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(subject);
        session.flush();
    }

    @Override
    public void editSubject(Subject subject) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(subject);
        session.flush();
    }

    @Override
    public void deleteSubject(int subjectId) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(getSubjectById(subjectId));
        session.flush();
    }

    @Override
    public Subject getSubjectById(int subjectId) {
        Session session = sessionFactory.getCurrentSession();
        Subject subject = (Subject)session.get(Subject.class,subjectId);
        session.flush();
        return subject;
    }

    @Override
    public List<Subject> getAllSubjects() {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Subject");
        List<Subject> subjects = query.list();
        session.flush();
        return subjects;
    }

    @Override
    public Subject getSubjectByName(String subjectName) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Subject where subjectName = ? ");
        query.setString(0, subjectName);
        Subject subjects = (Subject) query.uniqueResult();
        session.flush();
        return subjects;

    }
}
