package by.bsu.tsylko.andrei.dao;


import by.bsu.tsylko.andrei.model.TeacherResult;

import java.util.List;

public interface RankingDao {

    void addTeacherResult(TeacherResult teacherResult);

    TeacherResult getSubjectById(int subjectId);

    List<TeacherResult> getAllTeacherResult();


}
