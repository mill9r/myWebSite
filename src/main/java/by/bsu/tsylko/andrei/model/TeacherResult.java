package by.bsu.tsylko.andrei.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

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
    private int questionThirteen;
    private int questionFourteen;
    private int questionFifteen;
    private int questionSixteen;
    private int questionSeventeen;
    private int questionEighteen;
    private int questionNineteen;
    private int questionTwenty;
    private int questionTwentyOne;
    private int questionTwentyTwo;
    private int questionTwentyThree;


    @ManyToOne
    @JoinColumn(name = "studentId")
    @JsonIgnore
    private Student student;

    @ManyToOne
    @JoinColumn(name = "subjectId")
    @JsonIgnore
    private Subject subject;


//    @ManyToOne
//    @JoinColumn(name = "teacherIdResult")
//    @JsonIgnore
//    private Teacher teacher;


}
