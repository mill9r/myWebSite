package by.bsu.tsylko.andrei.dao;

import by.bsu.tsylko.andrei.model.GroupStudent;

import java.util.List;

public interface GroupDao {

    void addGroup(GroupStudent groupStudent);

    void editGroup(GroupStudent groupStudent);

    void deleteGroup(int group);

    GroupStudent getGroupById(int group);

    List<GroupStudent> getAllGroups();

    GroupStudent getGroupByName(int groupName);

}
