
package studentver2;

import java.util.ArrayList;

public class StudentList {
    private ArrayList<Student> studentList;

    public StudentList() {
        this.studentList = new ArrayList<>();
    }
    public void addStudent(Student student){
        studentList.add(student);
    }
    public void updateStudentbyID(String id, Student updateStudent){
        for (int i = 0; i < studentList.size(); i++){
            if (studentList.get(i).getId().equals(id)){
                studentList.set(i, updateStudent);
                return;
            }
        }
        System.out.println("Student with ID " + id + "not found");
    }
    public void deleteStudentbyID(String id){
        studentList.removeIf(student -> student.getId().equals(id));
    }
    public void displayAllStudent(){
        for (Student student : studentList){
            student.displayInfo();
            System.out.println("---");
        }
    }
    public Student findTopStudent(){
        if (studentList.isEmpty()) return null;
        Student topStudent = studentList.get(0);
        for (Student student : studentList){
            if (student.getGpa() > topStudent.getGpa()){
                topStudent = student;
            }
        }
        return topStudent;
    }
    public ArrayList<Student> findScholarshipStudent(){
        ArrayList<Student> scholarshipStudent = new ArrayList<>();
        for (Student student : studentList){
            if (student.isSchoolarship()){
                scholarshipStudent.add(student);
            }
        }
        return scholarshipStudent;
    }
    public double caculateTuiitionOfAllStudents(){
        double totalTuiiton = 0;
        for (Student student : studentList){
            totalTuiiton += student.getTuiition();
        }
        return totalTuiiton;
    }
}
