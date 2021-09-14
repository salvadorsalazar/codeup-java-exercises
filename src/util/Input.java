package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public String getString(){
        System.out.println("please enter a string : ");
        String userInput = scanner.nextLine();

        return userInput;
    }






    public Input(){
        this.scanner = new Scanner(System.in);
    }

//public boolean yesNo(){
//    System.out.println("Yes or No");
//    return (scanner.next().equalsIgnoreCase("yes ")|| scanner.next().equalsIgnoreCase("no"));
//}

public boolean yesNo(String input){
    System.out.println("Yes or No");
    return (scanner.next().equalsIgnoreCase("yes ")|| scanner.next().equalsIgnoreCase("no"));

}

    public int getInt(int min, int max){
        System.out.println("Enter an integer between " + min + " and " + max + ".");
        int userInput = Integer.parseInt(scanner.nextLine());
        if (userInput > min && userInput < max){
            return userInput;
        } else {
            return this.getInt(min, max);
        }
    }

    public int getInt(){
        System.out.println("Enter an integer.");
        int userInput = Integer.parseInt(scanner.nextLine());
        return userInput;
    }

    public double getDouble(double min, double max){
        System.out.println("Enter a double between " + min + " and " + max + ".");
        double userInput = Double.parseDouble(scanner.nextLine());
        if (userInput >= min && userInput <= max){
            return userInput;
        } else {
            return this.getDouble(min, max);
        }
    }

    public double getDouble(){
        System.out.println("Enter a double.");
        double userInput = Double.parseDouble(scanner.nextLine());
        return userInput;
    }








}

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