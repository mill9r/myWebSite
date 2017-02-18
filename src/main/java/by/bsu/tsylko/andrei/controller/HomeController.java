package by.bsu.tsylko.andrei.controller;

import by.bsu.tsylko.andrei.dao.TeacherDao;
import by.bsu.tsylko.andrei.model.Teacher;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.List;

@Controller
public class HomeController {
    private TeacherDao t = new TeacherDao();

    @RequestMapping("/")
    public String home() {
        return "home";
    }

    @RequestMapping("/teacherList")
    public String getTeachers(Model model) {
        List<Teacher> teachers = t.getTeacherList();
        model.addAttribute("teachers", teachers);
        return "teacherList";
    }

    @RequestMapping("/teacherList/viewTeacher/{contractNumber}")
    public String viewTeacher(@PathVariable int contractNumber, Model model) throws IOException {
        Teacher teacher = t.getTeacherContractNumber(contractNumber);
        model.addAttribute(teacher);
        return "viewTeacher";

    }

}
