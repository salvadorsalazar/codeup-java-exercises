public class ArrayPractice {
    public static void main(String[] args) {
        //        myVariable = new int[10];//CAN BE DECLARED LIKE THIS AS WELL
        int[] myVariable = new int[10];
        myVariable[1] = 1;
        myVariable[9] =10;
            System.out.println("myVariableArray :" +myVariable[1]  );
            System.out.println("myVariableArray :" +myVariable[9] +"\n");

        int[] myIntArray = new  int[10];
        myIntArray[5] = 50;
            System.out.println("myIntArray :" +myIntArray[5]+"\n");

        double[] myDoubleArray = new double[10];
        myDoubleArray[5] = 5000;
            System.out.println("myDoubleArray :" + myDoubleArray[1]);
            System.out.println("myDoubleArray :" +myDoubleArray[5]);

//NEXT ------------------------------
        int[] myArray = {1,2,3,4,5};
        System.out.println(myArray[0]);
        System.out.println(myArray[1]);
        System.out.println(myArray[2]);
        System.out.println(myArray[3]);

//NEXT------------------------



float n[] = {1,2,5,6,7,8};
        System.out.println("sum" + sum(n));

    }
//-------------given the float array , return the sum of all the elments in it.
    public static float sum(float numbers[]){
        float sum= 0;
        for (float number : numbers){
            sum += number;
        }return sum;
    }
//-----------------------------------------
public int ThreeSum(){
        int n[] = {1,2,4,5,6};
        int sum =0;
        int size = n.length;
        if(size %2 !=0){
            sum = n[0] + n[size -1];
        }else{
            sum = n[0] + n[size -1];
        }
        return sum;
    }

}
