public class Week13Runner
{
    public static void main(String [] args)
    {
        Car myCar = new Car(120,90,4);
        System.out.println("Testing the car");
        myCar.start();
        myCar.displayFuel();
        myCar.honk();

        myCar.setFuel(20);
        System.out.println("Fuel level now at 4" + myCar.getFuel());
        myCar.setNumberOfDoors(2);


        Bicycle myBicycle = new Bicycle(25,0,true);
        System.out.println("\nTesting the bicycle");
        myBicycle.start();
        myBicycle.displayFuel();
        myBicycle.hasBell();
        
        myBicycle.setFuel(0);
        System.out.println("Bicycle doesn't need fuel because it's a bike");
        myBicycle.setHasBell(false);
        myBicycle.hasBell();
    }
}