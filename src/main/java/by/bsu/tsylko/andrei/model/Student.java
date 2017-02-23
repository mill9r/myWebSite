package by.bsu.tsylko.andrei.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Min;
import java.io.Serializable;
import java.util.List;
@Entity
public class Student implements Serializable{

    private static final long serialVersionUID = 8404370533219068837L;


    @Id
    @Min(value = 1, message = " The student ID should be positive")
    private int studentId;

    private String name;
    @NotEmpty(message = " Please enter a surname")
    private String lastName;

    @ManyToOne
    @JoinColumn(name = "groupId")
    @JsonIgnore
    private GroupStudent group;



    @OneToMany(mappedBy = "student",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<TeacherResult> teacherResults;


    public List<TeacherResult> getTeacherResults() {
        return teacherResults;
    }

    public void setTeacherResults(List<TeacherResult> teacherResults) {
        this.teacherResults = teacherResults;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



}
