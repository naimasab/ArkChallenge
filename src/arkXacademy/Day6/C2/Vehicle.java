package arkXacademy.Day6.C2;

import java.util.ArrayList;
import java.util.Scanner;

class Vehicle {
    private String make;
    private String model;
    private int rentalPrice;

    public Vehicle(String make, String model, int rentalPrice) {
        this.make = make;
        this.model = model;
        this.rentalPrice = rentalPrice;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getRentalPrice() {
        return rentalPrice;
    }

    public void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Rental Price: $" + rentalPrice);
    }
}
