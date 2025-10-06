public class Shoe extends ClothingItem{
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
     * @param shoeType
     * @param laced
     */
    private String shoeType;
    private boolean laced;

    public Shoe(String itemName, String brand, double price, int quantity, String description, String returnPolicy, String size, String gender, String color, String material, String shoeType, boolean laced) {
        super(itemName, brand, price, quantity, description, returnPolicy, size, gender, color, material);
        this.shoeType = shoeType;
        this.laced = laced;
    }
    //getters
    public String getshoeType(){
        return shoeType;
    }
    public boolean getLaced(){
        return laced;
    }
    // setters

    public void setshoeType(String shoeType){
        this.shoeType = shoeType;
    }
    public void setLaced(boolean laced){
        this.laced = laced;
    }

}
