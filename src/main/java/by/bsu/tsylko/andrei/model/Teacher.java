package by.bsu.tsylko.andrei.model;

public class Teacher {
    private String name;
    private String lastname;
    private String patronymic;
    private int contractNumber;
    private String academicDegree;
    private int teacherDepartment;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
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
