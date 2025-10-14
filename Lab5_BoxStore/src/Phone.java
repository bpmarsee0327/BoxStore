public class Phone extends ElectronicsItem{
    //Variables
    private boolean isWaterproof;
    private String phoneType;


    /**
     * @param isWaterproof
     * @param phoneType
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
    public Phone(String itemName, String brand, double price, int quantity, String description, String returnPolicy, String modelNumber, boolean isPortable, int warrantyPeriod, int yearReleased,boolean isWaterproof, String phoneType) {
        super(itemName, brand, price, quantity, description, returnPolicy, modelNumber, isPortable, warrantyPeriod, yearReleased);
        this.isWaterproof = isWaterproof;
        this.phoneType = phoneType;
    }
    //getters

    /**
     *
     * @return boolean isWaterproof
     */
    public boolean getIsWaterproof() {
        return isWaterproof;
    }

    /**
     *
     * @return String getPhoneType
     */
    public String getPhoneType() {
        return phoneType;
    }
    //setters

    /**
     *
     * @param isWaterproof
     */
    public void setIsWaterproof(boolean isWaterproof) {
        this.isWaterproof = isWaterproof;
    }

    /**
     *
     * @param phoneType
     */
    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }
}
