public class Fruit extends FoodItem{

    // VARIABLES
    private String fruitType;

    // CONSTRUCTOR
    public Fruit(String itemName, String brand, double price, int quantity, String description, String returnPolicy, String expirationDate, String color, boolean organic, double weight , String fruitType) {
        super(itemName, brand, price, quantity, description, returnPolicy, expirationDate);
        this.fruitType = fruitType;
    }

    // GETTERS
    public String getfruitType(){
        return this.fruitType;
    }
    // Setters
    public void setFruitType(String fruitType){
        this.fruitType = fruitType;
    }
}
