package lessons;

public class Circle {

    private double radius;

    public Circle(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Argument less than 0");
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Argument less than 0");
        }
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2); // radius * radius
    }
}

class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        double result = circle.getArea();
        System.out.println(result);
        // Округляем
        double resultSecond = Math.round(result);
        System.out.println(resultSecond);


    }
}
