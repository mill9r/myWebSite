package by.bsu.tsylko.andrei.dao.impl;

import by.bsu.tsylko.andrei.dao.GroupDao;
import by.bsu.tsylko.andrei.model.GroupStudent;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class GroupDaoImpl implements GroupDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addGroup(GroupStudent groupStudent) {
        Session session = sessionFactory.getCurrentSession();

        session.saveOrUpdate(groupStudent);

        GroupStudent newGroup = new GroupStudent();
        newGroup.setGroupNumber(groupStudent.getGroupNumber());

        session.saveOrUpdate(groupStudent);
        session.flush();

    }

    @Override
    public void editGroup(GroupStudent groupStudent) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(groupStudent);
        session.flush();
    }

    @Override
    public void deleteGroup(int group) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(getGroupById(group));
        session.flush();

    }

    @Override
    public GroupStudent getGroupById(int group) {
        Session session = sessionFactory.getCurrentSession();
        GroupStudent groupStudent = (GroupStudent) session.get(GroupStudent.class, group);
        session.flush();
        return groupStudent;
    }

    @Override
    public List<GroupStudent> getAllGroups() {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from GroupStudent");
        List<GroupStudent> groupStudents = query.list();
        return groupStudents;
    }

    @Override
    public GroupStudent getGroupByName(int groupName) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from GroupStudent where groupNumber = ?");
        query.setInteger(0, groupName);
        return (GroupStudent) query.uniqueResult();
    }
}
