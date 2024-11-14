public class Runner{
    public static void main(String[] args){
        ComicBookHeroMangement manager = new ComicBookHeroMangement();

        //adding the Heroes 
        manager.addHero(new Hero("Spider-Man", 90, HerosAffiliation.Avengers));
        manager.addHero(new Hero("Batman", 70, HerosAffiliation.JUSTICE_LEAGUE));
        manager.addHero(new Hero("Wolverine", 80, HerosAffiliation.X_MEN));
        manager.addHero(new Hero("Wonder Woman", 105, HerosAffiliation.JUSTICE_LEAGUE));
        
        //shows the orignal list
        System.out.println("Original List:");
        manager.displayHeros();
        
        //showned in bubble sort
        System.out.println("\nSorted by Power Level bubble sorted:");
        manager.bubbleSortByPowerLevel();
        manager.displayHeros();

        //removing a hero
        manager.removeHeros("Wonder Woman");
        System.out.println("\nList After Removing Wonder Woman");
        manager.bubbleSortByPowerLevel();
        manager.displayHeros();


        //adding a new hero
        manager.addHero(new Hero("The Human Torch", 85, HerosAffiliation.FANTASTIC_FOUR));
        System.out.print("\nList After Adding The Human Torch:"+ "\n");
        manager.bubbleSortByPowerLevel();
        manager.displayHeros();

        //showned in a 2d array format
        System.out.println("\nHero list shown in 2D array Format:");
        manager.bubbleSortByPowerLevel();
        manager.dispayHeros2dArray();

    }
}