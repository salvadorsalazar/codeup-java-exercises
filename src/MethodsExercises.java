import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
public class MethodsExercises {
        //---------ORIGINAL EXERCISE PROGRAM-------------//
//    public static void main(String[] args) {
//        System.out.println("#1 a. Basic arithmetic");
//        System.out.println("----------------------");
//        System.out.println(addition(10,10));
//        System.out.println(subtraction(20,10));
//        System.out.println(multiply(10,10));
//        System.out.println(division(10,5));
//        System.out.println("----------------------");

//    count(5);
//        System.out.println(getPower(10,132154));

//        sayHello();
//        sayHello("slavdor salazar");
//        sayHello("its working","sal");
//        sayHello(5);
//    }

    //---------ORIGINAL EXERCISE PROGRAM-------------//





//
//public static int addition(int num1,int num2){
//        return num1+num2;
//}
//
//public static int subtraction(int num1,int num2){
//        return num1-num2;
//}
//
//public static int multiply(int num1,int num2){
//        return num1*num2;
//}
//
//public static int division(int num1,int num2){
//        return num1/num2;
//}

public static void count(int n){

    if (n<=1){
        System.out.println("all done");
        return;
    }
    System.out.println(n);
    count(n-1);
}



                //RECURSION EXAMPLE FROM EXERCISE
                //    FOR LOOP
//public static long getPower(int base,int exponent){
//        long result =1;
//        for(int i =1;i<=exponent;i++){
//            result = result * base;
//        }
//        return result;
//    }


    //--------RECURSION EXAMPLE FROM EXERCISE
    //-----    RECURSIVE-calls itself
//public static long getPower(int base,int exponent){
//        if(exponent ==0){
//            return 1;
//        }else if (exponent ==1){
//            return base;
//        }else if(exponent ==2){
//            return base*base;
//        }
//        return base*getPower(base,exponent - 1);
//}
//


//-----    METHOD OVERLOADING
    //version 1
public static void sayHello(int times){
        for (int i = 0;i<times;i++){
            sayHello();
    }
}

//version 2
public static void sayHello(){
        sayHello("hello","world");
}

//version 3
    public static void sayHello(String name){
        sayHello("hello",name);
    }

//    version 4
    public static void sayHello(String greeting,String name){
        System.out.println(greeting + ", "+ name +"!");
    }

// ------PASSING PARAMETERS TO METHODS







    public static void  changeString(String s){
        s ="wub a lub a dub dub";
    }

    public static void main(String[] args) {
        String changeMe = "hello codeup";
        changeString(changeMe);
        System.out.println(changeMe);


    }



}



























//
//
//
//
//    public static void main(String[] args) throws InterruptedException {
//        Scanner sc = new Scanner(System.in);
//        Thread.sleep(800);
//        System.out.println("Welcome back...");
//        Thread.sleep(1000);
//        System.out.println("I can not seem to remember your name. What was it again?");
//        String name = sc.next();
//        Thread.sleep(1000);
//        System.out.printf("Ahhhh... that's right, nice to see you again %s%n", name);
//        Thread.sleep(750);
//        ArrayList<Integer> pStats = new ArrayList<>();
//        ArrayList<Integer> eStats = new ArrayList<>();
//        for (int i = 0; i < 3; i++) {
//            int ran = (int) (Math.random() * 15) + 10;
//            pStats.add(ran);
//        }
//
//        for (int i = 0; i < 3; i++) {
//            int ran = (int) (Math.random() * 15) + 10;
//            eStats.add(ran);
//        }
//
//        System.out.printf("Your stats are as follows Health, Strength, Agility %s%n", pStats);
//        System.out.printf("Enemy stats are as follows Health, Strength, Agility %s%n", eStats);
//        Thread.sleep(1500);
//
//        double pDamage = pStats.get(1) * .15;
//        double pBlockChance = pStats.get(2) * 2.5;
//
//
//        double eDamage = eStats.get(1) * .15;
//        double eBlockChance = eStats.get(2) * 2.5;
//
//
////        System.out.println(pDamage);
////        System.out.println(eDamage);
//
////        System.out.println(pBlockChance);
////        System.out.println(eBlockChance);
//
//        System.out.println("Some story stuff here, enemy shows up and battle begins");
//        Thread.sleep(1250);
//
//        int pHealth = pStats.get(0);
//        int eHealth = eStats.get(0);
//
//        do{
//            System.out.printf("player health is: %d%n", pHealth);
//            System.out.printf("enemy health is: %d%n", eHealth);
//            Thread.sleep(1000);
//
//            int accuracy = (int) (Math.random() * 100) + 1;
//            if(accuracy <= pBlockChance){
//                System.out.println("You have blocked the incoming attack");
//            } else {
//                System.out.printf("You have been hit, taking %f damage%n", eDamage);
//                pHealth -= eDamage;
//            }
//            if(accuracy <= eBlockChance){
//                System.out.println("Enemy has blocked your attack");
//            } else {
//                System.out.printf("You hit the enemy, dealing %f damage%n", pDamage);
//                eHealth -= pDamage;
//            }
//            if(pHealth <= 0){
//                System.out.println("Enemy has defeated you");
//            } else if(eHealth <= 0){
//                System.out.println("You have defeated your enemy");
//            }
//            System.out.println("================================");
//            Thread.sleep(500);
//
//        }while(pHealth > 0 && eHealth > 0);
//    }
//
//
