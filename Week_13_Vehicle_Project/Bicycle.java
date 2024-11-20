public class Bicycle extends Vehicle{
    // Private boolean that works like a power switch that turns on or off that can't be used outside Bicycle class
    private boolean hasBell;

    //constructor for the class
    public Bicycle(int speed, double fuel, boolean hasBell){
        super(speed, fuel); //Calls the Vehical constructor
        this.hasBell = hasBell;
    }
    // Override the vehicle class to display a different message
    @Override
    // Method that makes the bike get ready to pedal
    public void start(){
        super.start();
        System.out.println("Pedel away!");
    }
    // Method to make the bell be able to ring
    public void hasBell(){
       // If the bike has a bell then it'll ring 
       if(hasBell){ 
        System.out.println("Ring Ring!");
       }
       // The else statement is used if the bike doesn't have a bell 
       else {
        System.out.println("This bike doesn't have a bell");
       }
    }
    // getter for the Bell
    public boolean getHasBell(){
        return hasBell;
    }
    // Setter for the Bell
    public void setHasBell(boolean hasBell){
        this.hasBell = hasBell;
    }
}