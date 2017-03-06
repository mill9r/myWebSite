package by.bsu.tsylko.andrei.model;


import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Subject implements Serializable {


    private static final long serialVersionUID = -1854397274687006372L;

    @Id
    @GeneratedValue
    private int subjectId;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "subject")
    private Set<Schedule> scheduleListSubject;


    @NotEmpty(message = " Please enter a subject name")
    private String subjectName;

    @OneToMany(mappedBy = "subject",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @OrderBy("teacherResultId")
    private Set<TeacherResult> teacherResults;


    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }


    public Set<Schedule> getScheduleListSubject() {
        return scheduleListSubject;
    }

    public void setScheduleListSubject(Set<Schedule> scheduleListSubject) {
        this.scheduleListSubject = scheduleListSubject;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Set<TeacherResult> getTeacherResults() {
        return teacherResults;
    }

    public void setTeacherResults(Set<TeacherResult> teacherResults) {
        this.teacherResults = teacherResults;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectId=" + subjectId +
                ", subjectName='" + subjectName + '\'' +
                ", teacherResults=" + teacherResults +
                '}';
    }
}
