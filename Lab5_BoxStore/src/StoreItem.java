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
        double withTax = price * 1.075; // chose 7.5% as is max in NC w/ local & state sales tax. Will override food later as it is an exception.
        return withTax;
    }
}
