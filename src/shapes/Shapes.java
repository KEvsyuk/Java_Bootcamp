package shapes;

public class Shapes {

    public static void main(String[] args) {
        Square mySquare = new Square(5.0);

        Rectangle myRectangle = new Rectangle(7.0,3.5);

        Parallelogram myParallelogram = new Parallelogram(6.0,5.0,3.0);

        Triangle myTriangle = new Triangle(7.0,4.0,5.0);

        Kite myKite = new Kite(7.0,5.0,8.0,8.0,6.0);

        Rhombus myRhombus = new Rhombus(6.0,5.0,3.0);


        Circle myCircle = new Circle(3.0,1.0);

        Cylinder myCylinder = new Cylinder(4.0,6.0);

        System.out.println("Area of the square: ");
        mySquare.getArea();
        System.out.println("Area of the rectangle: ");
        myRectangle.getArea();
        System.out.println("Area of the parallelogram: ");
        myParallelogram.getArea();
        System.out.println("Area of the triangle: ");
        myTriangle.getArea();
        System.out.println("Area of the kite: ");
        myKite.getArea();
        System.out.println("Area of the rhombus: ");
        myRhombus.getArea();

        System.out.println("Area of the circle: ");
        myCircle.getArea();
        System.out.println("Area of the cylinder: ");
        myCylinder.getArea();

    }
}
/*
class BlackKnight
private fields for arms, legs and head
 */