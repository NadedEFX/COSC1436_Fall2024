public class Hero
{
    //heros class atrributes
    public String name;
    public int level;
    public HerosAffiliation affiliation;
    // hero constructor to make it so we can add new heroes
    public Hero(String hero, int level, HerosAffiliation affiliation){
        this.name = hero;
        this.level = level;
        this.affiliation = affiliation;
    }
    //the getter method
    public String getName(){
        return name;
    }
    public int getLevel(){
        return level;
    }
    public HerosAffiliation getAffilation(){
        return affiliation;
    }
    //The toString () for to return hero details as a string
    public String toString(){
        return "Hero: " + name + "\nLevel: " + level + "\nAffiliation: " + affiliation;
    }
}