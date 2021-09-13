public class Dog {

    private String name;
    private String sound;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    public void callDog() {
        System.out.println("I am a dog named ," + name + " and I go " + sound);
        System.out.println(Quote.randomNumber());


    }

    public void dogSound() {
      System.out.println(" I make a noise of : " + sound);

    }

//    public int quotePicker() {
//
//        return Quote.randomNumber();
//    }


    public Dog(){

    }

    public Dog(String name,String sound){
        this.name=name;
        this.sound = sound;
        this.dogSound();


    }

}