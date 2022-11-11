package shapes;

public class Triangle extends ICorneredShape{
    public Triangle(Double length, Double width, Double height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public void getArea(){
        System.out.println(length * height/2);

    }
}
