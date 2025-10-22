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
    public StoreItem(String itemName, String brand, double price, int quantity, String description, String returnPolicy){
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
     *
     * @return String brand
     */
    public String getBrand(){
        return brand;
    }

    /**
     *
     * @return double price
     */
    public double getPrice(){
        return price;
    }

    /**
     *
     * @return int quantity
     */
    public int getQuantity(){
        return quantity;
    }

    /**
     *
     * @return String description
     */
    public String getDescription(){
        return description;
    }

    /**
     *
     * @return String returnPolicy
     */
    public String getReturnPolicy(){
        return returnPolicy;
    }

    // SETTERS

    /**
     *
     * @param itemName
     */
    public void setItemName(String itemName){
        this.itemName = itemName;
    }

    /**
     *
     * @param brand
     */
    public void setBrand(String brand){
        this.brand = brand;
    }

    /**
     *
     * @param price
     */
    public void setPrice(double price){
        this.price = price;
    }

    /**
     *
     * @param quantity
     */
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    /**
     *
     * @param description
     */
    public void setDescription(String description){
        this.description = description;
    }

    /**
     *
     * @param returnPolicy
     */
    public void setReturnPolicy(String returnPolicy){
        this.returnPolicy = returnPolicy;
    }

    //other methods

    /**
     * To calculate taxed price
     * @return double of the price accounting for tax.
     */
    public double calculatePriceWithTax(){
        double withTax = getPrice() * 1.075; // 7.5% tax
        BigDecimal rounded = new BigDecimal(withTax).setScale(2, RoundingMode.HALF_UP);
        withTax = rounded.doubleValue();
        return  withTax;
    }

    @Override
    public String toString() {
        return String.format("%s(%s) : $%.2f : Quantity x %d", itemName, brand, price, quantity);
    }

    /**
     * to create instance of storeItem
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
     * @return clone of item
     */
    @Override
    public StoreItem clone() {
        StoreItem copy = new StoreItem(this.itemName, this.brand, this.price, this.quantity, this.description, this.returnPolicy);
        return copy;
    }
}
