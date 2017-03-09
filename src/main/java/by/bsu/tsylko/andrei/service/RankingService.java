package by.bsu.tsylko.andrei.service;


import by.bsu.tsylko.andrei.model.TeacherResult;

import java.util.List;

public interface RankingService {
    void addTeacherResult(TeacherResult teacherResult);

    TeacherResult getSubjectById(int subjectId);

    List<TeacherResult> getSubjectAndTeacherResultById(int subjectId,int teacherId);

    List<TeacherResult> getAllTeacherResult();

    List<Double>getMarksForTeacher(List<TeacherResult> list);
}
