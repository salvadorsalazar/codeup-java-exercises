public class FighterTest {

    public static void main(String[] args){
        //we instantiate a figher object
        Fighter arata = new Fighter("arata",17,14);
//        arata.name = "Arata";
//        arata.hitPoints = 17;
//        arata.maxDamage = 14;
//        arata.printStats();
        arata.battleRoar();

        Fighter killore = new Fighter("killore",20,55);
//        killore.name = "Killore";
//        killore.hitPoints=20;
//        killore.maxDamage=55;
//        killore.printStats();
        killore.battleRoar();

        System.out.println("killore attacks and rolls a "+killore.attackRoll());
//        System.out.println(Club.maxDamage);
//        System.out.println(Integer.MAX_VALUE);


     //   arata.hitPoints=0;
        arata.setHitPoints(7);
        arata.printStats();

    }

}


//
//    Create a class for your favorite type of animal. The class should be named for your animal - Cat, Dog, Parrot etc. It should have two instance variables - name and sound - and one method - makeNoise(). The output of the makeNoise method should be name +  " goes " + sound. Create a test class with a main method to instantiate and test your class code.



//
//    Create a Quote class with a RandomQuote method. The method should generate a random number from 1 to 4. Depending on the result, the method should return a different quote. Now edit your animal class from the previous exercise so instead of an appropriate animal noise it makes a random quote. Test your animal class and verify that it now emits a random quote instead of an animal-appropriate noise.



//
//    Create an Employee class. The employee class should have a name instance variable, a static company variable set to Veridian Dynamics, and a non-static method displayEmployeeInfo(). displayEmployeeInfo() should generate a string, name + " works at " + company. Create a test class that instantiates three employee objects with different names. Run displayEmployeeInfo on all of them to show that each has access to the employee static variable. Bonus: write a method that has the employee emit a random quote and test it.

//
//    modify your animal class so that the name and noise are initiated during object construction, and the animal makes a noise when it is created.