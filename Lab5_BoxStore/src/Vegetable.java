public class Vegetable extends FoodItem{
    // VARIABLES
    private boolean rootVegetable;

    // CONSTRUCTOR
    public Vegetable(String itemName, String brand, double price, int quantity, String description, String returnPolicy, String expirationDate, String color, boolean organic, double weight, boolean rootVegetable) {
        super(itemName, brand, price, quantity, description, returnPolicy, expirationDate);

        this.rootVegetable = rootVegetable;
    }

    // GETTERS

    /**
     *
     * @return boolean rootVegetable
     */
    public boolean getRootVegetable() {return rootVegetable;}

    // SETTERS

    /**
     *
     * @param rootVegetable
     */
    public void setRootVegetable(boolean rootVegetable) {this.rootVegetable = rootVegetable;}
}
