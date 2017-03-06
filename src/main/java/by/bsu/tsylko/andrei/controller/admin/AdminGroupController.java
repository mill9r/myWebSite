package by.bsu.tsylko.andrei.controller.admin;

import by.bsu.tsylko.andrei.model.GroupStudent;
import by.bsu.tsylko.andrei.service.GroupService;
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
public class AdminGroupController {
    @Autowired
    private GroupService groupDao;

    @RequestMapping("/groupAccounting")
    public String adminGroup(Model model) {
        List<GroupStudent> group = groupDao.getAllGroups();
        model.addAttribute("group", group);
        return "groupAccounting";
    }

    @RequestMapping("groupAccounting/editGroup/{id}")
    public String editGroup(@PathVariable("id") int id, Model model) {
        GroupStudent group = groupDao.getGroupById(id);
        model.addAttribute(group);
        return "editGroup";
    }

    @RequestMapping(value = "/groupAccounting/editGroup", method = RequestMethod.POST)
    public String editGroup(@Valid @ModelAttribute("group") GroupStudent group, BindingResult result) {
        if (result.hasErrors()) {
            return "editGroup";
        }
        groupDao.editGroup(group);
        return "redirect:/admin/groupAccounting";
    }


    @RequestMapping("/groupAccounting/addGroup")
    public String addGroup(Model model) {
        GroupStudent group = new GroupStudent();
        int number = 111111;
        group.setGroupNumber(number);
        model.addAttribute("group", group);
        return "addGroup";
    }

    @RequestMapping(value = "/groupAccounting/addGroup", method = RequestMethod.POST)
    public String addGroup(@Valid @ModelAttribute("group") GroupStudent group, BindingResult result) {
        if (result.hasErrors()) {
            return "addGroup";
        }
        groupDao.addGroup(group);

        return "redirect:/admin/groupAccounting";
    }

    @RequestMapping("/groupAccounting/deleteGroup/{id}")
    public String deleteGroup(@PathVariable int id) {
        groupDao.deleteGroup(id);
        return "redirect:/admin/groupAccounting";
    }

}
