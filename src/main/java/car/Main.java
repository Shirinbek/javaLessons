package car;

public class Main {


    public static void main(String[] args) {

        Jeep tayota = new Jeep(100);
        tayota.setModel("Tayota LC 200");
        tayota.color = "black";
        tayota.year = 1999;

        SportCar bmw = new SportCar(20);
        bmw.setModel("bmw 5m");
        bmw.color = "black";
        bmw.year = 2021;

        tayota.drive();
        addSpeed(bmw);
        System.out.println(bmw.getModel());

    }

    public static void addSpeed(Car car){
        car.getSpeed();
    }
}
