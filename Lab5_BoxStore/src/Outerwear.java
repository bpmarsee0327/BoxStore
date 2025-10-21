import java.util.Scanner;

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
    public Outerwear(String itemName, String brand, double price, int quantity, String description, String returnPolicy, String size, String gender, String color, String material,String outerwearType) {
        super(itemName, brand, price, quantity, description, returnPolicy, size, gender, color, material);
        this.outerwearType = outerwearType;
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
    //other
    /**
     * to create/add new outerwear
     *
     * @return new outerwear
     */
    public static Outerwear createItem() {
        Scanner input = new Scanner(System.in);

        System.out.println("\n--- Create Outerwear ---");

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

        System.out.print("Enter outerwear type (i.e., Jacket, Coat, Hoodie): ");
        String outerwearType = input.nextLine();

        Outerwear newOuterwear = new Outerwear(itemName, brand, price, quantity, description, returnPolicy, size, gender, color, material,outerwearType);
        return newOuterwear;
    }

}
