package birds;

public class BirdTest {
    public static void main(String[] args) {
        Bird cardinal =  new Bird();
        cardinal.setName("cardinal");
        System.out.println(cardinal.getName() + " says:");
        cardinal.makeNoise();
        cardinal.move();

        //instantiating a new duck
        Duck mallard = new Duck();
        mallard.setName("mallard");
        System.out.println(mallard.getName()+" says:");
        mallard.makeNoise();
        mallard.move();


        Pigeon pigeon= new Pigeon();
        pigeon.setName("pigeon");
        System.out.println(pigeon.getName()+ "says");
        pigeon.makeNoise();
        pigeon.move();



        Bird myBird = new Duck();
        myBird.move();
        myBird.makeNoise();



        Duck rubberDucky =  new Duck();
        rubberDucky.setName("cody");
        System.out.println(rubberDucky.getName());
    }
}
