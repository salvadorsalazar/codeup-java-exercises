public class ExceptionMiniExercise {
public String name ="sal";

    public static void main(String[] args) {
        try {
            String name = "salvador";
            System.out.println(name + " lenght is : " + name.length());
            System.out.println(name.substring(0, 3));
            System.out.println(name.substring(20));
        }catch(IndexOutOfBoundsException e){
            System.out.println("out of bounds" + e);
        }
    }

}




/*
    Investigate the substring method for String objects in the Java API. Find out what kind of exception it throws. Create a test class with a main method. Set up a try-catch block that defines a string and finds its length. Once you have the length of your string, modify your program so it creates a substring from your original string, but give it an index that doesn't exist so you get the error message.


 */