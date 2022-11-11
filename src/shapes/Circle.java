package shapes;

public class Circle extends IRoundedShape{
    public Circle(Double radius,Double height){
        this.radius = radius;
        this.height = height;

    }

    @Override
    public void getArea(){
        System.out.println(2*Math.PI*radius);

    }
}
