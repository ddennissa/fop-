class Course {
    private int idCourse;
    private String nameCourse;

    public Course(int idCourse, String nameCourse) {
        this.idCourse = idCourse;
        this.nameCourse = nameCourse;
        helloCourse();
    }

    public void helloCourse() {
        System.out.println("Welcome to the course");
    }
    public int getIdCourse() {
        return idCourse;
    }

}

abstract class Student {
    protected int age;

    public Student(int age) {
        this.age = age;
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

    public abstract void decreaseAge();
}

class MathStudent extends Student {
    private String favouriteClass;

    public MathStudent(int age, String favouriteClass) {
        super(age);
        this.favouriteClass = favouriteClass;
    }

    public void mathStudentDef() {
        System.out.println("I am a math student");
    }

    @Override
    public void decreaseAge() {
        int decreaseAge = 5;
        this.age -= decreaseAge;
        //this.setAge(this.getAge() - decreaseAge); // More useful: Association: whe you call a class inside another class


    }
}


class Professor {
    private String nameProf;

    public Professor(String nameProf) {
        this.nameProf = nameProf;
    }

    public void profCourse() {
        System.out.println("Course id of the prof: "); // TODO print course id 
        System.out.println("Course name of the prof: ");  // TODO print course name
    }

}

public class Main {
    public static void main(String[] args) {
        // TODO Create Course
        // TODO Create Professor
        // Access Professor Course
        // Add method to Studen
    }
}
