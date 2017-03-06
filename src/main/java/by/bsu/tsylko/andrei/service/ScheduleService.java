package by.bsu.tsylko.andrei.service;


import by.bsu.tsylko.andrei.model.Schedule;

import java.util.List;

public interface ScheduleService {
    List<Schedule> getAllSchedules();

    void addSchedul(Schedule schedule);

    void editSchedul(Schedule schedule);

    void deleteSchedul(int scheduleId);

    Schedule getScheduletById(int subjectId);
}
