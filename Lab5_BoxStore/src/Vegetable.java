public class Vegetable extends FoodItem{
    // VARIABLES
    private String color;
    private boolean organic;
    private double weight;
    private boolean rootVegetable;

    // CONSTRUCTOR
    public Vegetable(String itemName, String brand, double price, int quantity, String description, String returnPolicy, boolean perishable, String expirationDate, String color, boolean organic, double weight, boolean rootVegetable) {
        super(itemName, brand, price, quantity, description, returnPolicy, expirationDate);
        this.color = color;
        this.organic = organic;
        this.weight = weight;
        this.rootVegetable = rootVegetable;
    }

    // GETTERS
    /**
     *
     * @return string color
     */
    public String getColor() {return color;}
    /**
     *
     * @return boolean organic
     */
    public boolean getOrganic() {return organic;}
    /**
     *
     *
     * @return double weight
     */
    public double getWeight() {return weight;}
    /**
     *
     * @return boolean rootVegetable
     */
    public boolean getRootVegetable() {return rootVegetable;}

    // SETTERS
    /**
     *
     * @param color
     */
    public void setColor(String color) {this.color = color;}
    /**
     *
     * @param organic
     */
    public void setOrganic(boolean organic) {this.organic = organic;}
    /**
     *
     * @param weight
     */
    public void setWeight(double weight) {this.weight = weight;}
    /**
     *
     * @param rootVegetable
     */
    public void setRootVegetable(boolean rootVegetable) {this.rootVegetable = rootVegetable;}
}
