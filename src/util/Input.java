

package util;

import java.math.BigInteger;
import java.util.Scanner;

public class Input {

    private Scanner sc;

    public Input(){
        this.sc = new Scanner (System.in);
    }

    public String getString(){
        return sc.next();
    }
    public String getString(String input){
        System.out.println(input);
        return sc.next();
    }



    public boolean yesNo(){
        System.out.printf("[Y]es / [N]o%n");
        return (sc.next().trim().equalsIgnoreCase("Y") || sc.next().trim().equalsIgnoreCase("yes"));
    }
    public boolean yesNo(String input){
        System.out.printf("%s%n", input);
        return (sc.next().trim().equalsIgnoreCase("Y") || sc.next().trim().equalsIgnoreCase("yes"));
    }



    public int getInt(int min, int max){
        int currInput = getInt();
        if(currInput > max || currInput < min){
            System.out.println("Not within range");
            return getInt(min, max);
        }
        System.out.println("Valid");
        return currInput;
    }
    public int getInt(int min, int max, String input){
        System.out.println(input);
        int currInput = getInt();
        if(currInput > max || currInput < min){
            System.out.println("Not within range");
            return getInt(min, max);
        }
        return currInput;
    }

//    public int getInt(){
//        return sc.nextInt();
//    }







    public int getInt(){
        String input = this.getString();
        try{
            Integer.valueOf(input);
            return Integer.valueOf(input);
        } catch (Exception e){
            e.printStackTrace();

            System.out.println("Invalid Input detected");
            return getInt();
        }
    }




    public double getDouble(){
        String testDouble = this.getString();
        try{
            Double.valueOf(testDouble);
            return Double.valueOf(testDouble);
        } catch (Exception e){
            e.printStackTrace();

            System.out.println("Invalid Input Detected");
            return getDouble();
        }
    }


    public BigInteger getBinary(){
        String binStr = this.getString();
        try{
            new BigInteger(binStr, 2);
            return new BigInteger(binStr, 2);
        } catch (Exception e){
            System.out.println("Unable to parse");
            e.printStackTrace();
            return getBinary();
        }
    }





    public int getHex(){
        // will figure this out
        return 0;
    }










    public int getInt(String prompt){
        System.out.println(prompt);
        return sc.nextInt();
    }



    public double getDouble(double min, double max){
        double currDouble = getDouble();
        if(currDouble > max || currDouble < min){
            System.out.println("Not within range");
            return getDouble(min, max);
        }
        System.out.println("Valid");
        return currDouble;
    }
    public double getDouble(double min, double max, String input){
        System.out.println(input);
        double currDouble = getDouble();
        if(currDouble > max || currDouble < min){
            System.out.println("Not within range");
            return getDouble(min, max);
        }
        System.out.println("Valid");
        return currDouble;
    }





}




//package util;
//
//import java.util.Scanner;
//
//public class Input {
//    private Scanner scanner;
//
//    public Input(){
//
//        this.scanner = new Scanner(System.in);
//
//    }
//
//    public String GetString(){
//        return scanner.next();
//    }
//    public String getString(String input){
//        System.out.println(input);
////        String userInput = scanner.nextLine();
//
//        return scanner.next();
////        userInput;
//    }
//
//
//
//
//
//
//
//
////public boolean yesNo(){
////    System.out.println("Yes or No");
////    return (scanner.next().equalsIgnoreCase("yes ")|| scanner.next().equalsIgnoreCase("no"));
////}
//
//public boolean yesNo(String input){
//    System.out.println("Yes or No");
//    return (scanner.next().equalsIgnoreCase("yes ")|| scanner.next().equalsIgnoreCase("no"));
//
//}
//
//    public int getInt(int min, int max){
//        System.out.println("Enter an integer between " + min + " and " + max + ".");
//        int userInput = Integer.parseInt(scanner.nextLine());
//        if (userInput > min && userInput < max){
//            return userInput;
//        } else {
//            return this.getInt(min, max);
//        }
//    }
//
//    public int getInt(){
//        System.out.println("Enter an integer.");
//        int userInput = Integer.parseInt(scanner.nextLine());
//        return userInput;
//    }
//
//    public double getDouble(double min, double max){
//        System.out.println("Enter a double between " + min + " and " + max + ".");
//        double userInput = Double.parseDouble(scanner.nextLine());
//        if (userInput >= min && userInput <= max){
//            return userInput;
//        } else {
//            return this.getDouble(min, max);
//        }
//    }
//
//    public double getDouble(){
//        System.out.println("Enter a double.");
//        double userInput = Double.parseDouble(scanner.nextLine());
//        return userInput;
//    }
//
//
//    public String getString() {
//        return null;
//    }
//
//    public boolean yesNo() {
//
//    }
//}

//alberts soltuion
//    int getInt(int min, int max){
//        System.out.println("Enter a number between " + min + " and " + max);
//        int input = scanner.nextInt();
//        if (input < min || input > max){
//            getInt();
//        }
//        return input;
//    }
//    int getInt(){
//        return getInt(1,10);
//    }