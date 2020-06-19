import java.util.concurrent.ThreadLocalRandom;

public class Course {
    String modulecode;
    double grade = 0.0;// grade ranges from 1 to 10
    int year;// year ranges from 1 to 4
    boolean passedcourse = false;

    Course(String modulecode, int year){
        this.modulecode = modulecode;
        this.year = year;
    }

    void Print(){
        System.out.println(modulecode +" "+ year +" ");
    }



//    public finishedCourses (){
//        if(grade > 5.5) {
//            passedcourse = true;
//        }
//        else(grade <= 5.5){
//            passedcourse = false;
//        }
//    }


    //need 5 different courses with a discription

}