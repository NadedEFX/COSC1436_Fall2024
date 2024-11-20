public class Car extends Vehicle {
    // Private attribute for the number of doors that can't be used outside of Car class
    private int numberOfDoors;

    // Constuctor for the class
    public Car(int speed, double fuel, int numberOfDoors) {
        super(speed, fuel); //Calls the Vehicle constructor
        this.numberOfDoors = numberOfDoors;
    }
    // Override the start method from the Vehicle class to display a new message
    @Override
    // Method to start the vehicle 
    public void start(){
        super.start();
        System.out.println("Car has started");
    }
    // Method to make the car be able to honk
    public void honk(){
        System.out.println("Beep Beep!");
    }
    //getter for number of doors
    public int getNumberOfDoors(){
        return numberOfDoors;
    }
    // setter for number of doors
    public void setNumberOfDoors(int numberOfDoors){
        this.numberOfDoors = numberOfDoors;
    }
}