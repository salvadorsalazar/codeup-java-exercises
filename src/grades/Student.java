package grades;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grade ;
    private String userName;

    //constructor
     public Student(String name,ArrayList<Integer> grade){

        this.name = name;
        this.grade = grade;

    }

    public Student(String name,ArrayList<Integer> grade,String userName){

        this.name = name;
        this.grade = grade;
        this.userName=userName;
    }

    public String getName() {
        return this.name;
    }

    public String getUserName() {
        return this.userName;
    }

    public void addGrade(int grade){
    this.grade.add(grade);
    }

public double getGradeAverage(ArrayList<Integer> grades){

        double total = 0;
        double gradeCount = grades.size();
        for( int grade :grades){
            total = total+grade;
        }

        return total/gradeCount;
}

    public static void main(String[] args) {
        ArrayList<Integer>   grades = new ArrayList<>();
        Student student1 = new Student("JOJO" , grades);
        student1.addGrade(90);
        student1.addGrade(95);
        student1.addGrade(85);
        String name = student1.getName();
//      System.out.println(name);
//      System.out.println(student1.getGradeAverage(grades));
        System.out.println("Student Name: " + name+", Grade Average: "+ student1.getGradeAverage(grades));

        ArrayList<Integer>   grades2 = new ArrayList<>();
        Student student2 = new Student("BOBO",grades2);
        student2.addGrade(50);
        student2.addGrade(95);
        String name2 = student2.getName();
//      System.out.println("");
//      System.out.println(name2);
//      System.out.println(student2.getGradeAverage(grades2));
        System.out.println("Student Name: " + name2+", Grade Average: "+ student2.getGradeAverage(grades2));

        ArrayList<Integer> grades3 = new ArrayList<>();
        Student student3 = new Student("FROYO",grades3);
        student3.addGrade(100);
        student3.addGrade(50);
        String name3 = student3.getName();
        System.out.println("Student Name: " + name3+", Grade Average: "+ student3.getGradeAverage(grades3));

        ArrayList<Integer> grades4 = new ArrayList<>();
        Student student4 = new Student("GROGU",grades4);
        student4.addGrade(45);
        student4.addGrade(55);
        String name4 = student4.getName();
        System.out.println("Student Name: " + name4+", Grade Average: "+ student4.getGradeAverage(grades4));

    }


}


