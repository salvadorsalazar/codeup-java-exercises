import java.util.Arrays;
public class ArraysExercises {

    private String name;



    //static methods
    public static Person[] addPerson(Person[] person,Person person2){

        Person[] newPerson = Arrays.copyOf(person,person.length+1);
        newPerson[newPerson.length-1]=person2;
        return newPerson;
    }

    public static void printNames (Person[] input){
         for(Person person : input){
            System.out.println(person.getName());
        }

    }

    public static void main(String[] args) {

        Person[] people = {
                new Person("edgar") ,
                new Person("Allen"),
                new Person("poe")
        };



    }

}






































//constructor
//    public void Person(String name){
//        this.name = name;
//    }
//
//    //instance method
//    public void displayPeople(){
//
//    }
//
//
//    //getter / setter
//    public String getName() {
//        return this.name;
//    }