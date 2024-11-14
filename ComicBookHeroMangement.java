//importing the arrays to be able to use the 2d array list
import java.util.ArrayList;
import java.util.Arrays;

public class ComicBookHeroMangement{
    // Array list
    public ArrayList<Hero> heros = new ArrayList<Hero>();
    // the way to add the heros
    public void addHero(Hero hero){
        // adds the hero to the ArrayList
        heros.add(hero);
    }
    //The way to remove heros from the list
    public void removeHeros(String name){
        // remove hero if it has the same name that I type to be removed
        heros.removeIf(hero -> hero.getName().equals(name));
    }
    //the bubbleSort to sort the power level of the heroes from lowest to highest
    public void bubbleSortByPowerLevel(){
        //loops until it gets the heros into the right order
        for (int i = 0; i < heros.size() - 1; i++){
            for (int j = 0; j < heros.size() - 1; j++){
                if(heros.get(j).getLevel() > heros.get(j + 1).getLevel()){
                    //swaps heroes to right order if they are placed incorrectly
                    //using j as a temp to move the heroes to the right position
                    Hero temp = heros.get(j);
                    heros.set(j, heros.get(j + 1));
                    heros.set(j + 1, temp);
                }
            }
        }
    }
    // insertion sort for power level
    public void insertionSortByPowerLevel(){
        for(int i = 1; i<heros.size(); i++){
            Hero key = heros.get(i);
            int j = i - 1;

            while(j >= 0 && heros.get(j).getLevel() > key.getLevel()){
                heros.set(j + 1, heros.get(j));
                j--;
            }
            heros.set(j+1, key);
        }
    }
    // making the 2d array for the heroes
    public void dispayHeros2dArray(){

        String [][] heroArray = new String[heros.size()][3];

        //storing the information the array
        for(int i = 0; i <heros.size(); i++){
            heroArray[i][0] = heros.get(i).getName();
            heroArray[i][1] = String.valueOf(heros.get(i).getLevel());
            heroArray[i][2] = heros.get(i).getAffilation().toString();
        }

        // prints the list in a 2d array
        System.out.println(Arrays.deepToString(heroArray));
    }

    //display the hero in as a list
    public void displayHeros(){
        for(int i = 0; i< heros.size(); i++){
            System.out.println(heros.get(i));
        }
    }
}