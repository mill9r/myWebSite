package by.bsu.tsylko.andrei.controller;

import by.bsu.tsylko.andrei.dao.RankingDao;
import by.bsu.tsylko.andrei.dao.RatingDao;
import by.bsu.tsylko.andrei.dao.StudentDao;
import by.bsu.tsylko.andrei.model.*;
import by.bsu.tsylko.andrei.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.bind.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

@RequestMapping("/rateTeacher")
@Controller
public class RatingController {

    @Autowired
    private RatingService ratingDao;

    @Autowired
    private RankingService rankingDao;

    @Autowired
    private StudentDao studentDao;

    @Autowired
    private TeacherService teacherService;

    @Autowired
    private SubjectService subjectService;

    @Autowired
    private StudentService studentService;

    @RequestMapping
    public String getCart(@AuthenticationPrincipal User activeUser) {
        Student student = studentDao.getStudentByUserName(activeUser.getUsername());
        int studentId = student.getStudentId();
        return "redirect:/rateTeacher/" + studentId;
    }

    @RequestMapping("/{studentId}")
    public String getSubject(@PathVariable(value = "studentId") int studentId, Model model) {
        List<Schedule> schedules = ratingDao.getAllSubjectsForCurrentStudent(studentId);
        model.addAttribute("schedules", schedules);
        return "rateTeacher";
    }


    @RequestMapping(value = "/rateForm/{teacherId}/{subjectId}", method = RequestMethod.GET)
    public String getForm(@AuthenticationPrincipal User activeUser) {
        Student student = studentDao.getStudentByUserName(activeUser.getUsername());
        int studentId = student.getStudentId();
        return "redirect:/rateTeacher/rateForm/{teacherId}/{subjectId}/" + studentId;
    }

    @RequestMapping("/rateForm/{teacherId}/{subjectId}/{studentId}")
    public String fillForm(@PathVariable("teacherId") int teacherId, @PathVariable("subjectId") int subjectId,
                           @PathVariable("studentId") int studentId, Model model) {
        Teacher teacher = teacherService.getTeacherById(teacherId);
        Subject subject = subjectService.getSubjectById(subjectId);
        Student student = studentService.getStudentById(studentId);
        TeacherResult teacherResult = new TeacherResult();
        teacherResult.setTeacher(teacher);
        teacherResult.setSubject(subject);
        teacherResult.setStudent(student);
        model.addAttribute("teacherResult", teacherResult);
        return "rateForm";
    }


    @RequestMapping(value = "/rateForm", method = RequestMethod.POST)
    public String fillForm(@Valid @ModelAttribute("teacherResult") TeacherResult teacherResult, BindingResult result) {
        rankingDao.addTeacherResult(teacherResult);
        return "redirect:/rateTeacher";
    }

}
