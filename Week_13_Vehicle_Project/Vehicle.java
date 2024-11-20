public class Vehicle{
    // Protected attribute for speed 
    protected int speed;
    // Private attribute for fuel can't be used outside the Vehicle class
    private double fuel;

    //Constructor to use speed and fuel
    public Vehicle(int speed, double fuel){
        this.speed = speed;
        this.fuel = fuel;

    }
    //Method to start the vehicle
    public void start(){
        System.out.println("Vehicle has started");
    }
    //Method to stop the vehicle
    public void stop(){
        System.out.println("Vehicle has stopped");
    }
    //Final Method to show fuel level cannot be changed because it's finalized as it's given max
    public final void displayFuel(){
        System.out.println("Fuel Level: " + fuel);
    }
    // Getter for the speed
    public int getSpeed(){
        return speed;
    }
    // Setter for the speed
    public void setSpeed(int speed){
        this.speed = speed;
    }
    // Getter for the fuel
    public double getFuel(){
        return fuel;
    }
    // setter for the fuel
    public void setFuel(double fuel){
        this.fuel = fuel;
    }
}