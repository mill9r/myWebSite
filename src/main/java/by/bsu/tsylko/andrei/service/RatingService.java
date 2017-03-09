package by.bsu.tsylko.andrei.service;

import by.bsu.tsylko.andrei.model.Schedule;
import by.bsu.tsylko.andrei.model.Student;

import java.util.List;


public interface RatingService {
    void fillForm(Student student);

    List<Schedule> getAllSubjectsForCurrentStudent(int studentId);
}
