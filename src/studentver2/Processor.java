
package studentver2;

import java.util.ArrayList;
import java.util.Date;

public class Processor {
    public static void main(String[] args) {
        StudentList studentList = new StudentList();
        studentList.addStudent(new Student(1, "IT", 0, true, "1", "Nguyen Van", new Date()) {
        });
        System.out.println("All Students:  ");
        studentList.displayAllStudent();
        System.out.println("Top Students: ");
        Student topStudent = studentList.findTopStudent();
        if (topStudent != null) topStudent.displayInfo();
        System.out.println("Scholarship Students: ");
        ArrayList<Student> scholarshipStudent = studentList.findScholarshipStudent();
        for (Student student : scholarshipStudent){
            student.displayInfo();
        }
        System.out.println("Tuiition Student: " + studentList.caculateTuiitionOfAllStudents());
    }
}
