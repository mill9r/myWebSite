package by.bsu.tsylko.andrei.model;

import org.springframework.web.multipart.MultipartFile;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Teacher {

    @Id
    private int contractNumber;


    private String name;
    private String lastName;
    private String patronymic;
    private String academicDegree;
    private int teacherDepartment;

    @Transient
    private MultipartFile teacherImage;

    public MultipartFile getTeacherImage() {
        return teacherImage;
    }

    public void setTeacherImage(MultipartFile teacherImage) {
        this.teacherImage = teacherImage;
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

    public int getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(int contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getAcademicDegree() {
        return academicDegree;
    }

    public void setAcademicDegree(String academicDegree) {
        this.academicDegree = academicDegree;
    }

    public int getTeacherDepartment() {
        return teacherDepartment;
    }

    public void setTeacherDepartment(int teacherDepartment) {
        this.teacherDepartment = teacherDepartment;
    }
}
