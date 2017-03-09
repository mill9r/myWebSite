package by.bsu.tsylko.andrei.service.impl;

import by.bsu.tsylko.andrei.dao.RankingDao;
import by.bsu.tsylko.andrei.model.TeacherResult;
import by.bsu.tsylko.andrei.service.RankingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RankingServiceImpl implements RankingService {

    @Autowired
    private RankingDao rankingDao;

    @Override
    public void addTeacherResult(TeacherResult teacherResult) {
        rankingDao.addTeacherResult(teacherResult);
    }

    @Override
    public TeacherResult getSubjectById(int subjectId) {
        return rankingDao.getSubjectById(subjectId);
    }

    @Override
    public List<TeacherResult> getSubjectAndTeacherResultById(int subjectId, int teacherId) {
        return rankingDao.getSubjectAndTeacherResultById(subjectId, teacherId);
    }

    @Override
    public List<TeacherResult> getAllTeacherResult() {
        return rankingDao.getAllTeacherResult();
    }

    @Override
    public List<Double> getMarksForTeacher(List<TeacherResult> list) {
        double avgMark = 0;
        double avgStruct = 0;
        double avgQuality = 0;
        double avgEffect = 0;
        for (int i = 0; i < list.size(); i++) {
            avgMark += (list.get(i).getQuestionOne() +
                    list.get(i).getQuestionTwo() + list.get(i).getQuestionThree() + list.get(i).getQuestionFour() +
                    list.get(i).getQuestionFive() + list.get(i).getQuestionSix() + list.get(i).getQuestionSeven() +
                    list.get(i).getQuestionEight() + list.get(i).getQuestionNine() + list.get(i).getQuestionTen() +
                    list.get(i).getQuestionEleven() + list.get(i).getQuestionTwelve()) / 12;

            avgStruct += (list.get(i).getQuestionTwo() + list.get(i).getQuestionFive() + list.get(i).getQuestionThree() + list.get(i).getQuestionEleven()) / 4;
            avgQuality += (list.get(i).getQuestionOne() + list.get(i).getQuestionTwelve() + list.get(i).getQuestionFour() + list.get(i).getQuestionSeven()) / 4;
            avgEffect += (list.get(i).getQuestionSix() + list.get(i).getQuestionEight() + list.get(i).getQuestionNine() + list.get(i).getQuestionTen()) / 4;
        }


        avgMark = (double) Math.round(avgMark / list.size() * 100) / 100;
        avgStruct = (double) Math.round(avgStruct / list.size() * 100) / 100;
        avgQuality = (double) Math.round(avgQuality / list.size() * 100) / 100;
        avgEffect = (double) Math.round(avgEffect / list.size() * 100) / 100;

        System.out.println(avgMark);
        System.out.println(avgStruct);


        List<Double> listMarks = new ArrayList<>();
        listMarks.add(avgMark);
        listMarks.add(avgStruct);
        listMarks.add(avgQuality);
        listMarks.add(avgEffect);

        return listMarks;
    }
}
