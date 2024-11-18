import java.util.Arrays;

public class Course {
    static int maxCapacity;
    String courseName;
    int enrollments;
    String[] enrolledStudents = new String[maxCapacity];
    static{
        maxCapacity = 50;
    }
    {
        enrollments =0;
    }
    Course(String courseName){
        this.courseName = courseName;
    }
    static void setMaxCapacity(int maxCapacity){
        Course.maxCapacity = maxCapacity;
    }
    void enrollStudent(String studentName){
        enrolledStudents[enrollments]= studentName;
        this.enrollments++;
        System.out.println("student enrolled successfully");
    }
    void unEnrollStudent(String studentName){
        this.enrollments--;
        System.out.println("un enrolled successfully");
    }
}
