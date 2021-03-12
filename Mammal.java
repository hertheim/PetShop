/**
 * Write a description of class Fish here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Mammal extends Animal{
    private int gestationPeriod;
    private int litterAverage;
    
    public Mammal(String name, String species, int price, String birthday, int gestationPeriod, int litterAverage){
        super(name, species, price, birthday);
        this.gestationPeriod = gestationPeriod;
        this.litterAverage = litterAverage;
    }
    
    public int getGestationPeriod(){
        return gestationPeriod;
    }
    
    public int getLitterAverage(){
        return litterAverage;
    }
  
    @Override public String getMammalDescription(){
        return (super.getMammalDescription() +"\nAdditional info: Gestation period: " + 
        gestationPeriod + "\tLitter average: " + litterAverage + "\n");
    }
}
