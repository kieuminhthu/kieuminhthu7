
package studentver2;

import java.util.Date;

public abstract class Student extends Person implements IPerson{
    private float gpa;
    private String major;
    private double tuiition;
    private boolean schoolarship;

    public Student() {
    }

    public Student(float gpa, String major, double tuiition, boolean schoolarship, String id, String fullName, Date dateofBirth) {
        super(id, fullName, dateofBirth);
        this.gpa = gpa;
        this.major = major;
        this.tuiition = schoolarship ? 10000000 * 5 : 10000000;
        this.schoolarship = gpa >= 9;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getTuiition() {
        return tuiition;
    }

    public void setTuiition(double tuiition) {
        this.tuiition = tuiition;
    }

    public boolean isSchoolarship() {
        return schoolarship;
    }

    public void setSchoolarship(boolean schoolarship) {
        this.schoolarship = schoolarship;
    }
    @Override
    public  void displayInfo(){
        System.out.println("ID: " + id);
        System.out.println("Full Name: " + fullName);
        System.out.println("Date of birht: " + dateofBirth);
        System.out.println("GPA: " + gpa);
        System.out.println("Major: " + major);
        System.out.println("Tuiition: " + tuiition);
        System.out.println("Schoolarship: " + (schoolarship ? "Yes" : "No"));
    }
}
