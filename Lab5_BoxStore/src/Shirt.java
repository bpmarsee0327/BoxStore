import java.util.Scanner;

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
    /**
     * to create item of shirt
     * @return shirt item
     */
    public static Shirt createItem() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n--- Create Shirt ---");

        System.out.print("Enter item name: ");
        String itemName = input.nextLine();

        System.out.print("Enter brand: ");
        String brand = input.nextLine();

        System.out.print("Enter price: ");
        double price = input.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();
        input.nextLine();

        System.out.print("Enter description: ");
        String description = input.nextLine();

        System.out.print("Enter return policy: ");
        String returnPolicy = input.nextLine();

        System.out.print("Enter size: ");
        String size = input.nextLine();

        System.out.print("Enter gender: ");
        String gender = input.nextLine();

        System.out.print("Enter color: ");
        String color = input.nextLine();

        System.out.print("Enter material: ");
        String material = input.nextLine();

        System.out.print("Enter graphic design: ");
        String graphicDesign = input.nextLine();

        Shirt newShirt = new Shirt(itemName, brand, price, quantity, description, returnPolicy, size, gender, color, material, graphicDesign);
        return newShirt;
    }
    /**
     * clones instance of shirt
     * @return clone of item
     */
    @Override
    public Shirt clone() {
        Shirt copy = new Shirt(this.getItemName(), this.getBrand(), this.getPrice(), this.getQuantity(), this.getDescription(),
                this.getReturnPolicy(), this.getSize(),this.getGender(),this.getColor(),this.getMaterial(),this.getGraphicDesign());
        return copy;
    }
}
