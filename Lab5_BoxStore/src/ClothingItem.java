public class ClothingItem extends StoreItem {

    // VARIABLES
    private String size;
    private String gender;
    private String color;
    private String material;

    // CONSTRUCTOR
    /**
     *
     * @param itemName
     * @param brand
     * @param price
     * @param quantity
     * @param description
     * @param returnPolicy
     * @param size
     * @param gender
     * @param color
     * @param material
     */
    public ClothingItem(String itemName, String brand, double price, int quantity, String description, String returnPolicy,
                        String size, String gender, String color, String material){
        super(itemName, brand, price, quantity, description,returnPolicy);
        this.size = size;
        this.gender = gender;
        this.color = color;
        this.material = material;
    }

    // GETTERS
    /**
     *
     * @return String size
     */
    public String getSize(){
        return size;
    }
    /**
     *
     * @return String gender
     */
    public String getGender(){
        return gender;
    }
    /**
     *
     * @return String color
     */
    public String getColor(){
        return color;
    }
    /**
     *
     * @return String material
     */
    public String getMaterial(){
        return material;
    }

    // SETTERS
    /**
     *
     * @param size
     */
    public void setSize(String size){
        this.size = size;
    }
    /**
     *
     * @param gender
     */
    public void setGender(String gender){
        this.gender = gender;
    }
    /**
     *
     * @param color
     */
    public void setColor(String color){
        this.color = color;
    }
    /**
     *
     * @param material
     */
    public void setMaterial(String material){
        this.material = material;
    }
}
