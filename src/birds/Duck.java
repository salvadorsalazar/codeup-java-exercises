package birds;

public class Duck extends Bird{

    //lets override the superclass makeNoise(0 method
    public void makeNoise(){
        System.out.println("quack,quack");
    }
public void move(){

    System.out.println("swims");
}
    public Duck() {
    }
//
//    public void setName(String duckName){
//    super.name = duckName;
////        this.setName(duckName);
//
//}
//    public Duck(String name){
////        this.setName(name);
//        super(name);
//        System.out.println("A new duck has been created.");
//    }
}
