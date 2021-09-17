package interfacesAbstractClassesLecture;

import java.util.Arrays;

public class Waiter extends Employee implements Transferable {

    public String doWork() {
        return "Serving the guests...";
    }

    @Override
    public void syncUp() {
        System.out.println("Talk with manager");
    }


    @Override
    public void syncup() {

    }

    @Override
    public void escalateQuestion() {
        System.out.println("Flag manager down and ask question");
    }

    @Override
    public void transferToNewLocation(String location) {
        System.out.println("Moving to " + location + ". Checking with manager of that location...");
    }

    @Override
    public String[] getListOfPossibleTransferLocations() {
        // check company database for list of my preferred transfer locations
        return new String[] {"location1", "location2"};
    }

    public static void main(String[] args) {
        // Waiter waiter = new Waiter();
        // System.out.println(waiter.doWork());

        // Can we create an employee of type Employee? no

        // Can we create an employee of type Waiter? no

        // Can we create a waiter of type Waiter? yes

        // Can we create a waiter of type Employee? yes
        // Employee waiter = new Waiter();
        // Employee developer = new Developer();
        //
        // Employee[] employees = {waiter, developer};
        // employeesDOWork(employees);



        // Out of the four pillars of OOP, what does this best demonstrate??????
        // abstraction, inheritance, polymorphism, encapsulation?
        // POLYMORPHISM

        // Why? ?????????

        // why does it not make sense for doWork in Employee to be private?

        Transferable waiter = new Waiter();
        Transferable gameConsole = new GameConsole();
        waiter.transferToNewLocation("San Antonio Location 4");
        // System.out.println(Arrays.toString(waiter.getListOfPossibleTransferLocations()));

        Transferable[] transferables = {waiter, gameConsole};
        transferStuff(transferables, "Dallas, TX");


    }

    public static void transferStuff(Transferable[] transferables, String location) {
        for (Transferable transferable : transferables) {
            transferable.transferToNewLocation(location);
        }
    }



    public static void employeesDOWork(Employee[] employees) {
        for (Employee e : employees) {
            System.out.println(e.doWork());
        }
    }

}