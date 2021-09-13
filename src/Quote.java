public class Quote {

    public static int randomNumber() {


int newNum = (int) (Math.random() * 4) + 1;
        if(newNum == 1){
            System.out.println("1st:bark bark");
        }else if (newNum ==2){
            System.out.println("2nd: woof,woof");
        }else if(newNum==3){
            System.out.println("3rd : ggrrrrrrr....");

        }else
            System.out.println("4th:bark,woof,grrr,...");

       return newNum;

    }


    }


