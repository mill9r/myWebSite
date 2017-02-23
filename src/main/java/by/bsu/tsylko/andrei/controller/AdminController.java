package by.bsu.tsylko.andrei.controller;

import by.bsu.tsylko.andrei.dao.TeacherDao;
import by.bsu.tsylko.andrei.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@Controller
public class AdminController {

    private Path path;

    @Autowired
    private TeacherDao teacherDao;


    @RequestMapping("/admin")
    public String adminPage() {
        return "admin";
    }

    @RequestMapping("/admin/teacherAccounting")
    public String teacherAccounting(Model model) {
        List<Teacher> teachers = teacherDao.getAllTeachers();
        model.addAttribute("teachers", teachers);

        return "teacherAccounting";
    }


//    @RequestMapping("/admin/teacherAccounting/addTeacher")
//    public String addTeacher(Model model) {
//        Teacher teacher = new Teacher();
//        teacher.setContractNumber(1111);
//        teacher.setAcademicDegree("Bachelor");
//        teacher.setTeacherDepartment(1);
//        System.out.println("work addTeacher");
//        model.addAttribute("teacher", teacher);
//        return "addTeacher";
//    }

    @RequestMapping("/admin/teacherAccounting/editTeacher/{id}")
    public String editProduct(@PathVariable("id") int id, Model model) {
        Teacher teacher = teacherDao.getTeacherById(id);
        model.addAttribute(teacher);
        return "editTeacher";
    }

    @RequestMapping(value = "/admin/teacherAccounting/addTeacher", method = RequestMethod.POST)
    public String addTeacherPost(@Valid @ModelAttribute("teacher") Teacher teacher, BindingResult result, HttpServletRequest request) {
        if (result.hasErrors()) {
            return "addTeacher";
        }

        teacherDao.addTeacher(teacher);
        //for photo
        MultipartFile teacherImage = teacher.getTeacherImage();
        String rootDirectory = request.getSession().getServletContext().getRealPath("/");
        path = Paths.get(rootDirectory + "\\WEB-INF\\resources\\images\\" + teacher.getContractNumber() + ".png");


        if (teacherImage != null && !teacherImage.isEmpty()) {
            try {
                teacherImage.transferTo(new File(path.toString()));
            } catch (Exception e) {
                e.printStackTrace();
                throw new RuntimeException("Teacher image saving failed.", e);
            }
        }

        return "redirect:/admin/teacherAccounting";
    }


    @RequestMapping("/admin/teacherAccounting/deleteTeacher/{id}")
    public String deleteTeacher(@PathVariable int id, Model model, HttpServletRequest request) {
        String rootDirectory = request.getSession().getServletContext().getRealPath("/");

//        delete img from folder
        path = Paths.get(rootDirectory + "\\WEB-INF\\resources\\images\\" + id + ".png");


        if (Files.exists(path)) {
            try {
                Files.delete(path);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        teacherDao.deleteTeacher(id);

        return "redirect:/admin/teacherAccounting ";
    }


    @RequestMapping(value = "/admin/teacherAccounting/editTeacher", method = RequestMethod.POST)
    public String editProduct(@Valid @ModelAttribute("product") Teacher teacher, Model model, BindingResult result, HttpServletRequest request) {
        if (result.hasErrors()) {
            return "editProduct";
        }

        MultipartFile productImage = teacher.getTeacherImage();
        String rootDirectory = request.getSession().getServletContext().getRealPath("/");
        path = Paths.get(rootDirectory + "\\WEB-INF\\resources\\images\\" + teacher.getContractNumber() + ".png");

        if (productImage != null && !productImage.isEmpty()) {
            try {
                productImage.transferTo(new File(path.toString()));
            } catch (Exception e) {
                e.printStackTrace();
                throw new RuntimeException("Teacher image saving failed.", e);
            }
        }

        teacherDao.editTeacher(teacher);
        return "redirect:/admin/teacherAccounting";
    }
}
