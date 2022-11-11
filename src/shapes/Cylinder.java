package shapes;

public class Cylinder extends IRoundedShape{
    public Cylinder(Double radius,Double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public void getArea(){
        System.out.println(2*Math.PI*radius + 2*Math.PI*Math.pow(this.radius, 2));

    }
}
