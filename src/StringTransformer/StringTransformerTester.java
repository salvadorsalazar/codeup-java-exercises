package StringTransformer;
import java.lang.*;
import java.io.*;
import java.util.*;


public class StringTransformerTester {
    public static void main(String[] args) {

        UpperCaseStringTransformer string1=null;
        string1 = new UpperCaseStringTransformer();
        System.out.println(string1.transform("hello"));

        ReverseStringTransformer strings2 =null;
        strings2 = new ReverseStringTransformer();
        System.out.println(strings2.transform("one"));

        StringTransformer[] test = new StringTransformer[2];
        test[0]= string1;
        test[1]=strings2;
//        for(StringTransformer str: test){
//            System.out.println(str.transform());
        }
    }

