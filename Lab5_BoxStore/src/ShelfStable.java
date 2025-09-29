public class ShelfStable extends FoodItem{
    // Variables
    private boolean isCanned;

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
     * @param isCanned
     */
    public ShelfStable(boolean isCanned, String itemName, String brand, double price, int quantity, String description, String returnPolicy, boolean perishable, String expirationDate) {
        super(itemName, brand, price, quantity, description, returnPolicy, perishable, expirationDate);
    }
    //Getters

    /**
     *
     * @return String isCanned
     */
    public boolean isCanned(){
        return isCanned;
    }
    //Setters

    /**
     *
     * @param isCanned
     */
    public void isCanned(boolean isCanned){
        this.isCanned = isCanned;
    }

}


