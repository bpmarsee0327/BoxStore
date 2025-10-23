import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class StoreItem {

    // VARIABLES
    private String itemName;
    private String brand;
    private double price;
    private int quantity;
    private String description;
    private String returnPolicy;

    // CONSTRUCTOR

    /**
     *
     * @param itemName
     * @param brand
     * @param price
     * @param quantity
     * @param description
     * @param returnPolicy
     */
    public StoreItem(String itemName, String brand, double price, int quantity, String description, String returnPolicy) {
        this.itemName = itemName;
        this.brand = brand;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
        this.returnPolicy = returnPolicy;
    }


    // GETTERS

    /**
     *
     * @return String itemName
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * retrieve name
     * @return String brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * retrieve brand
     * @return double price
     */
    public double getPrice() {
        return price;
    }

    /**
     * retrieve quantity
     * @return int quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     *retrieve description
     * @return String description
     */
    public String getDescription() {
        return description;
    }

    /**
     * retrieve return policy
     * @return String returnPolicy
     */
    public String getReturnPolicy() {
        return returnPolicy;
    }

    // SETTERS

    /**
     * set item's name
     * @param itemName
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * set the items name
     * @param brand item's brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     *to set the price for 1 of said item
     * @param price the price for x1 of an item
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * set quantity
     * @param quantity quantity of item
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * set description
     * @param description the description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * set return policy
     * @param returnPolicy return policy
     */
    public void setReturnPolicy(String returnPolicy) {
        this.returnPolicy = returnPolicy;
    }

    //other methods

    /**
     * to get string representation of class
     * @return the string of class
     */
    @Override
    public String toString() {
        return String.format("%s(%s) | $%.2f | Quantity x %d | Return Policy : %s", itemName, brand, price, quantity, returnPolicy);
    }

    /**
     * to create instance of storeItem
     *
     * @return new store item
     */
    public static StoreItem createItem() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n--- Create an item of cleaning supplies ---");

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

        StoreItem newStoreItem = new StoreItem(itemName, brand, price, quantity, description, returnPolicy);
        return newStoreItem;
    }

    /**
     * clones instance of store item
     *
     * @return clone of item
     */
    @Override
    public StoreItem clone() {
        StoreItem copy = new StoreItem(this.itemName, this.brand, this.price, this.quantity, this.description, this.returnPolicy);
        return copy;
    }

    /**
     * to get tax rate
     * @return the tax rate
     */
    public double getTaxRate() {
        return 0.0475;

    }
}