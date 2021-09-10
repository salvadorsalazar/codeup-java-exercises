import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {
//        double pi = 3.14159;
//        System.out.println("The variable of pi is aprroximately "+ pi);

        Scanner scanner = new Scanner(System.in);
       //#1.
//            System.out.println("please enter an integer :");
//            int userInput = scanner.nextInt();
//            System.out.printf("You entered   %s ", userInput);

        //#2.
//            System.out.println("pleas enter 3 words :");
//            String userInput1 = scanner.next();
//            String userInput2 = scanner.next();
//            String userInput3 = scanner.next();
//
//           System.out.printf("You entered  %n%s%n%s%n%s%n "  ,userInput1,userInput2,userInput3);


        //#3. and #4.
//            System.out.println("pleas enter a sentence :");
//            String userSentence = scanner.nextLine();
//            System.out.println("Your sentence is "+ userSentence);


//#5
//        System.out.println("plesae enter length of your classroom:");
//        int length = Integer.parseInt(scanner.nextLine());
//        System.out.println("plesae enter width of your classroom:");
//
//        int width = Integer.parseInt(scanner.nextLine());
//        System.out.println("the ares of your room is "+ (width * length)+ "suare feet and the paerimer is "+ (2* width + length));
//
//

        short y = -5;
        y = 12;
        y = 32450;
        // y = 33000; //incompatible types: possible lossy conversion from int to short

        if (y < 0 ) {
            System.out.println("The variable y contains a negative number");
        } else if (y >=0 && y < 30000){
            System.out.println("The variable y contains a positive number");
        } else {
            System.out.println("The variable y is dangerously close to the max value for short type variables, which is " + Short.MAX_VALUE);
        }




    }
}
