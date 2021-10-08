import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ExceptionsLecture {

    public String couldBeAnInteger = "42";
    public String certainlyNotAnInteger = "No integer at all here";

//    public void askForAnInteger(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("please eneter an integer");
//        String input = sc.nextLine();
//        try{
//            int userInput = Integer.parseInt(input);
//            System.out.println("the integer in your strin gis   :" + userInput);
//        }catch(NumberFormatException e){
//            System.out.println("oh no "+ e.getMessage()+ " here is no ineger");
//        }finally {
//            System.out.println("Thank you , this is coming out of the finally clause,will run if there is no exeption or not.always runs on the end");
//        }
//
//    }
//    public void aMoreComplexAskForInteger(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter an integer");
//        String userInput = scanner.nextLine();
//        try {
//            userInput = null;
//            int userInputAsInteger = Integer.parseInt(userInput, 10, 15, 10);
//        } catch (NullPointerException npx){
//            System.out.println("Oops you didn't enter anything");
//            npx.printStackTrace();
//        } catch (IndexOutOfBoundsException iobx) {
//            System.out.println("Oops your string wasn't long enough");
//            iobx.printStackTrace();
//        } catch (NumberFormatException nfx){
//            System.out.println("No integer between chars 10 and 15");
//            nfx.printStackTrace();
//        } finally {
//            System.out.println("That was useful wasn't it?");
//        }
//    }

//    public void aMoreComplexAskForInteger(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter an integer");
//        String userInput = scanner.nextLine();
//        try {
//           //vv userInput = null;
//            int userInputAsInteger = Integer.parseInt(userInput, 10, 15, 10);
//        }  catch (IndexOutOfBoundsException iobx) {
//            System.out.println("Oops your string wasn't long enough");
//            iobx.printStackTrace();
//        } catch (NumberFormatException nfx) {
//            System.out.println("No integer between chars 10 and 15");
//            nfx.printStackTrace();
//        }
//            catch (Exception nfx){
//                System.out.println("Generic error");
//                nfx.printStackTrace();
//        } finally {
//            System.out.println("That was useful wasn't it?");
//        }
//    }



//------------------------------------------------------------
//    Given the following code, investigate the kinds of exceptions it could throw and write a try-catch structure catching these exceptions and providing the appropriate output messages. Be careful of where exactly you begin your try-catch structure. Optionally, add a finally clause.
//
//    Test your code to make sure that the exceptions are indeed caught. Test the code by entering a null value as the method's String parameter (subListMaker(null) or String sentence = null; subListMaker(sentence)), and by entering negative integers and integers larger than the number of words in the sentence as the user inputs. Try to modify the warning for an improper integer to suggest to the user what range of integers is acceptable.
//
//    To search for what exceptions a method throws, use the following search string: Java + number of your Java JDK + API + name of method. For example, Java 16 API substring.

    public void subListMaker(String sentence){
        Scanner scanner = new Scanner(System.in);

            System.out.println("Please enter an integer");
            int firstInt = scanner.nextInt();
            System.out.println("Please enter another integer");
            int secondInt = scanner.nextInt();
            System.out.println(sentence);
            ArrayList<String> wordArrayList = new ArrayList<String>();

            try {
                    String[] stringArray = sentence.split(" ");
                    for (String word : stringArray) {
                        wordArrayList.add(word);
                    }
                    List<String> shorterList = wordArrayList.subList(firstInt, secondInt);
                    String newSentence = String.join(" ", shorterList);
                    System.out.println(newSentence);

        }catch(IndexOutOfBoundsException e){
                System.out.println(" fot that sentecn i need inegersdg netweeon 0 and " + wordArrayList.size());
            }catch(NullPointerException e){
                System.out.println("this ethod was not provided with a sentence to operate on");
            }
//        catch(InputMismatchException e){
//            System.out.println("wrong input ");
//            e.printStackTrace();
//
//        }

            catch(IllegalArgumentException e){
                System.out.println(" out of range encountered");
                e.printStackTrace();
            }finally {
                System.out.println("END of CODE : out of try and catch tests");
            }

        }

//    public void subListMaker(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter an integer");
//        int firstInt = scanner.nextInt();
//        System.out.println("Please enter another integer");
//        int secondInt = scanner.nextInt();
//        System.out.println(sentence);
//        ArrayList<String> wordArrayList = new ArrayList<String>();
//        String[] stringArray = sentence.split(" ");
//        for (String word : stringArray){
//            wordArrayList.add(word);
//        }
//        List<String> shorterList =  wordArrayList.subList(firstInt, secondInt);
//        String newSentence = String.join(" ", shorterList);
//        System.out.println(newSentence);
//    }
//
}