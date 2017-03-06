package by.bsu.tsylko.andrei.service.impl;

import by.bsu.tsylko.andrei.dao.GroupDao;
import by.bsu.tsylko.andrei.model.GroupStudent;
import by.bsu.tsylko.andrei.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupServiceImpl implements GroupService {
    @Autowired
    private GroupDao groupDao;

    @Override
    public void addGroup(GroupStudent groupStudent) {
        groupDao.addGroup(groupStudent);
    }

    @Override
    public void editGroup(GroupStudent groupStudent) {
        groupDao.editGroup(groupStudent);
    }

    @Override
    public GroupStudent getGroupById(int group) {
        return groupDao.getGroupById(group);
    }

    @Override
    public List<GroupStudent> getAllGroups() {
        return groupDao.getAllGroups();
    }

    @Override
    public void deleteGroup(int group) {
        groupDao.deleteGroup(group);
    }

    @Override
    public GroupStudent getGroupByName(int groupName) {
        return groupDao.getGroupByName(groupName);
    }
}
