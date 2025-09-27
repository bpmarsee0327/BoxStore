public class HouseholdItem extends StoreItem{

    // VARIABLES
    private boolean isRoomSpecific;

    // CONSTRUCTOR
    /**
     *
     * @param itemName
     * @param brand
     * @param price
     * @param quantity
     * @param description
     * @param returnPolicy
     * @param isRoomSpecific
     */
    public HouseholdItem(String itemName, String brand, double price, int quantity, String description, String returnPolicy, boolean isRoomSpecific){
        super(itemName, brand, price,quantity, description, returnPolicy);
        this.isRoomSpecific = isRoomSpecific;
    }

    // GETTERS
    /**
     *
     * @return boolean isRoomSpecific
     */
    public boolean getIsRoomSpecific(){
        return isRoomSpecific;
    }

    // SETTERS
    /**
     *
     * @param isRoomSpecific
     */
    public void setIsRoomSpecific(boolean isRoomSpecific){
        this.isRoomSpecific = isRoomSpecific;
    }
}
