package shapes;

public class Rectangle extends Quadrilateral implements Measurable{

    public Rectangle(double length, double width) {
        super(length, width);
    }


    @Override
    public double getperimiter() {
        return this.length*2 + this.length*2;
    }

    @Override
    public double getArea() {
        return this.length*this.width;
    }

    @Override
    public void setLength(double newLength) {
this.length = newLength;
    }

    @Override
    public void setWidth(double newWidth) {
this.width = newWidth;
    }




    //
//    protected int length;
//    protected int width;
//
//    public int getLength() {
//        return length;
//    }
//
//    public void setLength(int length) {
//        this.length = length;
//    }
//
//    public int getWidth() {
//        return width;
//    }
//
//    public void setWidth(int width) {
//        this.width = width;
//    }
//
//    public Rectangle(){
//
//    }
//    public Rectangle(int length, int width) {
//        this.length = length;
//        this.width = width;
//    }
//
//
//    public int getArea(){
//        System.out.println("getArea from Rectangle class");
//
//        return this.length*this.width;
//    }
//
//    public int getPerimeter(){
//        System.out.println("getPerimeter from Rectangle class");
//
//        return ((this.length*2) + (this.width*2));
//    }

}
