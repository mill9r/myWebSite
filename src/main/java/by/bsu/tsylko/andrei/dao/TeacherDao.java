package by.bsu.tsylko.andrei.dao;

import by.bsu.tsylko.andrei.model.Teacher;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TeacherDao {
    private List<Teacher> teacherList;

    public List<Teacher> getTeacherList() {
        Teacher teacher1 = new Teacher();

        teacher1.setName("Victor");
        teacher1.setLastname("Ivanchenko");
        teacher1.setPatronymic("Ivanov");
        teacher1.setAcademicDegree("Master of computer science");
        teacher1.setContractNumber(1000);
        teacher1.setTeacherDepartment(1);

        Teacher teacher2 = new Teacher();

        teacher2.setName("Andrei");
        teacher2.setLastname("Deruishev");
        teacher2.setPatronymic("Alexandrov");
        teacher2.setAcademicDegree("PhD of computer science");
        teacher2.setContractNumber(1001);
        teacher2.setTeacherDepartment(2);


        Teacher teacher3 = new Teacher();

        teacher3.setName("Anatolij");
        teacher3.setLastname("German");
        teacher3.setPatronymic("Andreevich");
        teacher3.setAcademicDegree("PhD of computer science");
        teacher3.setContractNumber(1002);
        teacher3.setTeacherDepartment(3);

        teacherList = new ArrayList<Teacher>();
        teacherList.add(teacher1);
        teacherList.add(teacher2);
        teacherList.add(teacher3);


        return teacherList;
    }

    public Teacher getTeacherContractNumber(int contractNumber) throws IOException {
        for (Teacher teacher : getTeacherList()) {
            if (contractNumber == teacher.getContractNumber()) {
                return teacher;
            }
        }
        throw new IOException("No teacher find");
    }
}
