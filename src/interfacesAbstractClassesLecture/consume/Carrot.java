package interfacesAbstractClassesLecture.consume;

import interfacesAbstractClassesLecture.Consumable;

public class Carrot implements Consumable {
    private boolean isPeeled;
    //getters setters sonructors....


    public Carrot(boolean isPeeled) {
        this.isPeeled = isPeeled;
    }

    public Carrot() {

    }

    public boolean consume(){
        System.out.println("Eat , bit by bite");
        return false;
    }


    public void checkIfExpired() {
        System.out.println("observe colort and smell");
    }
        public void throwAway(){
            System.out.println("Throw into compost pile");
        }

    }

