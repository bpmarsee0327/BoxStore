public class CleaningSupply extends HouseholdItem{
    private String scent;
    private String surfaceType;
    /**
     * @param scent
     * @param surfaceType
     * @param itemName
     * @param brand
     * @param price
     * @param quantity
     * @param description
     * @param returnPolicy
     * @param isRoomSpecific
     */
    public CleaningSupply(String scent, String surfaceType, String itemName, String brand, double price, int quantity, String description, String returnPolicy, boolean isRoomSpecific) {
        super(itemName, brand, price, quantity, description, returnPolicy, isRoomSpecific);
        this.scent = scent;
        this.surfaceType = surfaceType;
    }
//getters

    /**
     * get scent
     * @return scent
     */
    public String getScent(){
    return scent;
}

    /**
     * get surfaceType
     * @return surfaceType
     */
    public String getSurfaceType(){
    return surfaceType;}
//setters

    /**
     * set scent
     * @param scent
     */
    public void setScent(String scent){
    this.scent = scent;
}

    /**
     * set surfaceType
     * @param surfaceType
     */
    public void setSurfaceType(String surfaceType){
    this.surfaceType = surfaceType;
}
}