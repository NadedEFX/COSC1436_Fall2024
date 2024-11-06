

public class SuperheroRoster
{
        public static void main(String[] args)
        {
         //step 1 declare hero names, ablilities, and power levels
             String[] heroNames = {"Spider-Man", "Iron Man", "Black Widow"};
             String[] abilities = {"Web-slinging", "Flying and high-tech armor", "Stealth and combat"};
             int[] powerLevels = {85, 90, 80};
             // step 2 Hero detail loop
             System.out.println("Hero Roster: ");
             for (int i = 0; i<heroNames.length; i++)
             {
               System.out.println(heroNames[i] + " Abilities " + abilities[i] + " - Power Level " + powerLevels[i]);
             }
             //Step 3 searchHero method
             searchHero(heroNames, abilities, powerLevels, "Iron Man");
             //Step 4 calculate and display the average power level
             double averagePower = calculateAveragePower(powerLevels);
             System.out.println("Average Power Level " + averagePower);
        }
        //Method: searchHero
    public static void searchHero(String[] names, String[] ablilities, int[] powerLevels, String target)
    {
      boolean found = false;
      for (int i = 0; i < names.length; i++)
      {
         if(names[i].equalsIgnoreCase(target))
         {
            System.out.println("Hero Found "+ names[i] + "-" + ablilities[i] + "- Power Level " + powerLevels[i]);
            found = true;
            break;
         }
         if(!found)
         {
            System.out.println("Hero " + target +" not found in the roster.");
         }
      }
    }
    //Method: calculateAveragePower
   public static double calculateAveragePower(int[] powerLevels)
   {
      int sum = 0;
      for (int power : powerLevels)
      {
         sum += power;
      }
      return (double) sum / powerLevels.length;
   } 
}
//Superhero class
class Superhero
{
   String name;
   String ability;
   int powerLevel;
   public Superhero(String name, String ability, int powerLevel)
   {
      this.name = name;
      this.ability = ability;
      this.powerLevel = powerLevel;
   }
   public void displayHero()
   {
      System.out.println("Hero "+ name + ", Ability " + ability + ", Power Level " + powerLevel);
   }
}