package grades;


import java.util.ArrayList;
import java.util.HashMap;
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.Scanner;



public class GradesApplication {


    public static void main(String[] args) {

        HashMap <String,Student> students = new HashMap<>();
            ArrayList<Integer>   grades = new ArrayList<>();
            Student student1 = new Student("JOJO" , grades,"gitHubGecko");
            student1.addGrade(90);
            student1.addGrade(95);
            student1.addGrade(85);
            String name = student1.getName();
            String userName =student1.getUserName();
            students.put(userName,student1);
            System.out.println("Student Name: " + name+" , GITHUB UserName: "+ userName+", Grade Average: "+ student1.getGradeAverage(grades));

        ArrayList<Integer>   grades2 = new ArrayList<>();
        Student student2 = new Student("BOBO" , grades2,"gitHubGecko");
        student2.addGrade(85);
        student2.addGrade(75);
        student2.addGrade(100);
        String name2 = student2.getName();
        String userName2 =student2.getUserName();
        students.put(userName2,student2);
        System.out.println("Student Name: " + name2+" , GITHUB UserName: "+ userName2+", Grade Average: "+ student2.getGradeAverage(grades2));

        ArrayList<Integer>   grades3 = new ArrayList<>();
        Student student3 = new Student("FROYO" , grades3,"gitHubGecko");
        student3.addGrade(89);
        student3.addGrade(77);
        student3.addGrade(85);
        String name3 = student3.getName();
        String userName3 =student3.getUserName();
        students.put(userName3,student3);
        System.out.println("Student Name: " + name3+" , GITHUB UserName: "+ userName3+", Grade Average: "+ student3.getGradeAverage(grades3));

        ArrayList<Integer>   grades4 = new ArrayList<>();
        Student student4 = new Student("GROGU" , grades4,"gitHubGecko");
        student4.addGrade(55);
        student4.addGrade(45);
        student4.addGrade(85);
        String name4 = student4.getName();
        String userName4 =student4.getUserName();
        students.put(userName4,student4);
        System.out.println("Student Name: " + name4+" , GITHUB UserName: "+ userName4+", Grade Average: "+ student4.getGradeAverage(grades4));



    }

}
