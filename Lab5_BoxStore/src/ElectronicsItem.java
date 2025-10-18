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
     *
     * @return String modelNumber
     */
    public String getModelNumber(){
        return modelNumber;
    }
    /**
     *
     * @return int warrantyPeriod
     */
    public int getWarrantyPeriod(){
        return warrantyPeriod;
    }
    /**
     *
     * @return int yearReleased
     */
    public int getYearReleased(){
        return yearReleased;
    }

    // SETTERS
    /**
     *
     * @param modelNumber
     */
    public void setModelNumber(String modelNumber){
        this.modelNumber = modelNumber;
    }
    /**
     *
     * @param warrantyPeriod
     */
    public void setWarrantyPeriod(int warrantyPeriod){
        this.warrantyPeriod = warrantyPeriod;
    }
    /**
     *
     * @param yearReleased
     */
    public void setYearReleased(int yearReleased){
        this.yearReleased = yearReleased;
    }
}
