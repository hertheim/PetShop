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

    /**
     * Creates Mamal object.
     * Adds the object to the arraylist animals.
     */
    public void addMamal(String name, String species, int price, String birthday, int gestationPeriod, int litterAverage){
        Animal animal = new Mammal(name, species, price, birthday, gestationPeriod, litterAverage);
        animals.add(animal);
    }

    /**
     * Creates Fish object.
     * Adds the object to the arraylist animals.
     */
    public void addFish(String name, String species, int price, String birthday, int depth, int waterTemperature){
        Animal animal = new Fish(name, species, price, birthday, depth, waterTemperature);
        animals.add(animal);
    }

    /**
     * Creates Bird object.
     * Adds the object to the arraylist animals.
     */
    public void addBird(String name, String species, int price, String birthday, int wingspan, String color){
        Animal animal = new Bird(name, species, price, birthday, wingspan, color);
        animals.add(animal);
    }

    /**
     * Prints storeName & adress.
     */
    private void getInfo(){
        System.out.println("Store name: " + storeName + "\nAdress: " + adress);
    }

    public void animalTest(){
        Animal animal;
        // create new animals
        animals.add(animal = new Mammal("Balder", "Dog", 3000, "01.02.2020", 60, 5));
        animals.add(animal = new Mammal("Pepsi", "Dog", 10000, "01.03.2020", 60, 5));
        animals.add(animal = new Mammal("Rubi", "Dog", 5000, "01.04.2020", 60, 5));
        animals.add(animal = new Mammal("Pus", "Cat", 1500, "01.05.2020", 63, 6));
        animals.add(animal = new Mammal("Gråtass", "Cat", 1000, "01.06.2020", 63, 6));
        animals.add(animal = new Bird("Pip", "Bird", 500, "01.01.2021", 20, "Blue"));
        animals.add(animal = new Fish("Bob", "Fish", 200, "04.02.2021", 15, 24));
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

    /**
     * Prints all animals in animals list.
     */
    public void printAnimals(){
        getListStart();
        if(!isListEmpty()){
            for(Animal animal : animals){
                if(Mammal.class.isInstance(animal)){
                    System.out.println(animal.getMammalDescription());
                }
                if(Bird.class.isInstance(animal)){
                    System.out.println(animal.getBirdDescription());
                }
                if(Fish.class.isInstance(animal)){
                    System.out.println(animal.getFishDescription());
                }
            }   
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
                if(Mammal.class.isInstance(animal)){
                    System.out.println(animal.getMammalDescription());
                }
                if(Bird.class.isInstance(animal)){
                    System.out.println(animal.getBirdDescription());
                }
                if(Fish.class.isInstance(animal)){
                    System.out.println(animal.getFishDescription());
                }
                listSize += 1;
            }         
        }

        if(!Animal.class.isInstance(animal)){
            System.out.println("No animals with price under " + price + "."); 
        }else{
            System.out.println("Number of animals: " + listSize);
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
                if(Mammal.class.isInstance(animal)){
                    System.out.println(animal.getMammalDescription());
                }
                if(Bird.class.isInstance(animal)){
                    System.out.println(animal.getBirdDescription());
                }
                if(Fish.class.isInstance(animal)){
                    System.out.println(animal.getFishDescription());
                }
                listSize += 1;
            }
        }

        if(!Animal.class.isInstance(animal)){
            System.out.println("There are no animals of the species " + species + "."); 
        }else{
            System.out.println("Number of animals: " + listSize);
        }
    }
}
