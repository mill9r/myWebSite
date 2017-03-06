package by.bsu.tsylko.andrei.model;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import javax.validation.constraints.Min;
import java.io.Serializable;
import java.util.List;

@Entity
public class Teacher implements Serializable {


    private static final long serialVersionUID = 982861814088982223L;
    @Id
    @Min(value = 1, message = " The contract number should be positive")
    private int contractNumber;


    private String name;
    @NotEmpty(message = " Please enter a surname")
    private String lastName;
    private String patronymic;
    private String academicDegree;

    @Transient
    private MultipartFile teacherImage;


    @OneToMany(mappedBy = "teacher",cascade = CascadeType.ALL)
    private List<Schedule> scheduleListTeacher;


    @OneToMany(mappedBy = "teacher",cascade = CascadeType.ALL)
    private List<TeacherResult> teacherResults;


    @NotEmpty (message = "The customer username must not be null")
    private String username;

    @NotEmpty (message = "The customer password must not be null")
    private String password;

    private boolean enabled;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public List<TeacherResult> getTeacherResults() {
        return teacherResults;
    }

    public void setTeacherResults(List<TeacherResult> teacherResults) {
        this.teacherResults = teacherResults;
    }

    public List<Schedule> getScheduleListTeacher() {
        return scheduleListTeacher;
    }

    public void setScheduleListTeacher(List<Schedule> scheduleListTeacher) {
        this.scheduleListTeacher = scheduleListTeacher;
    }

    public int getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(int contractNumber) {
        this.contractNumber = contractNumber;
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

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAcademicDegree() {
        return academicDegree;
    }

    public void setAcademicDegree(String academicDegree) {
        this.academicDegree = academicDegree;
    }

    public MultipartFile getTeacherImage() {
        return teacherImage;
    }

    public void setTeacherImage(MultipartFile teacherImage) {
        this.teacherImage = teacherImage;
    }
}
