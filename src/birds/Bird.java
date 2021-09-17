package birds;

public class Bird {
    //what kind of Bird is it?
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeNoise(){
        System.out.println("tweet tweet");
    }

    public void move(){
        System.out.println("flap flap");
    }

    //default contructor
    public Bird(){

    }
}
