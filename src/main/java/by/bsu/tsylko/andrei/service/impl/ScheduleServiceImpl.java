package by.bsu.tsylko.andrei.service.impl;

import by.bsu.tsylko.andrei.dao.ScheduleDao;
import by.bsu.tsylko.andrei.model.Schedule;
import by.bsu.tsylko.andrei.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleServiceImpl implements ScheduleService {

    @Autowired
    private ScheduleDao scheduleDao;

    @Override
    public List<Schedule> getAllSchedules() {
        return scheduleDao.getAllSchedules();
    }

    @Override
    public void addSchedul(Schedule schedule) {
        scheduleDao.addSchedul(schedule);
    }

    @Override
    public void editSchedul(Schedule schedule) {
        scheduleDao.editSchedul(schedule);
    }

    @Override
    public void deleteSchedul(int scheduleId) {
        scheduleDao.deleteSchedul(scheduleId);
    }

    @Override
    public Schedule getScheduletById(int subjectId) {
        return scheduleDao.getScheduletById(subjectId);
    }
}
