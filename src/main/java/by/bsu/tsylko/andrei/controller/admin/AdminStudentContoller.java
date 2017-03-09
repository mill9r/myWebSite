package by.bsu.tsylko.andrei.controller.admin;

import by.bsu.tsylko.andrei.model.Student;
import by.bsu.tsylko.andrei.service.GroupService;
import by.bsu.tsylko.andrei.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequestMapping("/admin")
@Controller
public class AdminStudentContoller {
    @Autowired
    private StudentService studentService;

    @Autowired
    private GroupService groupService;

    @RequestMapping("/studentAccounting")
    public String studentAccounting(Model model) {
        List<Student> students = studentService.getAllStudents();
        model.addAttribute("student", students);
        return "studentAccounting";
    }

    @RequestMapping("/studentAccounting/addStudent")
    public String addStudent(Model map) {
        Student student = new Student();

        int number = 1111;
        student.setStudentId(number);
        student.setPassword("" + number);

        map.addAttribute("student", student);
        map.addAttribute("groupList", groupService.getAllGroups());
        return "addStudent";
    }


    @RequestMapping(value = "/studentAccounting/addStudent", method = RequestMethod.POST)
    public String addStudenPost(@Valid @ModelAttribute("student") Student student,
                                BindingResult resultStudent
    ) {

        if (resultStudent.hasErrors()) {
            return "addStudent";
        }

        student.setEnabled(true);
        student.setPassword(String.valueOf(student.getStudentId()));

        studentService.addStudent(student);
        return "redirect:/admin/studentAccounting";
    }


    @RequestMapping("/studentAccounting/editStudent/{id}")
    public String editStudent(@PathVariable("id") int id, Model model) {
        Student student = studentService.getStudentById(id);
        model.addAttribute("student", student);
        model.addAttribute("groupList", groupService.getAllGroups());
        return "editStudent";
    }

    @RequestMapping(value = "/studentAccounting/editStudent", method = RequestMethod.POST)
    public String editStudent(@Valid @ModelAttribute("student") Student student, BindingResult studentResult) {

//        if (studentResult.hasErrors()) {
//            return "editStudent";
//        }

        if (!student.isEnabled()) {
            student.setPassword(String.valueOf(student.getStudentId()));
        }

        studentService.editStudent(student);
        return "redirect:/admin/studentAccounting";
    }


    @RequestMapping("/studentAccounting/deleteStudent/{id}")
    public String deleteStudent(@PathVariable("id") int id) {
        studentService.deleteStudent(id);

        return "redirect:/admin/studentAccounting";
    }


}
