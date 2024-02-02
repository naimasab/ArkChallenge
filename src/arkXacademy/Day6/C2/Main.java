package arkXacademy.Day6.C2;

public class Main {
    public static void main(String[] args) {
        RentalAgency rentalAgency = new RentalAgency();
        Vehicle additionalVehicle = new Car("Chevrolet", "Cruze", 450, "Green");
        rentalAgency.displayAvailableVehicles();
        rentalAgency.addVehicle(additionalVehicle);
        rentalAgency.rentVehicle();
        rentalAgency.displayAvailableVehicles();
    }
}
