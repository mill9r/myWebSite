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
    @Min(value = 1, message = " Значение для номера зачетной книги должно быть положительным")
    private int studentId;

    private String name;
    @NotEmpty(message = " Введите фамилию")
    private String lastName;

    @ManyToOne
    @JoinColumn(name = "groupId")
    @JsonIgnore
    private GroupStudent group;


    @NotEmpty (message = " Заполните поле username")
    @Column(unique=true)
    private String username;

    @NotEmpty (message = " Поле пароль не должно быть пустым")
    private String password;

    @OneToMany(mappedBy = "student",cascade = CascadeType.ALL)
    private List<TeacherResult> teacherResults;

    private boolean enabled;

    public GroupStudent getGroup() {
        return group;
    }

    public void setGroup(GroupStudent group) {
        this.group = group;
    }

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


    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", group=" + group +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", enabled=" + enabled +
                '}';
    }
}
