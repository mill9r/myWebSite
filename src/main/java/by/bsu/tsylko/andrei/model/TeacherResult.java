package by.bsu.tsylko.andrei.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class TeacherResult implements Serializable {

    private static final long serialVersionUID = -370431733746031028L;

    @Id
    @GeneratedValue
    private long teacherResultId;

    private int questionOne;
    private int questionTwo;
    private int questionThree;
    private int questionFour;
    private int questionFive;
    private int questionSix;
    private int questionSeven;
    private int questionEight;
    private int questionNine;
    private int questionTen;
    private int questionEleven;
    private int questionTwelve;


    @ManyToOne
    @JoinColumn(name = "studentId")
    @JsonIgnore
    private Student student;

    @ManyToOne
    @JoinColumn(name = "subjectId")
    @JsonIgnore
    private Subject subject;


    @ManyToOne
    @JoinColumn(name = "teacherIdResult")
    @JsonIgnore
    private Teacher teacher;


    public long getTeacherResultId() {
        return teacherResultId;
    }

    public void setTeacherResultId(long teacherResultId) {
        this.teacherResultId = teacherResultId;
    }

    public int getQuestionOne() {
        return questionOne;
    }

    public void setQuestionOne(int questionOne) {
        this.questionOne = questionOne;
    }

    public int getQuestionTwo() {
        return questionTwo;
    }

    public void setQuestionTwo(int questionTwo) {
        this.questionTwo = questionTwo;
    }

    public int getQuestionThree() {
        return questionThree;
    }

    public void setQuestionThree(int questionThree) {
        this.questionThree = questionThree;
    }

    public int getQuestionFour() {
        return questionFour;
    }

    public void setQuestionFour(int questionFour) {
        this.questionFour = questionFour;
    }

    public int getQuestionFive() {
        return questionFive;
    }

    public void setQuestionFive(int questionFive) {
        this.questionFive = questionFive;
    }

    public int getQuestionSix() {
        return questionSix;
    }

    public void setQuestionSix(int questionSix) {
        this.questionSix = questionSix;
    }

    public int getQuestionSeven() {
        return questionSeven;
    }

    public void setQuestionSeven(int questionSeven) {
        this.questionSeven = questionSeven;
    }

    public int getQuestionEight() {
        return questionEight;
    }

    public void setQuestionEight(int questionEight) {
        this.questionEight = questionEight;
    }

    public int getQuestionNine() {
        return questionNine;
    }

    public void setQuestionNine(int questionNine) {
        this.questionNine = questionNine;
    }

    public int getQuestionTen() {
        return questionTen;
    }

    public void setQuestionTen(int questionTen) {
        this.questionTen = questionTen;
    }

    public int getQuestionEleven() {
        return questionEleven;
    }

    public void setQuestionEleven(int questionEleven) {
        this.questionEleven = questionEleven;
    }

    public int getQuestionTwelve() {
        return questionTwelve;
    }

    public void setQuestionTwelve(int questionTwelve) {
        this.questionTwelve = questionTwelve;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
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
}
