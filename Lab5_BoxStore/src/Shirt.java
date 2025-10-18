public class Shirt extends ClothingItem {
    private String graphicDesign;

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
     * @param graphicDesign
     */
    public Shirt(String itemName, String brand, double price, int quantity, String description, String returnPolicy, String size, String gender, String color, String material, String graphicDesign) {
        super(itemName, brand, price, quantity, description, returnPolicy, size, gender, color, material);
        this.graphicDesign = graphicDesign;
    }
    //getters

    /**
     *get graphic design on the shirt
     * @return graphicDesign
     */
    public String getGraphicDesign() {
        return graphicDesign;
    }
    //setters
    /**
     *to set the shirts graphic design
     * @param graphicDesign the shirt's graphic design
     */
    public void setGraphicDesign(String graphicDesign) {
        this.graphicDesign = graphicDesign;
    }
}
