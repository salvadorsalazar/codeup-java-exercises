import java.util.Scanner;



public class ControlFlowExercises {


    public static void main(String[] args) {
//#1.
//        int num = 5;
//        while (num <= 15) {
//            System.out.println(num);
//            num++;
//        }
//

//#1 b.
//
//        int y = 100;
//        do {
//            System.out.println(y);
//            y -= 5;
//        } while (y >= -10);
//
//        for (int x = 100; y >= -10; y -= 5) {
//            System.out.println(y);
//        }
////
////
//    }


//javiers
//        long  i =2L;
//        do{
//            System.out.println(i);
//            i *= i;
//
//        }while (i<1000000);


//                long mults = 2;
//
//        do{
//            System.out.println(mults);
//            mults = (long) Math.pow(mults, 2);
//        }while(mults <= 65536);

//refactor using for loop
//for(int i =5; i <= 15;i++){
//    System.out.println(i + " ");
//}


//for(int i = 0; i < 100; i +=2){
//    System.out.println(i);
//}

//for (int i = 100;i>= -19;i-=5){
//    System.out.println(i);
//}

//for ( long i = 2L;i<1000000;i+=i){
//    System.out.println(i);
//}




   //#2.

//javiers

//        for(int i =1;i <=100;i++){
//        if(i%3 ==0) {
//            System.out.println("Fizz");
//        }else if(i%5 ==0) {
//            System.out.println("Buzz");
//        }else{
//            System.out.println(i);
//
//        }
//
//
//
//        }





//        for(int i = 0; i <= 100; i++){
//            if(i % 15 == 0){
//                System.out.printf("FizzBuzz: %d%n", i);
//            } else if(i % 5 == 0){
//                System.out.printf("Buzz: %d%n", i);
//            } else if(i % 3 == 0){
//                System.out.printf("Fizz: %d%n", i);
//            }
//        }

        Scanner scanner = new Scanner(System.in);

        boolean question = true;
        do {
            System.out.println("Please enter an integer");
            int enteredNum = scanner.nextInt();
            System.out.println(" ");
            System.out.println(" here is your table");
            System.out.println(" ");

            System.out.println("number | squared | cubed");
            System.out.println("...... | ......  | ......");
                for (int i = 1; i <= enteredNum; i++) {
                    int x = i * i;
                    int y = i * i * i;
                        if (x >= 10) {
                            System.out.printf("%-7d      |%-8d      | %-5d    %n", i, x, y);
                        } else {
                            System.out.printf("%d      |%d       |%d    %n", i, x, y);
                        }
                }
            System.out.println("Would you like to continue with another number ? : Yes or No : ");
            String answer = scanner.next();
               if (answer.equalsIgnoreCase("yes")|| answer.equalsIgnoreCase("y")) {
                    question = true;
                   } else {
                        question = false;
                       System.out.println("Goodbye");
                  }
      } while (question);

//
//
//
//        boolean getGrade = false;
//        do {
//            System.out.println("Enter a numerical grade from 0 - 100");
//            int grade = Integer.parseInt(scanner.next());
//            int tenth = Character.getNumericValue(format(grade));
//
//            if (grade >= 90 && grade <= 100) {
//                System.out.println('A');
//            } else if (grade >= 80 && grade <= 89) {
//                System.out.println('B');
//            } else if (grade >= 70 && grade <= 79) {
//                System.out.println('C');
//            } else if (grade >= 60 && grade <= 69) {
//                System.out.println('D');
//            } else {
//                System.out.println("F");
//            }
//
//            System.out.println("Would you like to check another Grade??? [Y]es, [N]o");
//            String again = scanner.next();
//            if(again.equalsIgnoreCase("Y")){
//                getGrade = true;
//            } else {
//                System.out.println("Goodbye");
//                getGrade = false;
//            }
//
//        } while(getGrade);
//


       }
    }




































