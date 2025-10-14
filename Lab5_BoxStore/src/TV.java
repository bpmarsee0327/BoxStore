public class TV extends ElectronicsItem{
    //Variables
    private String tvType;
    private String tvResolution;

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
    public TV(String itemName, String brand, double price, int quantity, String description, String returnPolicy, String modelNumber, boolean isPortable, int warrantyPeriod, int yearReleased,String tvType, String tvResolution) {
        super(itemName, brand, price, quantity, description, returnPolicy, modelNumber, isPortable, warrantyPeriod, yearReleased);
        this.tvType = tvType;
        this.tvResolution = tvResolution;
    }
    //Getters

    /**
     *
     * @return String getTVType
     */
    public String getTVType() {
        return tvType;
    }

    /**
     *
     * @return String getTVResolution
     */
    public String getTVResolution() {
        return tvResolution;
    }
    //Setters

    /**
     *
     * @param TVType
     */
    public void setTVType(String TVType) {
        this.tvType = TVType;
    }

    /**
     *
     * @param TVResolution
     */
    public void setTVResolution(String TVResolution) {
        this.tvResolution = TVResolution;
    }
}
