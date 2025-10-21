import java.util.Scanner;

public class ShelfStable extends FoodItem{
    // Variables
    private boolean isCanned;

    /**
     *
     * @param itemName
     * @param brand
     * @param price
     * @param quantity
     * @param description
     * @param returnPolicy
     * @param expirationDate
     * @param isCanned
     */
    public ShelfStable(String itemName, String brand, double price, int quantity, String description, String returnPolicy, String expirationDate,boolean isCanned) {
        super(itemName, brand, price, quantity, description, returnPolicy, expirationDate);
        this.isCanned = isCanned;
    }
    //Getters

    /**
     *
     * @return String isCanned
     */
    public boolean getIsCanned(){
        return isCanned;
    }
    //Setters

    /**
     *
     * @param isCanned
     */
    public void setIsCanned(boolean isCanned){
        this.isCanned = isCanned;
    }
    //other
    /**
     * to create/add shelfstable to store's inventory
     * @return a new instance of ShelfStable item
     */
    public static ShelfStable createItem(){
        Scanner input = new Scanner(System.in);
        System.out.println("\n--- Create Shelf Stable Item ---");

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
        String expirationDate = input.nextLine(); // end of inheritance from Fooditem

        System.out.print("Enter if this item is canned (true/false)");
        boolean isCanned = input.nextBoolean();

        ShelfStable newShelfStable = new ShelfStable( itemName,  brand,  price,  quantity,  description,  returnPolicy,  expirationDate, isCanned);
        return newShelfStable;
    }

}


