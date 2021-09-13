import java.util.Date;
import java.util.Scanner;

//public class Bob {
//
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//      System.out.println("Ask bob something: ");
//
//
//        String answer = scanner.nextLine();
//        if(answer.endsWith("?")) {
//            System.out.println("Sure");
//
//        }else if (answer.endsWith("!")){
//            System.out.println("Who , CHILL OUT");
//
//        }else if(answer.equals("")){
//            System.out.println("Fine .be that way .....whatever");
//
//    }else{
//            System.out.println("whatever then ");
//        }
//
//    }
//}


//-----------------

public class Bob {

    public static  String response(String q){
        q = q.trim();
        if(q.equals("")){
            return "Fine. Be that way!";
        } else if(q.endsWith("!")){
            return "Whoa, chill out!";
        } else if(q.endsWith("?")){
            return "Sure";
        }
        return "Whatever";
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean wantToAsk;
        do {
            System.out.println("My name is Bob and i can do many things. Ask me a question");
            String forBob = sc.nextLine();
            System.out.println(response(forBob));
            System.out.println("Would you like to ask again??? [Y]es, [N]o");
            String goAgain = sc.next();
            sc.nextLine();
            wantToAsk = (goAgain.equalsIgnoreCase("Y"));
        }while(wantToAsk);
    }
}