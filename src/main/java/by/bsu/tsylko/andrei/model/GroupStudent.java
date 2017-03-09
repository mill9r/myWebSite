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
    private int groupId;

    @Min(value = 1, message = "The number should be positive")
        private int semester;

    @Min(value = 1, message = "The group number should be positive")
    private int groupNumber;

    @OneToMany(mappedBy = "group", cascade = CascadeType.ALL)
    @OrderBy("studentId")
    private Set<Student> studentList;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "group")
    private Set<Schedule> scheduleListGroupStudent;


    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
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

    public Set<Schedule> getScheduleListGroupStudent() {
        return scheduleListGroupStudent;
    }

    public void setScheduleListGroupStudent(Set<Schedule> scheduleListGroupStudent) {
        this.scheduleListGroupStudent = scheduleListGroupStudent;
    }

    @Override
    public String toString() {
        return "GroupStudent{" +
                "groupId=" + groupId +
                ", semester=" + semester +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
