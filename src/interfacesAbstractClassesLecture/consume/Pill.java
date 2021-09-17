package interfacesAbstractClassesLecture.consume;

import interfacesAbstractClassesLecture.Consumable;

public abstract class Pill implements Consumable {
private String medicationName;
private String pharmacistInstructions;

//getters setters constructors

    public boolean consume(){
        System.out.println("Drink down the fluid");
        return false;
    }



    public void checkIfExpired(){
        System.out.println("" +
                "chec expiration date on pill bottle");
    }

    public void thowAway(){
        System.out.println("wash down sink...DONT DO THIS!!");
    }

}
