package arkXacademy.Day6.C2;

import java.util.ArrayList;
import java.util.Scanner;
public class RentalAgency {
    private ArrayList<Vehicle> vehicles = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public RentalAgency() {
        vehicles.add(new Car("Toyota", "Camry", 500, "Red"));
        vehicles.add(new Car("Honda", "Accord", 600, "Blue"));
        vehicles.add(new Bike("Schwinn", "Mountain Bike", 200, true));
    }
    public void displayAvailableVehicles (){
        System.out.println("Available Vehicles in the Fleet:");
        int index = 0;
        for (Vehicle vehicle : vehicles) {
            System.out.println(index + ". " + vehicle.getMake() + " " + vehicle.getModel());
            index++;
        }
    }





    public void rentVehicle() {
        System.out.println("Enter the number of the vehicle you want to rent:");


        int choice = scanner.nextInt();

        if (choice >= 0 && choice < vehicles.size()) {
            Vehicle rentedVehicle = vehicles.get(choice);
            System.out.println("Renting a vehicle:");
            rentedVehicle.displayInfo();
            System.out.println("Vehicle rented successfully!");
            vehicles.remove(choice);
        } else {
            System.out.println("Invalid choice. Cannot rent a vehicle.");
        }
    }
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);

    }

}
