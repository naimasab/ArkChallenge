package arkXacademy.Day6.C2;

class Car extends Vehicle {
    private String color;

    public Car(String make, String model, int rentalPrice, String color) {
        super(make, model, rentalPrice);
        this.color = color;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Color: " + color);
    }
}
