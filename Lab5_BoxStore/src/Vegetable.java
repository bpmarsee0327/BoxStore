import java.util.Scanner;

public class Vegetable extends FoodItem{
    // VARIABLES
    private boolean rootVegetable;

    // CONSTRUCTOR
    public Vegetable(String itemName, String brand, double price, int quantity, String description, String returnPolicy, String expirationDate, String color, boolean organic, double weight, boolean rootVegetable) {
        super(itemName, brand, price, quantity, description, returnPolicy, expirationDate);

        this.rootVegetable = rootVegetable;
    }

    // GETTERS

    /**
     *
     * @return boolean rootVegetable
     */
    public boolean getRootVegetable() {return rootVegetable;}

    // SETTERS

    /**
     *
     * @param rootVegetable
     */
    public void setRootVegetable(boolean rootVegetable) {this.rootVegetable = rootVegetable;}
    //other
    /**
     * create add new instance of vegetable to store inv.
     * @return
     */
    public static Vegetable createItem(){
        Scanner input = new Scanner(System.in);
        System.out.println("\n--- Create a vegetable ---");

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
        String returnPolicy = input.nextLine(); // end of inheritance from storeItem

        System.out.print("Enter the expiration date: ");
        String expirationDate = input.nextLine();

        System.out.print("Enter the color: ");
        String color = input.nextLine();

        System.out.print("Enter in if the vegetable is organic (true/false): ");
        Boolean organic = input.nextBoolean();

        System.out.print("Enter the weight: ");
        double weight = input.nextDouble();

        System.out.print("Enter if it is a root vegetable (true/false): ");
        boolean rootVegetable = input.nextBoolean();

        Vegetable newVegetable = new Vegetable( itemName,  brand,  price,  quantity,  description,  returnPolicy,  expirationDate,  color,  organic,  weight,  rootVegetable);
        return newVegetable;
    }

    /**
     * clones instance of vegetable
     * @return clone of item
     */
    @Override
    public Vegetable clone() {
        Vegetable copy = new Vegetable(this.getItemName(), this.getBrand(),this.getPrice(),this.getQuantity(),this.getDescription(),this.getReturnPolicy(),this.getExpirationDate(),
                this.getColor(),this.getOrganic(),this.getWeight(),this.getRootVegetable());
        return copy;
    }
}
