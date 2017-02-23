package by.bsu.tsylko.andrei.model;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import javax.validation.constraints.Min;
import java.io.Serializable;
import java.util.List;

@Entity
public class Teacher implements Serializable {


    @Id
//    @Min(value = 1, message = " The contract number should be positive")
    private int contractNumber;


    private String name;
    @NotEmpty(message = " Please enter a surname")
    private String lastName;
    private String patronymic;
    private String academicDegree;

    @Transient
    private MultipartFile teacherImage;


    @OneToMany(mappedBy = "teacher",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Schedule> scheduleList;


//    @OneToMany(mappedBy = "teacher",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
//    private List<TeacherResult> teacherResults;

//    public List<TeacherResult> getTeacherResults() {
//        return teacherResults;
//    }
//
//    public void setTeacherResults(List<TeacherResult> teacherResults) {
//        this.teacherResults = teacherResults;
//    }

    public List<Schedule> getScheduleList() {
        return scheduleList;
    }

    public void setScheduleList(List<Schedule> scheduleList) {
        this.scheduleList = scheduleList;
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
