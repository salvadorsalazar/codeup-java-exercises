import java.util.Arrays;
public class ArraysExercises {

    private String name;



    //static methods
    public static Person[] addPerson(Person[] people,Person newPerson){

        Person [] output = Arrays.copyOf(people,people.length+1);
        output[people.length-1]=newPerson;
        System.out.println(Arrays.toString(output));
        return output;

            //        Person[] newPerson = Arrays.copyOf(people,people.length+1);
            //        newPerson[newPerson.length-1]=newPerson;
            //        return newPerson;

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

//
//        for(Person person : people){
//            System.out.println(person.getName());
//        }

        System.out.println(Arrays.toString(people));
        people = addPerson(people,new Person("salvador"));

        System.out.println(Arrays.toString(people));
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