package interfacesAbstractClassesLecture;


import java.util.Arrays;

public class Waiter extends Employee implements Transferable{

    @Override
    public String doWork() {
        return "Serving the guest...";
    }

    @Override
    public void transferToNewLocation(String location) {
        System.out.println("moving to " + location + " checking in with manager of " + location);
    }

    @Override
    public String[] getListOfPossibleTransferLocations() {
        // check comnay database fo rlist of preferred locations
        return new String[]{"location1","location2"};
    }


    public static void main(String[] args) {
//        Waiter waiter =  new Waiter();
//        System.out.println(waiter.doWork());
//
        Employee waiter = new Waiter();
        Employee developer = new Developer();

        Employee[] employees = {waiter, developer};
        employeesDOWork(employees);

        Transferable waiter = new Waiter();
        waiter.transferToNewLocation(" sna antonio 4");
        System.out.println(Arrays.toString(waiter.getListOfPossibleTransferLocations()));



    }


    public static void transferStuff(Transferable[] transferables){


    }




        public static void employeesDOWork(Employee[] employees){
            for(Employee e : employees){
                System.out.println(e.doWork());
            }
        }


}

