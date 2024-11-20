

public class Car extends Vehicle {
    // Private attribute for the number of doors that can't be used outside of Car class
    private int numberOfDoors;
    private boolean hasEngine;

    // Constuctor for the class
    public Car(int speed, double fuel, int numberOfDoors, boolean hasEngine) {
        super(speed, fuel); //Calls the Vehicle constructor
        this.numberOfDoors = numberOfDoors;
        this.hasEngine = hasEngine;
    }

    // Override the start method from the Vehicle class to display a new message
    @Override
    // Method to start the vehicle also additional steps to have the car have an engine or not
    public void start(){
        // If shows that if it does have the engine it'll let you start up the car no problem
        if(hasEngine){
            super.start(); // lets you call the Vehicle constructor
            System.out.println("Car has started: Let's get this puppy on the rode");
        }
        // Else incase the car doesn't have an engine doesn't turn on like a real car if it doesn't have one
            else{
                stop();
                System.out.println("No engine red neck response: I know what's wrong with it, it got no gas in it");
            }
    }
    // Method that makes sure the car doesn't turn on if there isn't an engine
    public void stop(){
        System.out.println("Car doesn't start");
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
    //setter for the Engine
    public boolean hasEngine(){
        return hasEngine;
    }
    // getter for the Engine
    public void setHasEngine(boolean hasEngine){
        this.hasEngine = hasEngine;
    
    }
}