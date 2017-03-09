package by.bsu.tsylko.andrei.controller.admin;


import by.bsu.tsylko.andrei.model.Schedule;
import by.bsu.tsylko.andrei.model.Subject;
import by.bsu.tsylko.andrei.model.Teacher;
import by.bsu.tsylko.andrei.model.TeacherResult;
import by.bsu.tsylko.andrei.service.RankingService;
import by.bsu.tsylko.andrei.service.ScheduleService;
import by.bsu.tsylko.andrei.service.SubjectService;
import by.bsu.tsylko.andrei.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

@RequestMapping("/admin")
@Controller
public class AdminRankController {
    @Autowired
    private RankingService rankingService;
    @Autowired
    private TeacherService teacherService;
    @Autowired
    private SubjectService subjectService;


    @RequestMapping("/rankResult")
    public String getRank(Model model) {
        Schedule schedule = new Schedule();
        model.addAttribute("schedule", schedule);
        model.addAttribute("teacher", teacherService.getAllTeachers());
        model.addAttribute("subject", subjectService.getAllSubjects());
        return "rankResult";
    }

    @RequestMapping(value = "/rankResult/createReport", method = RequestMethod.POST)
    public String createReport(@Valid @ModelAttribute("schedule") Schedule schedule, Model model) {
//        if (result.hasErrors()) {
//            return "/rankResult/createReport";
//        }
        List<TeacherResult> tr =
                rankingService.getSubjectAndTeacherResultById(
                        schedule.getSubject().getSubjectId(), schedule.getTeacher().getContractNumber());

        int tS = tr.get(0).getTeacher().getContractNumber();
        int subjectId = tr.get(0).getSubject().getSubjectId();


        List<Double> list = rankingService.getMarksForTeacher(tr);

        model.addAttribute("avgMark", list.get(0));
        model.addAttribute("avgStruct", list.get(1));
        model.addAttribute("avgQuality", list.get(2));
        model.addAttribute("avgEffect", list.get(3));
        Teacher teacher = teacherService.getTeacherById(tS);
        Subject subject = subjectService.getSubjectById(subjectId);
        model.addAttribute("teacher", teacher);
        model.addAttribute("subject", subject);

        return "createReport";

    }


}
