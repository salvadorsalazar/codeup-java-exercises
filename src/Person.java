


public class Person {
    public String name;

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
    public void sayHello(){
        System.out.println("Hello, " + this.name + ".");
    }

    public Person(String name){
        this.setName(name);
    }

    public static void main(String[] args) {

    }
}























//public class Person {
//    public static void main(String[] args) {
//Person newPerson = new Person("salvador");
//    //-------#1. understanding references
//
////        System.out.println(newPerson.getName());
////        newPerson.setName("sal");
////        System.out.println(newPerson.name);
////        newPerson.sayHello();
////
////
//
//
////        Person person1 = new Person("John");
////        Person person2 = new Person("John");
////        System.out.println(person1.getName().equals(person2.getName()));
////        System.out.println(person1 == person2);
////        System.out.println("----------------");
//
////        Person person1 = new Person("John");
////        Person person2 = person1;
////        System.out.println(person1 == person2);
//
//        System.out.println("--------------------");
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//
//
//
//
//
//    }
//
//
//    private String name;
//
//    public Person(String name){
//        this.name = name;
//
//    }
//    public String getName() {
//        return this.name;
//    }
//
//    public void setName(String newName){
//        this.name = newName;
//
//    }
//
//    public void sayHello(){
//        System.out.println(this.name);
//    }
//
//}