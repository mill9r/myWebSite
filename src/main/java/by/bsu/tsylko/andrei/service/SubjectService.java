package by.bsu.tsylko.andrei.service;

import by.bsu.tsylko.andrei.model.Subject;

import java.util.List;

public interface SubjectService {
    void addSubject(Subject subject);

    void editSubject(Subject subject);

    void deleteSubject(int subjectId);

    Subject getSubjectById(int subjectId);

    List<Subject> getAllSubjects();

    Subject getSubjectByName(String subjectName);
}
