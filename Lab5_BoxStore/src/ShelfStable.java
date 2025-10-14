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
    public ShelfStable(String itemName, String brand, double price, int quantity, String description, String returnPolicy, boolean perishable, String expirationDate,boolean isCanned) {
        super(itemName, brand, price, quantity, description, returnPolicy, perishable, expirationDate);
        this.isCanned = isCanned;
    }
    //Getters

    /**
     *
     * @return String isCanned
     */
    public boolean getIsCanned(){
        return isCanned;
    }
    //Setters

    /**
     *
     * @param isCanned
     */
    public void setIsCanned(boolean isCanned){
        this.isCanned = isCanned;
    }

}


