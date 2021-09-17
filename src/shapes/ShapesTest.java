package shapes;


public class ShapesTest {
    public static void main(String[] args) {


        Measurable newShape ;
        newShape  = new Rectangle(5,5);

        System.out.println(newShape.getArea());
        System.out.println(newShape.getperimiter());

//        Measurable newShape2;
        newShape = new Square(5);
        System.out.println(newShape.getArea());
        System.out.println(newShape.getperimiter());

//       Modify your ShapesTest class, use it to:
//       declare a variable of the type Measurable named myShape.
//      Test your code by creating instances of both Square and Rectangle and assigning them to myShape so you        can display the shape's area and perimeter.




//        newShape = new Square(9);
//        System.out.println(newShape.getArea());
//        System.out.println(newShape.getperimiter());


//
//Rectangle box1 = new Rectangle(5,4);
//        System.out.println(box1.getArea());
//        System.out.println(box1.getPerimeter());
//
//Rectangle box2 = new Square(5);
//        System.out.println(box2.getArea());
//        System.out.println(box2.getPerimeter());

//    Square box3 = new Square(6);
//    System.out.println(box3.getArea());
//    System.out.println(box3.getPerimeter());
   }

}
