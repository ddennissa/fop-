import java.util.ArrayList;
import java.util.List;

class Course {
    private int id;
    private String name;

    public Course(int id, String name) {
        this.id = id;
        this.name = name;
        helloCourse();
    }

    public void helloCourse() {
        System.out.println("Welcome to the course");
    }
    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

}

public class Student {
    protected int age;
    protected Course course;

    public Student(int age, Course course) {
        this.age = age;
        this.course = course;
    }

    public void haveABirthday() {
        int incrementAge = 10;
        this.age += incrementAge;  // this.age = this.age + incrementAge;
        // age++ === age +=1 === age = age + 1
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Course getCourse() {
        return this.course;
    }

    public void setCourse(Course course) {
        this.course = course;
    } 

    public void hello_student(){
        System.out.println("I am a student");
        this.course.helloCourse();
    }

    public boolean older_student(Student second_student){
        if (this.age > second_student.age)
            return true;
        else
           return false;
    }

    public void studentCourse(){
        int student_course_id = this.course.getId();  // this.course.id; NOT ALLOWED because id is an attribute of Course
        System.out.println("Course id of the student" + student_course_id);
        System.out.println("Course name of the student" + this.course.getName());

    }
}


public class Main {
    public static void main(String[] args) {
        Course programming = new Course(0, "Java");
        Student student_k = new Student(20, programming);
        // Display course name of the student
        String student_course_name = student_k.getCourse().getName();
        System.out.println(student_course_name);
        student_k.studentCourse();
        student_k.getCourse().helloCourse();

        // Lists
        List<String> names = new ArrayList<>();
        names.add("Alex");
        names.add("Max");

        int size = names.size(); // The length / Size of the list
        for (String name: names){
            System.out.println(name);        
        }
        
        // student_k.older_student(student_xx);
    }
}
