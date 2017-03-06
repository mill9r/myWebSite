package by.bsu.tsylko.andrei.controller.admin;


import by.bsu.tsylko.andrei.model.Subject;
import by.bsu.tsylko.andrei.service.SubjectService;
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
public class AdminSubjectController {
    @Autowired
    private SubjectService subjectService;

    @RequestMapping("/subjectAccounting")
    public String adminSubject(Model model) {
        List<Subject> subjects = subjectService.getAllSubjects();
        model.addAttribute("subject", subjects);
        return "subjectAccounting";
    }

    @RequestMapping("/subjectAccounting/addSubject")
    public String addSubject(Model model) {
        Subject subject = new Subject();
        model.addAttribute(subject);
        return "addSubject";
    }


    @RequestMapping(value = "/subjectAccounting/addSubject", method = RequestMethod.POST)
    public String addSubject(@Valid @ModelAttribute("subject") Subject subject, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "addSubject";
        }
        subjectService.addSubject(subject);
        return "redirect:/admin/subjectAccounting";
    }

    @RequestMapping("/subjectAccounting/editSubject/{id}")
    public String editSubject(@PathVariable("id") int id, Model model) {
        Subject subject = subjectService.getSubjectById(id);
        model.addAttribute(subject);
        return "editSubject";
    }


    @RequestMapping(value = "/subjectAccounting/editSubject", method = RequestMethod.POST)
    public String editSubject(@Valid @ModelAttribute("subject") Subject subject, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "editSubject";
        }
        subjectService.editSubject(subject);
        return "redirect:/admin/subjectAccounting";
    }

    @RequestMapping("/subjectAccounting/deleteSubject/{id}")
    public String deleteSubject(@PathVariable("id") int id) {
        subjectService.deleteSubject(id);
        return "redirect:/admin/subjectAccounting";
    }

}
