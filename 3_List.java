import java.util.*;

//List<DataType> list = new ArrayList<DataType>();  // https://docs.oracle.com/javase/8/docs/api/java/util/List.html 

//List<String> list = new ArrayList<String>();

List<Integer> list = new ArrayList<Integer>();  // int: create variable https://www.w3schools.com/java/java_wrapper_classes.asp 

// List<Person> list = new ArrayList<Person>(); // Use custom class

list.add(54);
list.add(30);

System.out.println("Value of maximum element is " + Collections.max(list));
System.out.println("Value of maximum element is " + Collections.min(list));


Collections.sort(list);


// Concatenate two lists
List<Integer> list_to_append = new ArrayList<Integer>(); 
list_to_append.add(20);
list_to_append.add(30);

list.addAll(list_to_append);


// Check if the list is empty
list.isEmpty();


list.forEach(element -> {
    System.out.println(element);
});


Iterator<Integer> list_iterator = list.iterator();
while(list_iterator.hasNext()){
    String element = list_iterator.next();
    System.out.println(element);
}


for (int element: list) {
    System.out.println(element);
}

for (int i=0; i< list.size(); i++){
    System.out.println(list.get(i));
}






class Course {
    private int id;
    private String name;
    private double grade;

    public Course(int id, String name, double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
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

    public double getGrade() {
        return this.grade;
    }

}


List<Course> courses = new ArrayList<Course>();

courses.add(new Course(0, "Java"));
courses.add(new Course(1, "Math"));
courses.add(new Course(2, "Physics"));



courses.forEach(course -> {
    System.out.println("Course id" + course.getId()  +   "Course name" + course.getName());
});




for (Course course: courses) {
    System.out.println("Course id" + course.getId()  +   "Course name" + course.getName());
}



public class Student {
    protected int age;
    protected List<Course> courses;

    public Student(int age) {
        this.age = age;
        this.courses = new ArrayList<>();
    }

    public void addCourse(int id, String name, double grade){
        Course course = new Course(id, name, grade);
        this.courses.add(course);
    }

    public double calculateAverageGrade(){
        // Check if the list is empty , if yes return 0
        if (this.courses.isEmpty())
            return 0;
        
        // Calculate sum of all grades of the courses of the student
        // Calculate the average: sum / number of courses that we have
        int size = this.courses.size();
        // We want to iterate through a list of element(courses) and run the method getGrade for each element => for loop

        double totalGrades = 0;
        for (Course course: this.courses) {
            totalGrades += course.getGrade();
        }

        return totalGrades / size;
    }
}





