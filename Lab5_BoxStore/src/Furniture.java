public class Furniture extends HouseholdItem {
    //Variables
    private String materialType;
    private boolean requiresAssembly;
    private String outdoorSuitable;


    /**
     *
     * @param materialType
     * @param requiresAssembly
     * @param outdoorSuitable
     * @param itemName
     * @param brand
     * @param price
     * @param quantity
     * @param description
     * @param returnPolicy
     * @param isRoomSpecific
     */
    public Furniture(String materialType, boolean requiresAssembly, String outdoorSuitable, String itemName, String brand, double price, int quantity, String description, String returnPolicy, boolean isRoomSpecific) {
        super(itemName, brand, price, quantity, description, returnPolicy, isRoomSpecific);
        this.materialType = materialType;
        this.requiresAssembly = requiresAssembly;
        this.outdoorSuitable = outdoorSuitable;
    }
    //Getters

    /**
     *
     * @return String materialType
     */
    public String getMaterialType() {
        return materialType;
    }

    /**
     *
     * @return boolean requiresAssembly
     */
    public boolean getIsRequiresAssembly() {
        return requiresAssembly;
    }

    /**
     *
     * @return String getOutdoorSuitable
     */
    public String getOutdoorSuitable() {
        return outdoorSuitable;
    }
    //Setters

    /**
     *
     * @param materialType
     */
    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }

    /**
     *
     * @param requiresAssembly
     */
    public void setRequiresAssembly(boolean requiresAssembly) {
        this.requiresAssembly = requiresAssembly;
    }

    /**
     *
     * @param outdoorSuitable
     */
    public void setOutdoorSuitable(String outdoorSuitable) {
        this.outdoorSuitable = outdoorSuitable;
    }
}

