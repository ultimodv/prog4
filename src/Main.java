import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args){

        Student Max = new Student("1", "Max", "Male", "class1", "field1");
        Student Tom = new Student("2", "Tom", "Male", "class2", "field2");
        Student Jop = new Student("3", "Jop", "Male", "class2", "field1");
        Student Tim = new Student("4", "Tim", "Male", "class1", "field2");
        Student Bob = new Student("5", "Bob", "Male", "class2", "field2");

        Course Math1 = new Course("math1", 1);
        Course Math2 = new Course("math2", 2);
        Course Prog1 = new Course("programming1", 1);
        Course Prog2 = new Course("programming2", 2);
        Course Os = new Course("operatingsystems", 1);

        ArrayList<Student> students = new ArrayList<>();
        students.add(Max);
        students.add(Tom);
        students.add(Jop);
        students.add(Tim);
        students.add(Bob);

        ArrayList<Course> courses = new ArrayList<>();
        courses.add(Math1);
        courses.add(Math2);
        courses.add(Prog1);
        courses.add(Prog2);
        courses.add(Os);

        students.forEach(student -> student.Print());
        System.out.println(students);
        //System.out.println(Arrays.toString(students));

        courses.forEach(course -> course.Print());
        System.out.println(courses);

        Double min = 1.9;  // Set To Your Desired Min Value
        Double max = 8.9; // Set To Your Desired Max Value
        double x = (Math.random() * ((max - min) + 1)) + min;   // This Will Create A Random Number Inbetween Your Min And Max.
        double xrounded = Math.round(x * 10.0) / 10.0;   // Creates Answer To The Nearest 100 th, You Can Modify This To Change How It Rounds.
        System.out.println(xrounded);    // This Will Now Print Out The Rounded, Random Number.
    }

    //add the students via arraylist and javacollections
}