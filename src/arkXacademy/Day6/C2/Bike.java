package arkXacademy.Day6.C2;

class Bike extends Vehicle {
    private boolean hasBaskets;

    public Bike(String make, String model, int rentalPrice, boolean hasBaskets) {
        super(make, model, rentalPrice);
        this.hasBaskets = hasBaskets;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has Baskets: " + hasBaskets);
    }
}
