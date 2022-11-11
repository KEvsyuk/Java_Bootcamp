package shapes;

public class Kite extends ICorneredShape{
    public Kite(Double length, Double width, Double height,Double diagonal1, Double diagonal2){
        this.length = length;
        this.width = width;
        this.height = height;
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;

    }

    @Override
    public void getArea(){
        System.out.println(diagonal1*diagonal2/2);

    }
}
