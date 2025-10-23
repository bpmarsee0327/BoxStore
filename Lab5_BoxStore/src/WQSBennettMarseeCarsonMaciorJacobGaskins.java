import java.util.ArrayList;
import java.util.Scanner;


public class WQSBennettMarseeCarsonMaciorJacobGaskins {
    public static void main(String[] args) {

        ArrayList<StoreItem> storeInventory = new ArrayList<>(); // init the inventory of the store

        Fruit mango = new Fruit("Mango", "Greenwise", 4.00, 5, "a mango", "N/a", "12/31/1999", "red"
                , true, 5, "tree");
        Vegetable carrot = new Vegetable("Carrot", "Bugs", 5, 5, "an avg carrot", "N/a",
                "12/31/1999", "orange", true, 2, true);
        ShelfStable penne = new ShelfStable("Penne Pasta", "Raos", 3.99, 4, "penne shaped pasta", "unopened, within 7 days", "10/14/2028", true);


        Laptop macbook= new Laptop("Macbook Air", "Apple", 999.99, 3, "lightweight laptop", "within 14 days", "A1234", 5, 1, 2024, "macOS");
        TV smart_samsung_tv = new TV("Samsung Smart TV", "Samsung", 599.99, 4, "smart TV", "within 14 days", "B2345", 5, 2024,"flatscreen", "4k");
        Phone I16 = new Phone("iPhone 16 Pro", "Apple", 999.99, 13, "the latest iPhone", "within 14 days", "C3456", 5, 2024, "iphone");

        Outerwear rain = new Outerwear("Rain Jacket", "North Face", 89.99, 6, "waterproof rain jacket", "exchanged or returned within 30 days", "L", "Unisex", "Black", "Polyester", "Jacket");
        Shoe running = new Shoe("Running", "nike", 69.99, 5, "none", "none", "16", "male", "10", "M", "Mesh");
        Shirt Graphic_T = new Shirt("Graphic T Shirt", "American Eagle", 29.99, 20, "t shirt with a graphic on it", "exchanged or returned within 30 days", "L", "F", "Red", "Cotton", "werewolf tipping fedora");

        CleaningSupply multi = new CleaningSupply("Multi Surface Cleaner", "Lysol", 2.99, 25, "cleans and disinfects surfaces", "unused, within 14 days", false, "Lavender", "All");
        Furniture dresser = new Furniture("Dresser", "IKEA", 399.99, 2, "wooden dresser", "within 30 days", true, "Wood", false, false);

        storeInventory.add(mango);
        storeInventory.add(carrot);
        storeInventory.add(penne);
        storeInventory.add(macbook);
        storeInventory.add(smart_samsung_tv);
        storeInventory.add(I16);
        storeInventory.add(rain);
        storeInventory.add(running);
        storeInventory.add(Graphic_T);
        storeInventory.add(multi);
        storeInventory.add(dresser);

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
                    sellItem(storeInventory);
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
     *Menu that asks the user if they want to add an item to clothing, electronics, food, or household
     * @param storeInventory the inventory
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
                    itemsinCategory(storeInventory, ClothingItem.class); // each one of these checks for items under the category in inventory.
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

    /**
     * to conduct selling of a store item within inventory
     * @param storeInventory store inventory
     * @return the list (cart) of items checked out.
     */
    public static ArrayList<StoreItem> sellItem(ArrayList<StoreItem> storeInventory) {
        Scanner input = new Scanner(System.in);
        ArrayList<StoreItem> cart = new ArrayList<>();


        System.out.println("\n--- Sell Item ---");


        while (true) {
            displayInventory(storeInventory, "\nStore Inventory:");


            System.out.print("\nEnter the name of the item to sell (or type 'exit' to finish): ");
            String name = input.nextLine();


            if (name.equalsIgnoreCase("exit")) {
                break;
            }


            boolean found = false;
            for (StoreItem item : storeInventory) {
                if (item.getItemName().equalsIgnoreCase(name)) {
                    transferItem(item, storeInventory, cart);
                    found = true;
                    break;
                }
            }


            if (!found) {
                System.out.println("Item not found in store inventory.");
            }
        }


        displayInventory(cart, "\nItems in Cart:");
        double total = calculateCartTotal(cart);
        System.out.printf("Total price (with tax): $%.2f%n", total);


        return cart;
    }

    /**
     * helper for addInventory to display items within selected category.
     *
     * @param storeInventory an array of the store's inventory
     * @param type the class type. the category of item being looked for.
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
    public static void addtoInventory(ArrayList<StoreItem> storeInventory, Class type, String classSelection) {
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
            displayInventory(storeInventory, "Updated store inventory");
        }
        if (choice == 2) {
            if (classSelection.equals("Clothing")) {
                Scanner subclass = new Scanner(System.in);
                System.out.println("Select what subclass of Clothing you would like to create");
                System.out.println("1. Outerwear");
                System.out.println("2. Shoe");
                System.out.println("3. Shirt");
                int subchoice = input.nextInt();
                if (subchoice == 1) {
                    storeInventory.add(Outerwear.createItem());
                }
                if (subchoice == 2) {
                    storeInventory.add(Shoe.createItem());
                }
                if (subchoice == 3) {
                    storeInventory.add(Shirt.createItem());
                }
            }
            if (classSelection.equals("Electronics")) {
                Scanner subclass = new Scanner(System.in);
                System.out.println("Select what subclass of Electronics you would like to create");
                System.out.println("1. Laptop");
                System.out.println("2. Phone");
                System.out.println("3. TV");
                int subchoice = input.nextInt();
                if (subchoice == 1) {
                    storeInventory.add(Laptop.createItem());
                }
                if (subchoice == 2) {
                    storeInventory.add(Phone.createItem());
                }
                if (subchoice == 3) {
                    storeInventory.add(TV.createItem());
                }
            }
            if (classSelection.equals("Food")) {
                Scanner subclass = new Scanner(System.in);
                System.out.println("Select what subclass of Food you would like to create");
                System.out.println("1. Shelf stable");
                System.out.println("2. Fruit");
                System.out.println("3. Vegetable");
                int subchoice = input.nextInt();
                if (subchoice == 1) {
                    storeInventory.add(ShelfStable.createItem());
                }
                if (subchoice == 2) {
                    storeInventory.add(Fruit.createItem());
                }
                if (subchoice == 3) {
                    storeInventory.add(Vegetable.createItem());
                }
            }
            if (classSelection.equals("Household")) {
                Scanner subclass = new Scanner(System.in);
                System.out.println("Select what subclass of Household you would like to create");
                System.out.println("1. Furniture");
                System.out.println("2. Cleaning Supply");
                int subchoice = input.nextInt();
                if (subchoice == 1) {
                    storeInventory.add(Furniture.createItem());
                }
                if (subchoice == 2) {
                    storeInventory.add(CleaningSupply.createItem());
                }
            }
        }
    }
    /**
     * To display the store's inventory
     *
     * @param storeInventory the store's inventory
     * @param message        the message you'd like as a header (i.e. header)
     */
    public static void displayInventory(ArrayList<StoreItem> storeInventory, String message) {
        System.out.println(message);
        for (StoreItem item : storeInventory) {
            System.out.println(item);
        }
    }

    /**
     * to transfer items from one array to another. (this case it's from store inv to the customer's cart)
     * @param item item to move
     * @param from sender list
     * @param to receiver list
     */
    public static void transferItem(StoreItem item, ArrayList<StoreItem> from, ArrayList<StoreItem> to) {
        Scanner input = new Scanner(System.in);
        int quantityToTransfer = 0;
        boolean valid = false;


        while (!valid) {
            System.out.print("Enter quantity to sell for " + item.getItemName() +
                    " (Available: " + item.getQuantity() + "): ");
            quantityToTransfer = input.nextInt();
            input.nextLine();


            if (quantityToTransfer <= 0) {
                System.out.println("Quantity must be greater than zero.");
            } else if (quantityToTransfer > item.getQuantity()) {
                System.out.println("Not enough stock. Try again.");
            } else {
                valid = true;
            }
        }

        item.setQuantity(item.getQuantity() - quantityToTransfer); // set new amt in store inventory

        boolean existsInCart = false; // init false only true if that said item appears in the cart already. assume false as init's empty
        for (StoreItem cartItem : to) {
            if (cartItem.getItemName().equalsIgnoreCase(item.getItemName())) {
                cartItem.setQuantity(cartItem.getQuantity() + quantityToTransfer);
                existsInCart = true;
                break;
            }
        }


        if (!existsInCart) { // to prevent 2 stacks of the same item. like one pile of soap x 2 and one of soap x5
            // needed to make a clone feature to HARD copy. needed to avoid accidentally creating a pointer to the same obj.
            StoreItem clonedItem = new StoreItem(
                    item.getItemName(),
                    item.getBrand(),
                    item.getPrice(),
                    quantityToTransfer,
                    item.getDescription(),
                    item.getReturnPolicy()
            );
            to.add(clonedItem);
        }


        System.out.println("Added " + quantityToTransfer + " of " + item.getItemName() + " to shopping cart.");
    }

    /**
     * to calculate the total cost of the items checkedout by the customer
     * @param cart the arraylist of items the cust is buying
     * @return the total cart cost
     */
    public static double calculateCartTotal(ArrayList<StoreItem> cart) {
        double total = 0.0; // init price

        for (StoreItem item : cart) {
            double basePrice = item.getPrice() * item.getQuantity();
            double taxRate = item.getTaxRate(); // will call polymorphically depending on food or general item
            total += basePrice + (basePrice * taxRate);
        }
        return total;
    }
}
