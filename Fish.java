
/**
 * Write a description of class Fish here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Fish extends Animal{
    private int depth;
    private int waterTemperature;
    
    public Fish(String name, String species, int price, String birthday, int depth, int waterTemperature){
        super(name, species, price, birthday);
        this.depth = depth;
        this.waterTemperature = waterTemperature;
    }
    
    public int getDepth(){
        return depth;
    }
    
    public int getWaterTemerature(){
        return waterTemperature;
    }
    
    @Override public String getFishDescription(){
        return (super.getFishDescription() +"\nAdditional info: Optimal depth: " + 
        depth + "cm\tWater temperature: " + waterTemperature + "°C\n");
    }
}
