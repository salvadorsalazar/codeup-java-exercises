package Vehicles;

public class Vehicle {

    protected String name;

    public Vehicle() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeNoise() {
        System.out.println(name + "Vroom Vroom");
    }

//    public void breakingDownNoise() {
//    }


    public Vehicle(String name){
        this.name = name;
        System.out.println("a new vehicle has been created");
    }
}
