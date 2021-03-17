/**
 * Write a description of class Animal here.
 *
 * @author (Hermann)
 * @version (v1)
 */

/**
 * 
 */
public class Animal{
    protected String name;
    protected String species;
    protected String birthday;
    protected int price;
    
    /**
     * 
     */
    public Animal(String name, String species, int price, String birthday){
        this.name = name;
        this.species = species;
        this.birthday = birthday;
        this.price = price;
    }
    
    /**
     * 
     */
    public String getName(){
        return name;
    }
    
    /**
     * 
     */
    public String getSpecies(){
        return species;
    }
    
    /**
     * 
     */
    public String getBirthday(){
        return birthday;
    }
    
    /**
     * 
     */
    public int getPrice(){
        return price;
    }
    
    /**
     * 
     */
    public String getAnimalDescription(){
        return "Species: " + species + "\tName: " + name + "\tPrice: " + price + "\tBirthday: " + birthday;    
    }
}
