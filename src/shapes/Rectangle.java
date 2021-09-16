package shapes;

public class Rectangle {

    protected int length;
    protected int width;

    public Rectangle(int l, int width) {
        this.length = l;
        this.width = width;
    }


    public int getArea(){
    return this.length*this.width;
    }

    public int getPerimeter(){
return ( this.length*2) + ( this.width*2);

    }

}
