import java.util.Arrays;

public class JavaDrills {

//
//    COMPLETE
    public static void main(String[] args) {
        flipOuterCase("cat");// CaT
        flipOuterCase("CaT");// cat
        flipOuterCase("caT");// Cat
        flipOuterCase("cAt");// CAT

//float n[] = {10,2,3};
        System.out.println(returnTotalDifference([10, 2, 3],[1, 2, 3]));
//////
//        System.out.println(flipOuterCase(“cat”));
//        System.out.println(flipOuterCase(“CaT”));
//        System.out.println(flipOuterCase(“caT”));
//        System.out.println(flipOuterCase(“cAt”));
    }
    public static void flipOuterCase(String str){

        char[] ch= str.toCharArray();
        for (int i =0;i<ch.length;i++){
            if(Character.isLowerCase(ch[0])){
                ch[0] = Character.toUpperCase(ch[0]);

            }else if(Character.isUpperCase(ch[0])){
                ch[0]= Character.toLowerCase(ch[0]);
            }
            if(Character.isLowerCase(ch[2])){
                ch[2] = Character.toUpperCase(ch[2]);
            }else if(Character.isUpperCase(ch[2])){
                ch[2]= Character.toLowerCase(ch[2]);
            }


        }  String changedCase= new String(ch);
        System.out.println(changedCase);
    }


    public static int returnTotalDifference(int list1[],int list2[]){
        int sum = 0;
        int sum2=0;
        for(int num:list1){
            sum += num;
        }
        for(int num:list2){
            sum2 += num;
        }
        return sum-sum2;

    }
}
