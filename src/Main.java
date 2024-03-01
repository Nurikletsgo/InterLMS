import java.time.LocalDate;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
/*EducationCenter деген абстракт класс тузунуз. Полелери: name, locatedCountry, LocalDate foundationYear;
Абстракт класска School , University, College деген саб класстарды тузунуз.
Study деген интерфейс тузуп, ичине void getStudentsEducationCenter(),
 void getStudentsStudyingYear()  деген 2 метод тузунуз.
Student деген класс тузунуз. Полелери: name, surname, Gender gender,
 LocalDate dateOfStart()(студент кайсыл жылы окуп баштаганы), EducationCenter educationCenter;
Main класста студенттердин массивин тузуп ичине 10 студент салыныз. Студенттер ар кандай окуу жайда окусун.
Main класста 1 метод тузунуз.
1 - метод бардык студенттер жонундо маалыматты, кайсыл студент кайсы окуу жайда окуганы тууралу
маалыматты жана окуганыны канча жыл болгону тууралу маалыматты чыгарып берсин.
*/

        EducationCenter university = new University("KNU", "Kyrgyzstan", LocalDate.of(1970, 3, 2));
        EducationCenter school = new School("Peak soft House", "Kyrgyzstan", LocalDate.of(2021, 3, 2));
        EducationCenter college = new College("I.Arabaev Technical", "Kyrgyzstan", LocalDate.of(1983, 3, 2));


        Student student1 = new Student("Nurmukhamed", "Akimbekov", 'M', LocalDate.of(2024, 8, 1), school);
        Student student2 = new Student("Aibek", "Usonov", 'M', LocalDate.of(2022, 9, 1), college);
        Student student3 = new Student("Aigyl", "Asanova", 'F', LocalDate.of(2020, 9, 9), university);
        Student student4 = new Student("Suyut", "Kalybekov", 'M', LocalDate.of(2018, 8, 1), university);
        Student student5 = new Student("Sultan", "Asanov", 'M', LocalDate.of(2024, 8, 1), school);
        Student student6 = new Student("SAbina", "Malikova", 'F', LocalDate.of(2024, 8, 1), school);
        Student student7 = new Student("Aruuke", "Abdyldaeva", 'F', LocalDate.of(2017, 1, 9), university);
        Student student8 = new Student("Nurbek", "Akunov", 'M', LocalDate.of(2022, 8, 1), college);
        Student student9 = new Student("Aslan", "Asanov", 'M', LocalDate.of(2021, 8, 1), college);
        Student student10 = new Student("Bektur", "Temirbekov", 'M', LocalDate.of(2024, 8, 1), school);

        Student[] students = {student1, student2, student3, student4, student5, student6, student7, student8, student9, student10};
       getStudentInformation(students);
        System.out.println();
        student1.getStudentEducationCenter(students);
        System.out.println();
        student1.getStudentsStudyingYear(students);
    }

    public static void getStudentInformation(Student[]students) {
        for (Student student : students){
            System.out.println(student);}

        }


    }



