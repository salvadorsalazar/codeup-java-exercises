import java.util.*;
import java.util.stream.Collectors;

public class CollectionsLecture {

    public static void main(String[] args) {

        // ----------------------------- Array Lists

        // creating ArrayLists

        //ArrayList<Integer> numbers = new ArrayList<>();
//        List<Integer> numbers = new ArrayList<>();
//         numbers.add(1);
//          numbers.add(2);
//         numbers.add(3);
//        System.out.println(numbers);

        //
        // System.out.println(numbers);

//         List<String> names = new ArrayList<>(Arrays.asList(
//                 "Fred",
//                 "Sally"
//                 "Cindy"
//         ));

//        System.out.println(names);
////
//        List<Integer> numbers = new ArrayList<>();
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);
//
//        int number = numbers.get(0);
//
//        System.out.println(number);


        // peeking into list

//        System.out.println(numbers);


        // get elements

//        System.out.println(numbers.get(2));


        // adding elements

//        numbers.add(20);
//
//        numbers.add(0, 21);
//

        // editing elements

//        numbers.set(0, 100);
//
//        System.out.println(numbers);



        // removing elements

//        System.out.println(names);
//        names.remove(0);
//        names.remove("Cindy");
//        System.out.println(names);


//        List<Integer> numbers = new ArrayList<>();
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);
//        System.out.println(numbers);



//        numbers.add(0,3);
//        numbers.remove(Integer.valueOf(3));
//        System.out.println(numbers);




        // reordering list
//            Collections.sort(numbers);
//            Collections.reverse(numbers);
//            System.out.println(numbers);


//
//        List<String> names = new ArrayList<>();
//        names.add("justin");
//        names.add("javier");
//        names.add("bianca");
//
//        System.out.println(names.indexOf(":justin"));
//        System.out.println(names.indexOf("zzzzz"));


        // info about list and getting elements
//            System.out.println(numbers.size());
           //System.out.println(numbers.indexOf(3));
//            System.out.println(numbers);
//            System.out.println(numbers.indexOf(105));

//            ArrayList<String> roasts = new ArrayList<>();
//            roasts.add("medium");
//            roasts.add("light");
//            roasts.add("medium");
//            roasts.add("dark");
//            System.out.println(roasts);
//            System.out.println(roasts.contains("dark"));
//            System.out.println(roasts.contains("espresso"));
//            System.out.println(roasts.lastIndexOf("medium"));
//            System.out.println(roasts.isEmpty());
//
//            ArrayList<String> roast = roasts;
//            System.out.println(roast == roasts);

        /*
            TODO: create a static method, omit2s, that takes in an array list of integers.
              The method should return an arraylist of integers with the same values as the
              input arraylist but without 2s.
         */


        // ----------------------------- Hash Maps


        // creating hash maps
            HashMap<String, String> usernames = new HashMap<>();
            usernames.put("Ryan", "ryanorsinger");
            usernames.put("Luis", "MontealegreLuis");
            usernames.put("Zach", "zgulde");
            usernames.put("Fernando", "fmendozaro");
            usernames.put("Justin", "jreich5");

        // getting values from and info about hash map
           System.out.println(usernames);
           System.out.println(usernames.get("Justin"));
            System.out.println(usernames.get("Phillip"));
            System.out.println(usernames.get("Justin"));
            System.out.println(usernames.getOrDefault("Fred", "gocodeup"));
            System.out.println(usernames.containsKey("Luis"));

        // updating hash maps

//            usernames.put("Ryan", "rorsinger");
//            System.out.println(usernames);
//            usernames.put("Ryan", "Test");

//            usernames.putIfAbsent("Zach", "coderdude24");
//            usernames.putIfAbsent("Zach", "zgulde");
//            usernames.replace("Ryan", "torvalds"); // same as put
//            System.out.println(usernames);

        // removing pairs from hash map

//        System.out.println(usernames.remove("Zach"));
//        System.out.println(usernames.remove("Zach"));
//            System.out.println(usernames);
//            System.out.println(usernames);
//            usernames.clear();
//            System.out.println(usernames);
//            System.out.println(usernames.isEmpty());
        /*
            TODO: create a static method, createMap, that takes in two arraylists. The method should
              return a hashmap where the keys are the elements of the first passed arraylist and are
              connected to values of the second arraylist. Assume both input arraylists are lists of
              strings. Assume the lengths of both input arraylists are the same
              EXAMPLE:
                List<String> keys = new ArrayList<>(Arrays.asList(
                    "first key",
                    "second key",
                    "third key",
                    "fourth key"
                ));
                List<String> values = new ArrayList<>(Arrays.asList(
                    "first value",
                    "second value",
                    "third value",
                    "fourth value"
                ));
         */


    }

}