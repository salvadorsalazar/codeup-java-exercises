public class MethodWarmup {



    public static void main(String[] args) {
        System.out.println(getDifference(7,5));
        System.out.println(getDifference(17));

        System.out.println(getDifference(7, 5));
        System.out.println(getDifference(5, 7));
        System.out.println(10);
        System.out.println(getDifference(1.5, 3));
        System.out.println(getDifference(2.5, 1.5));
        System.out.println(getDifference(8.2));

    }

    public static int getDifference(int num1,int num2){
        if(num1 > num2){
                return num1-num2;
            } else {
                return num2-num1;
            }

    }

    public static int getDifference(int num){

        return getDifference(num,0);
    }



    public static double getDifference(double num1,double num2){
        if(num1 > num2){
            return num1-num2;
        } else {
            return num2-num1;
        }

    }

    public static double getDifference(double num){

        return getDifference(num,0);
    }

}
