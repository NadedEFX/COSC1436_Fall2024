public class Week13Runner
{
    public static void main(String [] args)
    {
        //Car object
        Car myCar = new Car(120,90,4,true);
        System.out.println("Testing the car that has an engine");
        // uses the start up command in Vehicle but is overriden by the Car start Method
        myCar.start();
        //shows the fuel of the car
        myCar.displayFuel();
        // makes the car honk by grabbing the Method from the Car Class
        myCar.honk();
        // using ther setter in the car class to change the amount of fuel the car has
        myCar.setFuel(20);
        // using the setter to change the number of doors the car has
        myCar.setNumberOfDoors(2);
        // displaying the new amount of fuel now because the setter changed the getter
        myCar.displayFuel();

        System.out.println("\nTesting the car without the engine");
        // changed the setter of the boolean to false so it gives the idea of a car without an engine
        myCar.setHasEngine(false);
        // Calls the start Method but it triggers the else because there's no engine in the car
        myCar.start();
        // displays the 
        myCar.displayFuel();
        myCar.honk();

        // Bicycle object
        Bicycle myBicycle = new Bicycle(25,0,true);
        System.out.println("\nTesting the bicycle");
        // using the start up command in Vehicle but is overriden by the Bicycle start Method
        myBicycle.start();
        // shows the amount fuel you have
        myBicycle.displayFuel();
        // allows the bike to use it's bell by getting the Method from the Bicycle class
        myBicycle.hasBell();
        
        /* changing the set amount of fuel to 0 because a bicycle doesn't 
        run on fuel the setter and getter run together the setter gets the
         new infomation and sends it to the getter then the getter sends it
          to the constructor to change the value */  
        myBicycle.setFuel(0);
        System.out.println("Bicycle doesn't need fuel because it's a bike");
        // changing the boolean of the bell to false to give the bike no bell, it uses the setter to accomplish this command
        myBicycle.setHasBell(false);
        myBicycle.hasBell();
    }
}