//import java.util.Scanner;
//
//public class Test {
//    public static void main(String[] args)
//    {
//      System.out.println("Hello, World!");
//      System.out.println("Hello, Draco!");
//
//        System.out.print("Hello,");
//        System.out.println(" Salvador! ");
//
//        System.out.println(" --New examples--- ");
//
//
//
////        String name ="salvador";
////        System.out.printf("hello there %s. Nice to see you.\n", name);
////
////        String greeting = "Salutations";
////        String name2 = "codeup";
////        System.out.printf("%s, %s!", greeting, name2);
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("enter something HERE :");
////        String userInput = scanner.next();
//        String userInput = scanner.nextLine();
//
//        System.out.println("you entered : --> \"" + userInput + "\' <--");
//
//
//
//
//    }
//
//
//
//
//}
//



// ---- jsutins lecture notes


//
//public class SyntaxLecture {
//
//
//    public static void main(String[] args) {
//
//
//        // ================== STATEMENTS (s-3)

        // Statements may be...
        // Declarations
//             int x;

        // Assignment expressions
//               x = 3;

        // Any use of ++ or --
//            --x;

        // Method invocations
//               Math.random();

        // Object creation expressions

        // ================== COMMENTS (s-4)

        // single line comment

        /*

            multi-line comment

         */

        /**
         * Comment block
         */

//        System.out.println("test");


        // ================== DATA TYPES (s-5, 6, 7)



//            int primitiveExample = 3;
//            System.out.println(primitiveExample);


//            Student referenceExample = new Student();


        // use the smallest type needed for the job


        // primitive types...

//            byte age = -32;
//        System.out.println(age);
//            short minimumAnnualSalary = 15080;
//            int distanceToSaturn = 1200000000;
//            long numberOfHumanCells = 3000000000L; // L needed for compiler
//            System.out.println(numberOfHumanCells);
//            float lengthOfBacteriaInInches = 0.00004F; // F needed for compiler
//            System.out.println(lengthOfBacteriaInInches);
//            double widthOfAtomInMeters = .00000000001;
//            char seatingSection = 'M'; // must wrap in single quotes
//            boolean everythingIsAwesome = false;

        // strings (not a primitive type)

//                 String thisIsAString = "Hello";



//              like in JS, strings must escape certain characters like quotes and use it to inject newline characters and other formatting

//        System.out.println("Hello\nWorld");
//        System.out.print("Hello");
//        System.out.print("World");

//        System.out.println("He said \"Hi\"");
//
//        String hello = "Hello";
//        char someLetter = hello.charAt(0);
//        System.out.println(someLetter);


        // ================== VARIABLES (s-8)

        // declaration separate from initialization

//             int seven;
//             seven = 7;
//            System.out.println(seven);

        // declaration and initialization

//             int eight = 8;
//        System.out.println(eight);


        // ================== IDENTIFIERS AND KEYWORDS (s-9)

        // see curriculum



        // ================== CONSTANTS (s-10)

        // see curriculum

//        final int SIDES_OF_A_DICE = 6;


        // ================== EXPRESSIONS (s-11)

        // basically the same as JS


        // ================== OPERATORS (s-12)

        // basically the same as JS


        // ================== ASSIGNMENT STATEMENTS (s-13)

        // basically the same as JS


        // ================== CASTING (s-14)

        // Link on casting... http://www.javainterviewpoint.com/type-casting-java-implicit-explicit-casting/


        // IMPLICIT
//            short x = 4;
//            int y = x;
//        System.out.println(x);
//        System.out.println(y);


        // EXPLICIT
//            int a = 2000001;
//            byte b = (byte) a;
//        System.out.println(a);
//        System.out.println(b);






        // implicit casting - less to more precise (widening)

//                 float num1 = 2.22F;
//                 double num2 = num1;


        // explicit casting - more to less explicit casting (narrowing)

//                 double num3 = 3.1;
//                 float num4 = (float) num3;
//
//                System.out.println(num4);


//
//    }
//
//}