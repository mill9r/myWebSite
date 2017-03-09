package by.bsu.tsylko.andrei.dao.impl;

import by.bsu.tsylko.andrei.dao.RankingDao;
import by.bsu.tsylko.andrei.model.TeacherResult;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class RankingDaoImpl implements RankingDao {

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public void addTeacherResult(TeacherResult teacherResult) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(teacherResult);
        session.flush();
    }

    @Override
    public TeacherResult getSubjectById(int subjectId) {
        return null;
    }

    @Override
    public List<TeacherResult> getSubjectAndTeacherResultById(int subjectId, int teacherId) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from TeacherResult where subjectId =? and teacherIdResult =?");
        query.setInteger(0, subjectId);
        query.setInteger(1, teacherId);
        List<TeacherResult> results = query.list();


        return results;
    }

    @Override
    public List<TeacherResult> getAllTeacherResult() {
        return null;
    }
}
