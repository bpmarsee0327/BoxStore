import java.util.Scanner;

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
    //other
    /**
     * to create/add a new shoe
     *
     * @return a new shoe
     */
    public static Shoe createItem() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n--- Create Shoe ---");

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

        System.out.print("Enter shoe type (i.e. sneakers, boots): ");
        String shoeType = input.nextLine();


        Shoe newShoe = new Shoe(itemName, brand, price, quantity, description, returnPolicy, size, gender, color, material, shoeType);

        return newShoe;
    }

}
