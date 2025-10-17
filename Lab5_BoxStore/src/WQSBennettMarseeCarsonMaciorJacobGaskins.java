import java.util.ArrayList;
import java.util.Scanner;

public class WQSBennettMarseeCarsonMaciorJacobGaskins {
    public static void main(String[] args) {

        ArrayList<StoreItem> storeInventory = new ArrayList<>(); // init the inventory of the store

        Fruit mango = new Fruit("Mango", "Greenwise", 4.00, 5, "a mango", "N/a", true, "12/31/1999"
                , "yellow/orange", true, 5);
        Vegetable carrot = new Vegetable("Carrot", "Bugs", 5, 5, "an avg carrot", "N/a",
                true, "12/31/1999", "orange", true, 2, true);
        storeInventory.add(mango);
        storeInventory.add(carrot);

        displayInventory(storeInventory, "Store's init inventory");
        displayMenu(storeInventory);

        //Updated Inventory after adding/selling
        displayInventory(storeInventory, "Store's final inventory");
    }

    /**
     * Display menu that allows the user to either add to the inventory or sell from the inventory
     */
    public static void displayMenu(ArrayList<StoreItem> storeInventory) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\nWould you like to sell an item or one to the inventory?");
            System.out.println("1. Add item to inventory");
            System.out.println("2. Sell item");
            System.out.println("3. Exit");

            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    addInventory(storeInventory);
                    break;
                case 2:
                    sellItem();
                    break;
                case 3:
                    System.out.println("Exiting");
                    input.close();
                    return;
                default:
                    System.out.println("Invalid input.");
                    break;
            }
        }
    }

    /**
     * Menu that asks the user if they want to add an item to clothing, electronics, food, or household
     */
    public static void addInventory(ArrayList<StoreItem> storeInventory) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose a department to add items to: ");
            System.out.println("1. Clothing");
            System.out.println("2. Electronics");
            System.out.println("3. Food");
            System.out.println("4. Household");
            System.out.println("5. Return to menu");

            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    itemsinCategory(storeInventory, ClothingItem.class);
                    addtoInventory(storeInventory, ClothingItem.class, "Clothing");

                    break;
                case 2:
                    itemsinCategory(storeInventory, ElectronicsItem.class);
                    addtoInventory(storeInventory, ElectronicsItem.class, "Electronics");

                    break;
                case 3:
                    itemsinCategory(storeInventory, FoodItem.class);
                    addtoInventory(storeInventory, FoodItem.class, "Food");

                    break;
                case 4:
                    itemsinCategory(storeInventory, HouseholdItem.class);
                    addtoInventory(storeInventory, HouseholdItem.class, "Household");

                    break;
                case 5:
                    System.out.println("Returning");

                    return;

                default:
                    System.out.println("Invalid input.");
            }
        }
    }

    public static void sellItem() {
        Scanner input = new Scanner(System.in);

    }

    /**
     * helper for addInventory to display items within selected category.
     *
     * @param storeInventory an array of the store's inventory
     * @param type           the class type. the category of item being looked for.
     */
    public static void itemsinCategory(ArrayList<StoreItem> storeInventory, Class type) {
        for (StoreItem item : storeInventory) {
            if (type.isInstance(item)) {
                System.out.println(item);
            }
        }
    }

    /**
     * To add to preexisting items in the store's inventory.
     *
     * @param storeInventory the store's inventory.
     * @param type           the category.
     */
    public static void addtoInventory(ArrayList<StoreItem> storeInventory, Class type,String classSelection) {
        Scanner input = new Scanner(System.in);
        System.out.println("Select if you would like to add an additional item already present or new item.");
        System.out.println("1. Add more of an existing item.");
        System.out.println("2. Create a new item.");

        int choice = input.nextInt();
        input.nextLine();

        if (choice == 1) {
            System.out.println("Enter the name of the item that you'd like more of. (Case-Sensitive)");
            String name = input.nextLine();
            boolean found = false;

            for (StoreItem item : storeInventory) {
                if (item.getItemName().equals(name)) {
                    found = true; // to prevent accidentally notifying as not present when iterating through the rest of the list
                    System.out.println("Enter how many more of the item you'd like.");

                    //getting exists quantity through the accessor, adding to amt requested, then reassigning the attribute through mutator.
                    int moreQuantity = input.nextInt();
                    int newQuantity = moreQuantity + item.getQuantity();
                    item.setQuantity(newQuantity);
                }
            }
            if (found == false) {
                System.out.println("not present");
            }
            displayInventory(storeInventory,"Updated store inventory");
        }
        if (choice == 2){
            if (classSelection.equals("Clothing")){
                Scanner subclass = new Scanner(System.in);
                System.out.println("Select what subclass of Clothing you would like to create");
                System.out.println("1. Outerwear");
                System.out.println("2. Shoe");
                System.out.println("3. Shirt");
                int subchoice = input.nextInt();
                if (subchoice == 1){
                    storeInventory.add(createOuterwear());
                }

            }
            if (classSelection.equals("Electronics")){
                Scanner subclass = new Scanner(System.in);
                System.out.println("Select what subclass of Electronics you would like to create");
                System.out.println("Laptop");
                System.out.println("Phone");
                System.out.println("TV");
                int subchoice = input.nextInt();
            }
            if (classSelection.equals("Food")){
                Scanner subclass = new Scanner(System.in);
                System.out.println("Select what subclass of Food you would like to create");
                System.out.println("Shelf stable");
                System.out.println("Fruit");
                System.out.println("Vegetable");
                int subchoice = input.nextInt();

            }
            if (classSelection.equals("Household")){
                Scanner subclass = new Scanner(System.in);
                System.out.println("Select what subclass of Household you would like to create");
                System.out.println("Furniture");
                System.out.println("Cleaning Supply");
                int subchoice = input.nextInt();

            }
        }


    }

    /**
     * To display the store's inventory
     * @param storeInventory the store's inventory
     * @param message the message you'd like as a header (i.e. header)
     */
    public static void displayInventory(ArrayList<StoreItem> storeInventory, String message) {
        System.out.println(message);
        for (StoreItem item : storeInventory) {
            System.out.println(item);
        }
    }
    public static Outerwear createOuterwear(){
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

        Outerwear newOuterwear = new Outerwear(outerwearType, itemName, brand, price, quantity, description, returnPolicy, size, gender, color, material);
        return newOuterwear;
    }
}


