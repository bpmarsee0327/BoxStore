import java.util.Scanner;

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
    //other
    /**
     * to add/create new fruit to inventory
     * @return newFruit
     */
    public static Fruit createItem(){
        Scanner input = new Scanner(System.in);
        System.out.println("\n--- Create a fruit ---");

        System.out.print("Enter item name: ");
        String itemName = input.nextLine();

        System.out.print("Enter brand: ");
        String brand = input.nextLine();

        System.out.print("Enter price: ");
        double price = input.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();
        input.nextLine();

        System.out.print("Enter description: ");
        String description = input.nextLine();

        System.out.print("Enter return policy: ");
        String returnPolicy = input.nextLine(); // end of inheritance from storeItem

        System.out.print("Enter the expiration date: ");
        String expirationDate = input.nextLine(); // end of inheritance from Fooditem

        System.out.print("Enter the color of the fruit: ");
        String color = input.nextLine();

        System.out.print("Enter in if the fruit is organic (true/false): ");
        Boolean organic = input.nextBoolean();

        System.out.print("Enter the weight of the fruit: ");
        double weight = input.nextDouble();

        System.out.print("Enter the fruit type: ");
        String fruitType = input.nextLine();

        Fruit newFruit = new Fruit( itemName,  brand,  price,  quantity,  description,  returnPolicy,  expirationDate,  color,  organic,  weight ,fruitType);
        return newFruit;

    }
    /**
     * clones instance of fruit
     * @return clone of item
     */
    @Override
    public Fruit clone() {
        Fruit copy = new Fruit(this.getItemName(), this.getBrand(), this.getPrice(), this.getQuantity(), this.getDescription(),
                this.getReturnPolicy(), this.getExpirationDate(),this.getColor(),this.getOrganic(),this.getWeight(),this.fruitType);
        return copy;
    }
}
