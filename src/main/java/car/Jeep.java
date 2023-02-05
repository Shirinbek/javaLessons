package car;

public class Jeep extends Car {

    public Jeep(int mileage) {
        super(mileage);
    }

    @Override
    public void getSpeed() {
        System.out.println("Speed -> 200");
    }
}
