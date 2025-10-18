public class Phone extends ElectronicsItem{
    //Variables
    private String phoneType;


    /**
     * @param phoneType
     * @param itemName
     * @param brand
     * @param price
     * @param quantity
     * @param description
     * @param returnPolicy
     * @param modelNumber
     * @param warrantyPeriod
     * @param yearReleased
     */
    public Phone(String itemName, String brand, double price, int quantity, String description, String returnPolicy, String modelNumber, int warrantyPeriod, int yearReleased,  String phoneType) {
        super(itemName, brand, price, quantity, description, returnPolicy, modelNumber, warrantyPeriod, yearReleased);
        this.phoneType = phoneType;
    }
    //getters


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
     * @param phoneType
     */
    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }
}
