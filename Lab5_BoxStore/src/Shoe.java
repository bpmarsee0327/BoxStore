public class Shoe extends ClothingItem{
    /**
     *
     * @param outerwearType
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
    private String shoeType;

    public Shoe(String itemName, String brand, double price, int quantity, String description, String returnPolicy, String size, String gender, String color, String material, String shoeType) {
        super(itemName, brand, price, quantity, description, returnPolicy, size, gender, color, material);
        this.shoeType = shoeType;
    }


    //getters

    /**
     * to return the shoe's type
     * @return the shoe's type
     */
    public String getshoeType(){
        return shoeType;
    }

    /**
     * to return whether the shoe has laces
     * @return
     */

    // setters

    /**
     * set the shoes type
     * @param shoeType type of shoe
     */
    public void setshoeType(String shoeType){
        this.shoeType = shoeType;
    }

    /**
     * setting lace
     * @param laced
     */

}
