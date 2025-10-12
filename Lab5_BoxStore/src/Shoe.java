public class Shoe extends Outerwear{
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
    private boolean laced;

    public Shoe(String shoeType, boolean laced, String outerwearType, String itemName, String brand, double price, int quantity, String description, String returnPolicy, String size, String gender, String color, String material) {
        super(outerwearType, itemName, brand, price, quantity, description, returnPolicy, size, gender, color, material);
        this.shoeType = shoeType;
        this.laced = laced;
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
    public boolean getLaced(){
        return laced;
    }
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
    public void setLaced(boolean laced){
        this.laced = laced;
    }

}
