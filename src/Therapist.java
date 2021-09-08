import java.util.Scanner;
public class Therapist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How are you feeling today ? Good , Bad  , sad ? ");
        String answer = scanner.next();


            if (answer.equalsIgnoreCase("Good")) {

                System.out.println("Glad your feeling good , the days has just begun");
            } else if (answer.equalsIgnoreCase( "Bad")) {

                System.out.println("Sorry , feeling bad is quite a distraction, exercise and eat right !");
            }
           else if (answer.equalsIgnoreCase("sad")){
                    System.out.println("Cheer up, why the long face.");
                }
            }
        }
//    }



//}
