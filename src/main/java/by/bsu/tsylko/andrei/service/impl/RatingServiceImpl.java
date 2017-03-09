package by.bsu.tsylko.andrei.service.impl;

import by.bsu.tsylko.andrei.dao.RatingDao;
import by.bsu.tsylko.andrei.model.Schedule;
import by.bsu.tsylko.andrei.model.Student;
import by.bsu.tsylko.andrei.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingServiceImpl implements RatingService {
    @Autowired
    private RatingDao ratingDao;
    @Override
    public void fillForm(Student student) {
        ratingDao.fillForm(student);
    }

    @Override
    public List<Schedule> getAllSubjectsForCurrentStudent(int studentId) {
        return ratingDao.getAllSubjectsForCurrentStudent(studentId);
    }
}
