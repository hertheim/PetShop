
/**
 * Write a description of class Bird here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bird extends Animal{
    private int wingspan;
    private String color;
    
    public Bird(String name, String species, int price, String birthday, int wingspan, String color){
        super(name, species, price, birthday);
        this.wingspan = wingspan;
        this.color = color;
    }
    
    public int getWingSpan(){
        return wingspan;
    }
    
    public String getColor(){
        return color;
    }
    
    @Override public String getBirdDescription(){
        return (super.getBirdDescription() +"\nAdditional info: Wingspan: " + 
        wingspan + "cm\tColor: " + color + "\n");
    }
}
