package by.bsu.tsylko.andrei.service;

import by.bsu.tsylko.andrei.model.GroupStudent;
import by.bsu.tsylko.andrei.model.Teacher;

import java.util.List;

public interface GroupService {
    void addGroup(GroupStudent groupStudent);

    void editGroup(GroupStudent groupStudent);

    GroupStudent getGroupById(int group);

    List<GroupStudent> getAllGroups();

    public void deleteGroup(int group);

    GroupStudent getGroupByName(int groupName);

}
