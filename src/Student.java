import java.util.ArrayList;
import java.util.Random;

public class Student {
    String studentnumber;
    String studentname;
    String studentgender;
    String studentclass;
    String fieldofstudy;
    //Student.Course[] followedcourses = {"Math1", "Math2", "Prog1", "Prog2", "OS"};

    Student(String studentnumber, String studentname, String studentgender, String studentclass, String fieldofstudy){
        this.studentnumber = studentnumber;
        this.studentname = studentname;
        this.studentgender = studentgender;
        this.studentclass = studentclass;
        this.fieldofstudy = fieldofstudy;
    }

    void Print(){
        System.out.println(studentnumber +" "+ studentname +" "+ studentgender +" "+ studentclass +" "+ fieldofstudy);

    }

//    public registerCourses (){
//
//    }

    //student needs to be an object with courses i it and the grade they got for each course

}
