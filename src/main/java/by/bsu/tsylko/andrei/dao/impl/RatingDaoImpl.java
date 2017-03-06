package by.bsu.tsylko.andrei.dao.impl;


import by.bsu.tsylko.andrei.dao.RatingDao;
import by.bsu.tsylko.andrei.model.*;
import by.bsu.tsylko.andrei.service.ScheduleService;
import by.bsu.tsylko.andrei.service.StudentService;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import java.util.ArrayList;
import java.util.List;


@Repository
@Transactional
public class RatingDaoImpl implements RatingDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Autowired
    private StudentService studentService;

    @Autowired
    private ScheduleService scheduleService;

    @Override
    public void fillForm(Student student) {

    }

    @Override
    public List<Schedule> getAllSubjectsForCurrentStudent(int studentId) {
        Session session = sessionFactory.getCurrentSession();
        Student student = studentService.getStudentById(studentId);
        int groupId = student.getGroup().getGroupId();
        List<Schedule> schedules = scheduleService.getAllSchedules();
        List<Schedule> scheduleList = new ArrayList<>();
        for (int i = 0; i <schedules.size() ; i++) {
            if(schedules.get(i).getGroup().getGroupId()==groupId){
                scheduleList.add(schedules.get(i));
            }
        }


        session.flush();
        return scheduleList;
    }
}
