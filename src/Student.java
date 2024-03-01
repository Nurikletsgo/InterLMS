import java.time.LocalDate;
import java.time.Period;


public class Student implements Study {
    /*Полелери: name, surname, Gender gender,
 LocalDate dateOfStart()(студент кайсыл жылы окуп баштаганы), EducationCenter educationCenter;*/
    private String name;
    private String surname;
    private char gender;
    private LocalDate dateOfStart;
    private final LocalDate now = LocalDate.of(2024, 2, 26);
    private EducationCenter educationCenter;

    public Student(String name, String surname, char gender, LocalDate dateOfStart, EducationCenter educationCenter) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.dateOfStart = dateOfStart;
        this.educationCenter = educationCenter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfStart() {
        return dateOfStart;
    }

    public void setDateOfStart(LocalDate dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    public EducationCenter getEducationCenter() {
        return educationCenter;
    }

    public void setEducationCenter(EducationCenter educationCenter) {
        this.educationCenter = educationCenter;
    }


    @Override
    public void getStudentEducationCenter(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name + "  study in --->  " + students[i].educationCenter.getName());
        }
    }

    @Override
     public  void getStudentsStudyingYear(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            System.out.println((students[i].name + "  okup bashtaganyna   " + Period.between(now, students[i].dateOfStart) + " boldu"));
        }

    }

    @Override
    public String toString() {
        return "Student  " +
                "name = " + name +
                ",  surname = " + surname +
                ",  gender = " + gender +
                ",  dateOfStart = " + dateOfStart +
                ",  educationCenter = " + educationCenter;
    }
}
