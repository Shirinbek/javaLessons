package car;

public class SportCar extends Car {


    public SportCar(int mileage) {
        super(mileage);
    }

    @Override
    public void getSpeed() {

        System.out.println("Speed -> 300" );

    }
}
