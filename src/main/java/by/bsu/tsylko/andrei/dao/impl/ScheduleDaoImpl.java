package by.bsu.tsylko.andrei.dao.impl;

import by.bsu.tsylko.andrei.dao.ScheduleDao;
import by.bsu.tsylko.andrei.model.Schedule;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class ScheduleDaoImpl implements ScheduleDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Schedule> getAllSchedules() {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Schedule");
        List<Schedule> schedules = query.list();
        return schedules;
    }

    @Override
    public void addSchedul(Schedule schedule) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(schedule);
        session.flush();
    }

    @Override
    public void editSchedul(Schedule schedule) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(schedule);
        session.flush();
    }

    @Override
    public void deleteSchedul(int scheduleId) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(getScheduletById(scheduleId));
        session.flush();
    }

    @Override
    public Schedule getScheduletById(int subjectId) {
        Session session = sessionFactory.getCurrentSession();
        return (Schedule)session.get(Schedule.class,subjectId);
    }
}
