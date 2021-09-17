package shapes;

public class Square extends Rectangle{


private int side;


    public Square(int s) {
        super(s,s);
        this.side =s;
    }



    public int getArea(){
        System.out.println("this is running getArea in Square class");
           return side*side;
         // return this.width * this.length;
    }
    public int getPerimeter(){
        System.out.println("this is running getPerimeter");
        return side *4;
        //return this.length*4;
    }

}
