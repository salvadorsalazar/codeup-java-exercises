//package Vehicles;
//
//public class VehicleTest {
//    public static void main(String[] args) {
//
////        Vehicle car = new Vehicle("ford mustiang");
////        //car.setName("Ford Mustang");
////        System.out.println("name of car :" +car.getName());
////        car.makeNoise();
////
////
////        Vehicle truck = new Vehicle("toyota tundra");
////        //truck.setName("Toyota Tundra");
////        System.out.println("name of truck :" +truck.getName());
////        truck.makeNoise();
////        truck.breakingDownNoise();
//
//
//        Vehicle newVehicle =  new Vehicle();
//        newVehicle.setName("ford fiesta");
//        System.out.println(newVehicle.getName());
//
//Boat boat = new Boat();
//
//ninja.name = "ninja";
//ninja.makenoise();
//
//    }
//}

//--------------------warmup for thursday september 16th.
//
//    Create a new kind of vehicle that extends vehicle. Define the class as final. Create a makeNoise method that overrides the superclass method. Test it in your VehicleTest class. Now alter it so your subclass makeNoise method calls the superclass makeNoise method in addition to its own noise. Add one of your new kinds of vehicles to the array of vehicles in your Garage or Marina or Hangar and trigger the alarmCascade method to verify that your new car can exist in a polymorphic array. Add a subclass constructor that takes a String argument and make sure you have no errors.

//#2
//Challenge.
//        In the birds package, create an Ornithologist class. The ornithologist should have a changeBirdName method that takes a String newBirdName and a Bird birdToRename as its parameters. It should allow the ornithologist to change the bird's name and announce that it has changed the name from the old name to the new name. Create an OrnithologyConference class. Instantiate an ornithologist and a new bird and have the ornithologist announce the name change on the new bird.

//#3
//        Challenge.
//        Modify the Birds class so as to keep count of how many birds are created and output the bird count every time a new bird is created. DRY out the code.

//
//    Create a Car class if you have not already done so. It should be a subclass of Vehicle. Create a Garage class with two properties. It should have a Vehicle array called vehicles, and an alarmCascade() method that simulates all the vehicles in the array having their alarms go off in sequence. Create a GarageTest class. Create at least three cars and set their names. Put them in an array of vehicles. Instantiate a garage, assign your array to the garage's vehicles property and run the alarmCascade method. Now replace one of the cars with another type of vehicle. Run the alarmCascade method again and note that the vehicles array is polymorphic and can contain different types of vehicles.








//
//    Create a breakingDownNoise() method in the subclass. It should call super.makeNoise() and then add a second sout that adds a second noise after the first one.



//
//    Create a method in the subclass of the Vehicles.Vehicle class that overrides the superclass makeNoise method.