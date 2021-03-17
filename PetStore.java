import java.util.ArrayList;
/**
 * Write a description of class PetStore here.
 *
 * @author (Hermann)
 * @version (v1)
 */

/**
 * Creates arraylist for object type Animal.
 * Creates variables storeName & adress.
 * Creates variable animal of type Animal.
 */
public class PetStore{
    private Animal animal;
    private String storeName;
    private String adress;
    private ArrayList<Animal> animals;

    /**
     * Sets value to the fields storeName & adress.
     * Instantiates animals arraylist.
     * Calls the methods createAnimals() & getInfo().
     */
    public PetStore(){
        storeName = "Dogs&Cats";
        adress = "Prost Lassens Gate 8";
        animals = new ArrayList<>();
        getInfo();
    }

    public void addAnimal(Animal animal){
        animals.add(animal);
    }

    /**
     * Prints storeName & adress.
     */
    private void getInfo(){
        System.out.println("Store name: " + storeName + "\nAdress: " + adress);
    }

    /**
     * Returns size of animals list.
     */
    private int getListSize(){
        return animals.size();
    }

    /**
     * Checks if list animals is empty.
     */
    private boolean isListEmpty(){
        if(getListSize() > 0){
            return false;
        }else{
            return true;
        }
    }

    /**
     * Creates a headder for printing of lists.
     */
    private void getListStart(){
        System.out.println("\nList of animals:");
    }

    private void getAnimals(){
        if(!isListEmpty()){
            for(Animal animal : animals){
                System.out.println(animal.getAnimalDescription());
            }
        }else{
            System.out.println("There are no current animals in the shop.");
        }
    }

    /**
     * Prints all animals in animals list.
     */
    public void printAnimals(){
        getListStart();
        if(!isListEmpty()){
            getAnimals();
            System.out.println("Number of animals: " + getListSize());
        }else{
            System.out.println("There are no animals in the store."); 
        }
    }

    /**
     * Prints all animals with a price under the value of the parameter
     * @param price limit for showing animals
     */
    public void printAnimalListPrice(int price){
        getListStart();
        int listSize = 0;
        for(Animal animal : animals){
            if(price > animal.getPrice()){
                listSize += 1;
                System.out.println(animal.getAnimalDescription());
            }         
        }

        if(listSize <= 0){
            System.out.println("No animals with price under " + price + "."); 
        }else{
            System.out.println("Number of animals: " + listSize + ".");
        }
    }

    /**
     * Prints all animals of the type entered in the parameter 
     * @param species searching for
     */
    public void printSpeciesList(String species){
        getListStart();
        int listSize = 0;
        for(Animal animal : animals){
            if(animal.getSpecies().equals(species)){
                listSize += 1;
                System.out.println(animal.getAnimalDescription());
            }
        }

        if(listSize <= 0){
            System.out.println("There are no animals of the species " + species + "."); 
        }else{
            System.out.println("Number of animals: " + listSize);
        }
    }
}
