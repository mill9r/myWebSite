package by.bsu.tsylko.andrei.controller;


import by.bsu.tsylko.andrei.dao.TeacherDao;
import by.bsu.tsylko.andrei.model.Teacher;
import by.bsu.tsylko.andrei.model.TeacherResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private TeacherDao teacherDao;

    @RequestMapping("/")
    public String home() {
        return "home";
    }

    @RequestMapping("/teacherList")
    public String getTeachers(Model model) {
        List<Teacher> teachers = teacherDao.getAllTeachers();
        model.addAttribute("teachers", teachers);
        return "teacherList";
    }

    @RequestMapping("/teacherList/viewTeacher/{contractNumber}")
    public String viewTeacher(@PathVariable int contractNumber, Model model) throws IOException {
        Teacher teacher = teacherDao.getTeacherById(contractNumber);
        model.addAttribute(teacher);
        return "viewTeacher";

    }

    @RequestMapping("/home")
    public String homeLoggin() {
        return "home";
    }


    @RequestMapping("/rateForm")
    public String getForm(Model model){
        TeacherResult teacherResult = new TeacherResult();
        model.addAttribute(teacherResult);
        return "rateForm";
    }
}
