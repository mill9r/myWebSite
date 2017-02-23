package by.bsu.tsylko.andrei.model;

import javax.persistence.*;
import javax.validation.constraints.Min;
import java.io.Serializable;
import java.util.Set;

@Entity
public class GroupStudent implements Serializable {

    private static final long serialVersionUID = 8336172187539393139L;

    @Id
    @GeneratedValue
    private long groupId;

    @OneToMany(mappedBy = "group",cascade = CascadeType.ALL)
    @OrderBy("studentId")
    private Set<Student> studentList;

    @Min(value = 1, message = "The group number should be positive")
    private int groupNumber;


//    @OneToMany(mappedBy = "group",cascade = CascadeType.ALL)
//    @OrderBy("scheduleId")
//    private Set<Schedule> scheduleList;


    public long getGroupId() {
        return groupId;
    }

    public void setGroupId(long groupId) {
        this.groupId = groupId;
    }

    public Set<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(Set<Student> studentList) {
        this.studentList = studentList;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

//    public Set<Schedule> getScheduleList() {
//        return scheduleList;
//    }
//
//    public void setScheduleList(Set<Schedule> scheduleList) {
//        this.scheduleList = scheduleList;
//    }
}
