import java.time.LocalDate;

// INHERITANCE

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        LocalDate carManufacturingDate = LocalDate.now();


        SportsCar sportsCar = new SportsCar(carManufacturingDate);
        sportsCar.drive();
    }
}

// parent class
class Car {
    private LocalDate manufacturingDate;

    public Car(LocalDate manufacturingDate){
        this.manufacturingDate = manufacturingDate;
    }
    void turnOnEngine(){
        System.out.println("Engine is running...!");
    }

    public LocalDate getManufacturingDate(){
        return manufacturingDate;
    }
}

// child class
class SportsCar extends Car {
    public SportsCar(LocalDate manufacturingDate){
        super(manufacturingDate);
    }
    @Override
    void turnOnEngine(){
        super.turnOnEngine();
        System.out.println("You can drive now");
    }

    public void drive(){
        turnOnEngine();
        System.out.println("I'm driving!");
    }

    public void carInfo(){

        System.out.println("Car was built on: "+ this.getManufacturingDate());
    }
}


// private access = only accessible in this class
// if you don't specify and write only "void" = assigns default access modifier
// inheritance happens between only two classes = you can't extend 2 classes at once
// what is @Override ?








