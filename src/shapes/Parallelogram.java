package shapes;

public class Parallelogram extends ICorneredShape{

    public Parallelogram(Double length, Double width, Double height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public void getArea(){
        System.out.println(length * height);

    }
}
