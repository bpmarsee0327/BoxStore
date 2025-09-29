public class TV extends ElectronicsItem{
    //Variables
    private String TVType;
    private String TVResolution;

    /**
     *
     * @param itemName
     * @param brand
     * @param price
     * @param quantity
     * @param description
     * @param returnPolicy
     * @param modelNumber
     * @param isPortable
     * @param warrantyPeriod
     * @param yearReleased
     */
    public TV(String TVType, String TVResolution, String itemName, String brand, double price, int quantity, String description, String returnPolicy, String modelNumber, boolean isPortable, int warrantyPeriod, int yearReleased) {
        super(itemName, brand, price, quantity, description, returnPolicy, modelNumber, isPortable, warrantyPeriod, yearReleased);
    }
    //Getters

    /**
     *
     * @return String getTVType
     */
    public String getTVType() {
        return TVType;
    }

    /**
     *
     * @return String getTVResolution
     */
    public String getTVResolution() {
        return TVResolution;
    }
    //Setters

    /**
     *
     * @param TVType
     */
    public void setTVType(String TVType) {
        this.TVType = TVType;
    }

    /**
     *
     * @param TVResolution
     */
    public void setTVResolution(String TVResolution) {
        this.TVResolution = TVResolution;
    }
}
