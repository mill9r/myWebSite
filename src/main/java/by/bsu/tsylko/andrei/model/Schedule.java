package by.bsu.tsylko.andrei.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Schedule implements Serializable {


    private static final long serialVersionUID = 1747728360681094696L;


    @Id
    @GeneratedValue
    private int scheduleId;


    private int currentSemester;

    @ManyToOne
    @JoinColumn(name = "groupId", nullable = false)//,updatable = false, insertable = false)
//    @org.hibernate.annotations.ForeignKey(name = "FK_GROUP_ID")
    @JsonIgnore
    private GroupStudent group;


    @ManyToOne
    @JoinColumn(name = "subjectId", nullable = false)//, updatable = false, insertable = false)
   // @org.hibernate.annotations.ForeignKey(name = "FK_SUBJECT_ID")
    @JsonIgnore
    private Subject subject;

    @ManyToOne
    @JoinColumn(name = "teacherId", nullable = false)
    @JsonIgnore
    private Teacher teacher;


    public int getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(int scheduleId) {
        this.scheduleId = scheduleId;
    }

    public int getCurrentSemester() {
        return currentSemester;
    }

    public void setCurrentSemester(int currentSemester) {
        this.currentSemester = currentSemester;
    }

    public GroupStudent getGroup() {
        return group;
    }

    public void setGroup(GroupStudent group) {
        this.group = group;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }


    @Override
    public String toString() {
        return "Schedule{" +
                "scheduleId=" + scheduleId +
                ", currentSemester=" + currentSemester +
                '}';
    }
}
