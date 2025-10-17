public class Laptop extends ElectronicsItem{
    //Variables

    private double screenSize;
    private String operatingSystem;

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
     * @param screenSize
     * @param operatingSystem
     */
    public Laptop(String itemName, String brand, double price, int quantity, String description, String returnPolicy, String modelNumber, int warrantyPeriod, int yearReleased,double screenSize, String operatingSystem) {
        super(itemName, brand, price, quantity, description, returnPolicy, modelNumber, warrantyPeriod, yearReleased);
        this.screenSize = screenSize;
    }
    //Getters

    /**
     *
     * @return double getScreenSize
     */
    public double getScreenSize() {
        return screenSize;
    }

    /**
     *
     * @return String getOperatingSystem
     */
    public String getOperatingSystem() {
        return operatingSystem;
    }
    //Setters

    /**
     *
     * @param screenSize
     */
    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    /**
     *
     * @param operatingSystem
     */
    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
}

