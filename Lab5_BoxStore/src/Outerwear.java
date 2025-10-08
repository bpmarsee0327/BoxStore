public class Outerwear extends ClothingItem{
    private String outerwearType;
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
    public Outerwear(String outerwearType, String itemName, String brand, double price, int quantity, String description, String returnPolicy, String size, String gender, String color, String material) {
        super(itemName, brand, price, quantity, description, returnPolicy, size, gender, color, material);
        this.outerwearType = outerwearType
    }
    //getters

    /**
     * get outerwear type
     * @return outerwear type str
     */
    public String getOuterwearType(){
        return outerwearType;
    }
    //setters

    /**
     * to set outerwear type
     * @param outerwearType the outerwear type
     */
    public void setOuterwearType(String outerwearType){
        this.outerwearType = outerwearType;
    }

}
