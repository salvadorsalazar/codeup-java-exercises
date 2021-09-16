package shapes;

public class Square extends Rectangle{


public int sides;


    public Square(int s) {
        super(s,s);
    }

//    @Override
//    public int getArea() {
//        return super.getArea();
//    }

    public int getArea(){
        System.out.println("this is running getArea in Square class");
//return 4*s;
               return this.width * this.length;
    }
    public int getPerimeter(){
        System.out.println("this is running getPerimeter");
        return this.length*4;
    }

}
