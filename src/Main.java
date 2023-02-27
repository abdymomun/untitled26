import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2019, 10000.0, BodyType.SEDAN);
        System.out.println(car.bodyTypeIdentification());
        System.out.println(car.yearsSinceManufacture());

    }
}