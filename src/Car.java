import java.awt.*;
import java.time.LocalDate;
import java.util.Scanner;

public class Car {
    private String brand;
    private int yearOfManufacture;
    private double price;
    private BodyType bodyType;

    public Car(String brand, int yearOfManufacture, double price, BodyType bodyType) {
        this.brand = brand;
        this.yearOfManufacture = yearOfManufacture;
        this.price = price;
        this.bodyType = bodyType;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public String bodyTypeIdentification() {
        while (true) {
            String result = "";
            String type = new Scanner(System.in).nextLine();
            switch (type) {
                case "SEDAN":
                    result = "автомобиль легкового класса";
                    break;
                case "CROSSOVER":
                    result = "автомобиль класса внедорожник";
                    break;
                case "OFFROAD":
                    result = "автомобиль класса внедорожник";
                    break;
                case "UNIVERSAL":
                    result = "автомобиль универсального класса";
                    break;
                default:
                    result = "тип кузова неизвестен";
            }
            return result;
        }
    }

    public int yearsSinceManufacture() {
        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();
        int yearsSinceManufacture = currentYear - yearOfManufacture;
        return yearsSinceManufacture;
    }
}

