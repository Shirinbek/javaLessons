package car;

public abstract class Car {


    private String model;
    String color;
    int year;


    protected int mileage;

    public Car(int mileage) {
        this.mileage = mileage;
    }

    public void drive() {
        System.out.println("Drive");
    }

    public abstract void getSpeed();

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}