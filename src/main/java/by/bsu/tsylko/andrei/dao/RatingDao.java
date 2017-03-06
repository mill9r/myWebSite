package by.bsu.tsylko.andrei.dao;


import by.bsu.tsylko.andrei.model.Schedule;
import by.bsu.tsylko.andrei.model.Student;
import by.bsu.tsylko.andrei.model.Subject;

import java.util.List;

public interface RatingDao {

    void fillForm(Student student);

    List<Schedule> getAllSubjectsForCurrentStudent(int studentId);
}
