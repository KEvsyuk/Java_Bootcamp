package shapes;

public class Rhombus extends ICorneredShape{
    public Rhombus(Double length, Double width, Double height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public void getArea(){
        System.out.println(length * height);

    }
}
