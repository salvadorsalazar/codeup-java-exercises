import java.util.Scanner;

public class myIOExperiment {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("wht is your age?? :");

            int userAge = scanner.nextInt();
            if(userAge > 12 | userAge <= 19){
                System.out.println("you are a teenager");
            }else{
                System.out.println("you are NOT a teenager");
            }


//            System.out.printf("Hello  %s ", userInput);

// write a Java program that asks the user for their age and then tells them if they are a teenager or not.
            // bonus: if not, tell them whether they are younger or older than a teenager.


        }




}
