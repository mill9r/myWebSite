package by.bsu.tsylko.andrei.service.impl;


import by.bsu.tsylko.andrei.dao.SubjectDao;
import by.bsu.tsylko.andrei.model.Subject;
import by.bsu.tsylko.andrei.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SubjectServiceImpl implements SubjectService{
    @Autowired
    private SubjectDao subjectDao;

    @Override
    public void addSubject(Subject subject) {
        subjectDao.addSubject(subject);
    }

    @Override
    public void editSubject(Subject subject) {
        subjectDao.editSubject(subject);
    }

    @Override
    public void deleteSubject(int subjectId) {
        subjectDao.deleteSubject(subjectId);
    }

    @Override
    public Subject getSubjectById(int subjectId) {
        return subjectDao.getSubjectById(subjectId);
    }

    @Override
    public List<Subject> getAllSubjects() {
        return subjectDao.getAllSubjects();
    }

    @Override
    public Subject getSubjectByName(String subjectName) {
        return subjectDao.getSubjectByName(subjectName);
    }
}
