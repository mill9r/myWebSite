package by.bsu.tsylko.andrei.controller;

import by.bsu.tsylko.andrei.dao.RatingDao;
import by.bsu.tsylko.andrei.dao.StudentDao;
import by.bsu.tsylko.andrei.model.Schedule;
import by.bsu.tsylko.andrei.model.Student;
import by.bsu.tsylko.andrei.model.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.bind.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@RequestMapping("/rateTeacher")
@Controller
public class RatingController {

    @Autowired
    private RatingDao ratingDao;

    @Autowired
    private StudentDao studentDao;

    @RequestMapping
    public String getCart(@AuthenticationPrincipal User activeUser){
        Student student = studentDao.getStudentByUserName(activeUser.getUsername());
        int studentId = student.getStudentId();
        return "redirect:/rateTeacher/" + studentId;
    }

    @RequestMapping("/{studentId}")
    public String getSubject(@PathVariable (value = "studentId") int studentId, Model model) {
        List<Schedule> schedules = ratingDao.getAllSubjectsForCurrentStudent(studentId);
        model.addAttribute("schedules", schedules);
        return "rateTeacher";
    }


    @RequestMapping("/rateForm")
    public String getForm(@AuthenticationPrincipal User activeUser){
        Student student = studentDao.getStudentByUserName(activeUser.getUsername());
        int studentId = student.getStudentId();
        return "redirect:/rateForm/" + studentId;
    }



}
