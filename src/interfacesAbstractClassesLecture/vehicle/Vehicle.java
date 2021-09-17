package interfacesAbstractClassesLecture.vehicle;

abstract public class Vehicle {
    public int currentSpeedMph;
    public String directionHeading;
    public int currentNoOfPassengers;

    abstract public void turnOn();


    public void goFaster(int moreMph){
        currentSpeedMph += moreMph;
    }

}
