public class ElectronicsItem extends StoreItem{

    // VARIABLES
    private String modelNumber;
    private int warrantyPeriod;
    private int yearReleased;

    // CONSTRUCTOR
    /**
     *
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
    public ElectronicsItem(String itemName, String brand, double price, int quantity, String description,
                           String returnPolicy, String modelNumber, int warrantyPeriod, int yearReleased){
        super(itemName, brand, price, quantity, description, returnPolicy);
        this.modelNumber = modelNumber;
        this.warrantyPeriod = warrantyPeriod;
        this.yearReleased = yearReleased;
    }

    // GETTERS
    /**
     * get the model number
     * @return String modelNumber
     */
    public String getModelNumber(){
        return modelNumber;
    }
    /**
     *get the warranty period in days
     * @return int warrantyPeriod
     */
    public int getWarrantyPeriod(){
        return warrantyPeriod;
    }
    /**
     * get the year released
     * @return int yearReleased
     */
    public int getYearReleased(){
        return yearReleased;
    }

    // SETTERS
    /**
     * set the model number
     * @param modelNumber model number
     */
    public void setModelNumber(String modelNumber){
        this.modelNumber = modelNumber;
    }
    /**
     *set the warranty period
     * @param warrantyPeriod warranty period
     */
    public void setWarrantyPeriod(int warrantyPeriod){
        this.warrantyPeriod = warrantyPeriod;
    }
    /**
     *set the year released
     * @param yearReleased year released
     */
    public void setYearReleased(int yearReleased){
        this.yearReleased = yearReleased;
    }
}
