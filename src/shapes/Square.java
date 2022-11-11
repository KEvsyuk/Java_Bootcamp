package shapes;

public class Square extends ICorneredShape{

    public Square (Double length){
        this.length = length;
    }

    @Override
    public void getArea(){
        System.out.println(Math.pow(this.length, 2));
    }
}
