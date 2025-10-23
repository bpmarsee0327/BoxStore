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
     * get the size
     * @return String size
     */
    public String getSize(){
        return size;
    }
    /**
     *get the gender of clothing
     * @return String gender
     */
    public String getGender(){
        return gender;
    }
    /**
     *get the color
     * @return String color
     */
    public String getColor(){
        return color;
    }
    /**
     * get the material
     * @return String material
     */
    public String getMaterial(){
        return material;
    }

    // SETTERS
    /**
     * set the size
     * @param size size
     */
    public void setSize(String size){
        this.size = size;
    }
    /**
     * set the gender
     * @param gender
     */
    public void setGender(String gender){
        this.gender = gender;
    }
    /**
     * set the color
     * @param color
     */
    public void setColor(String color){
        this.color = color;
    }
    /**
     *set the material
     * @param material
     */
    public void setMaterial(String material){
        this.material = material;
    }
}
