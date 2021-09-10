import java.util.Date;
import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
      System.out.println("Ask bob something: ");


        String answer = scanner.next();
        if(answer.endsWith("?")) {
            System.out.println("Sure");

        }else if (answer.endsWith("!")){
            System.out.println("Who , CHILL OUT");

        }else if(answer.equals(" ")){
            System.out.println("whatever");

    }

    }
}
