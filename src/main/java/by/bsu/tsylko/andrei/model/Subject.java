package by.bsu.tsylko.andrei.model;


import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
public class Subject implements Serializable {


    private static final long serialVersionUID = -1854397274687006372L;

    @Id
    @GeneratedValue
    private long subjectId;

    @OneToMany(mappedBy = "subject",cascade = CascadeType.ALL)
    @OrderBy("scheduleId")
    private Set<Schedule> scheduleList;


    @NotEmpty(message = " Please enter a subject name")
    private String subjectName;

    @OneToMany(mappedBy = "subject",cascade = CascadeType.ALL)
    @OrderBy("teacherResultId")
    private Set<TeacherResult> teacherResults;


    public long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(long subjectId) {
        this.subjectId = subjectId;
    }

    public Set<Schedule> getScheduleList() {
        return scheduleList;
    }

    public void setScheduleList(Set<Schedule> scheduleList) {
        this.scheduleList = scheduleList;
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
}
