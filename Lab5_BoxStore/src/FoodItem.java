public class FoodItem extends StoreItem{

    // VARIABLES
    private boolean perishable;
    private String expirationDate;

    // CONSTRUCTOR
    /**
     *
     * @param itemName
     * @param brand
     * @param price
     * @param quantity
     * @param description
     * @param returnPolicy
     * @param perishable
     * @param expirationDate
     */
    public FoodItem(String itemName, String brand, double price, int quantity, String description, String returnPolicy, boolean perishable, String expirationDate){
        super(itemName, brand, price, quantity, description, returnPolicy);
        this.perishable = perishable;
        this.expirationDate = expirationDate;
    }

    // GETTERS
    /**
     *
     * @return boolean perishable
     */
    public boolean getPerishable(){
        return perishable;
    }
    /**
     *
     * @return String expirationDate
     */
    public String getExpirationDate(){
        return expirationDate;
    }

    // SETTERS
    /**
     *
     * @param perishable
     */
    public void setPerishable(boolean perishable){
        this.perishable = perishable;
    }
    /**
     *
     * @param expirationDate
     */
    public void setExpirationDate(String expirationDate){
        this.expirationDate = expirationDate;
    }
    // other methods

    @Override
    public double calculatePriceWithTax() {
        double withTax = getPrice() * 1.02; // 2% tax for food
        return  withTax;
    }
}
