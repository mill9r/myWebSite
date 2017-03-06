package by.bsu.tsylko.andrei.controller.admin;


import by.bsu.tsylko.andrei.model.Schedule;
import by.bsu.tsylko.andrei.service.GroupService;
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

@RequestMapping("/admin")
@Controller
public class AdminScheduleController {

    @Autowired
    private TeacherService teacherService;
    @Autowired
    private SubjectService subjectService;
    @Autowired
    private GroupService groupService;
    @Autowired
    private ScheduleService scheduleService;


    @RequestMapping("/scheduleAccounting")
    public String adminSchedule(Model model) {
        model.addAttribute("schedule", scheduleService.getAllSchedules());
        return "scheduleAccounting";
    }

    @RequestMapping("/scheduleAccounting/addSchedule")
    public String addSchedule(Model model) {
        Schedule schedule = new Schedule();
        model.addAttribute("schedule", schedule);
        model.addAttribute("teacher", teacherService.getAllTeachers());
        model.addAttribute("subject", subjectService.getAllSubjects());
        model.addAttribute("group", groupService.getAllGroups());
        return "addSchedule";
    }

    @RequestMapping(value = "/scheduleAccounting/addSchedule", method = RequestMethod.POST)
    public String addSchedule(@Valid @ModelAttribute("schedule") Schedule schedule, BindingResult result) {
        if (result.hasErrors()) {
            return "addSchedule";
        }
        scheduleService.addSchedul(schedule);
        return "redirect:/admin/scheduleAccounting";
    }

    @RequestMapping("/scheduleAccounting/editSchedule/{id}")
    public String editSchedule(@PathVariable("id") int id, Model model) {
        Schedule schedule = scheduleService.getScheduletById(id);
        model.addAttribute("schedule", schedule);
        model.addAttribute("teacher", teacherService.getAllTeachers());
        model.addAttribute("subject", subjectService.getAllSubjects());
        model.addAttribute("group", groupService.getAllGroups());
        return "editSchedule";
    }

    @RequestMapping(value = "/scheduleAccounting/editSchedule", method = RequestMethod.POST)
    private String editSchedule(@Valid @ModelAttribute("schedule") Schedule schedule, BindingResult result) {
        if (result.hasErrors()) {
            return "editSchedule";
        }
        scheduleService.editSchedul(schedule);
        return "redirect:/admin/scheduleAccounting";
    }

    @RequestMapping("/scheduleAccounting/deleteSchedule/{id}")
    public String deleteSchedule(@PathVariable("id") int id) {
        scheduleService.deleteSchedul(id);
        return "redirect:/admin/scheduleAccounting";
    }


}
