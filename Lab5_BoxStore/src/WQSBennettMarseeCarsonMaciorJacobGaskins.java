import java.util.ArrayList;
import java.util.Scanner;

public class WQSBennettMarseeCarsonMaciorJacobGaskins {
    public static void main(String[] args) {

        ArrayList<StoreItem> storeInventory = new ArrayList<>(); // init the inventory of the store

        Fruit mango = new Fruit("Mango", "Greenwise", 4.00, 5, "a mango", "N/a", "12/31/1999", "red"
                , true, 5, "tree");
        Vegetable carrot = new Vegetable("Carrot", "Bugs", 5, 5, "an avg carrot", "N/a",
                "12/31/1999", "orange", true, 2, true);
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
                    storeInventory.add(createOuterwear());
                }
                if (subchoice == 2) {
                    storeInventory.add(createShoe());
                }
                if (subchoice == 3) {
                    storeInventory.add(createShirt());
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
                    storeInventory.add(createLaptop());
                }
                if (subchoice == 2) {
                    storeInventory.add(createPhone());
                }
                if (subchoice == 3) {
                    storeInventory.add(createTV());
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
                    storeInventory.add(createShelfStable());
                }
                if (subchoice == 2) {
                    storeInventory.add(createFruit());
                }
                if (subchoice == 3) {
                    storeInventory.add(createVegetable());
                }

            }
            if (classSelection.equals("Household")) {
                Scanner subclass = new Scanner(System.in);
                System.out.println("Select what subclass of Household you would like to create");
                System.out.println("1. Furniture");
                System.out.println("2. Cleaning Supply");
                int subchoice = input.nextInt();
                if (subchoice == 1) {
                    storeInventory.add(createFurniture());
                }
                if (subchoice == 2) {
                    storeInventory.add(createCleaningSupply());
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
     * to create/add new outerwear
     *
     * @return new outerwear
     */
    public static Outerwear createOuterwear() {
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

    /**
     * to create/add a new shoe
     *
     * @return a new shoe
     */
    public static Shoe createShoe() {
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

    /**
     * create/add a new shirt
     *
     * @return a new shirt
     */
    public static Shirt createShirt() {
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
     * to add/create new laptop.
     *
     * @return new laptop
     */
    public static Laptop createLaptop() {

        Scanner input = new Scanner(System.in);
        System.out.println("\n--- Create Laptop ---");

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

        System.out.print("Enter model number: ");
        String modelNumber = input.nextLine();

        System.out.print("Enter warranty period : ");
        int warrantyPeriod = input.nextInt();

        System.out.print("Enter the year released: "); // end of inheritance from electronics
        int yearReleased = input.nextInt();

        System.out.print("Enter screensize");
        double screenSize = input.nextDouble();

        System.out.print("Enter the operating system: ");
        String operatingSystem = input.nextLine();

        Laptop newLaptop = new Laptop(itemName, brand, price, quantity, description, returnPolicy, modelNumber, warrantyPeriod, yearReleased, screenSize, operatingSystem);
        return newLaptop;
    }

    /**
     * create/add new phone
     *
     * @return new phone
     */
    public static Phone createPhone() {

        Scanner input = new Scanner(System.in);
        System.out.println("\n--- Create Phone ---");

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

        System.out.print("Enter model number: ");
        String modelNumber = input.nextLine();

        System.out.print("Enter warranty period : ");
        int warrantyPeriod = input.nextInt();

        System.out.print("Enter the year released: "); // end of inheritance from electronics
        int yearReleased = input.nextInt();

        System.out.print("Enter the phone type (i.e. Apple/Samsung): ");
        String phoneType = input.nextLine();

        Phone newPhone = new Phone(itemName, brand, price, quantity, description, returnPolicy, modelNumber, warrantyPeriod, yearReleased, phoneType);
        return newPhone;
    }

    /**
     * create/add new tv
     * @return new tv
     */
    public static TV createTV() {

        Scanner input = new Scanner(System.in);
        System.out.println("\n--- Create TV ---");

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

        System.out.print("Enter model number: ");
        String modelNumber = input.nextLine();

        System.out.print("Enter warranty period : ");
        int warrantyPeriod = input.nextInt();

        System.out.print("Enter the year released: "); // end of inheritance from electronics
        int yearReleased = input.nextInt();

        System.out.print("Enter TV type (i.e. flatscreen, CRT : ");
        String tvType = input.nextLine();

        System.out.print("Enter TV Resolution (i.e. 1920x1080) : ");
        String tvResolution = input.nextLine();

        TV newTV = new TV( itemName,  brand,  price,  quantity,  description,  returnPolicy,  modelNumber,  warrantyPeriod,  yearReleased, tvType,  tvResolution);
        return newTV;
    }

    /**
     * to create/add shelfstable to store's inventory
     * @return a new instance of ShelfStable item
     */
    public static ShelfStable createShelfStable(){
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

    /**
     * to add/create new fruit to inventory
     * @return newFruit
     */
    public static Fruit createFruit(){
        Scanner input = new Scanner(System.in);
        System.out.println("\n--- Create a fruit ---");

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

        System.out.print("Enter the color of the fruit: ");
        String color = input.nextLine();

        System.out.print("Enter in if the fruit is organic (true/false): ");
        Boolean organic = input.nextBoolean();

        System.out.print("Enter the weight of the fruit: ");
        double weight = input.nextDouble();

        System.out.print("Enter the fruit type: ");
        String fruitType = input.nextLine();

        Fruit newFruit = new Fruit( itemName,  brand,  price,  quantity,  description,  returnPolicy,  expirationDate,  color,  organic,  weight ,fruitType);
        return newFruit;

    }

    /**
     * create add new instance of vegetable to store inv.
     * @return
     */
    public static Vegetable createVegetable(){
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

        System.out.print("Enter the color of the fruit: ");
        String color = input.nextLine();

        System.out.print("Enter in if the fruit is organic (true/false): ");
        Boolean organic = input.nextBoolean();

        System.out.print("Enter the weight of the fruit: ");
        double weight = input.nextDouble();

        System.out.print("Enter if it is a root vegetable (true/false): ");
        boolean rootVegetable = input.nextBoolean();

        Vegetable newVegetable = new Vegetable( itemName,  brand,  price,  quantity,  description,  returnPolicy,  expirationDate,  color,  organic,  weight,  rootVegetable);
        return newVegetable;
    }

    /**
     * create/add new instance of furniture to inv.
     * @return new piece of furniture
     */
    public static Furniture createFurniture(){
        Scanner input = new Scanner(System.in);
        System.out.println("\n--- Create a piece of furniture ---");

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

        System.out.print("Enter if it's room specific (true/false): ");
        boolean isRoomSpecific = input.nextBoolean();

        System.out.print("Enter the material type: ");
        String materialType = input.nextLine();

        System.out.print("Enter if it requires assembly (true/false): ");
        boolean requiresAssembly = input.nextBoolean();

        System.out.print("Enter if it is suitable for outdoors(true/false): ");
        boolean outdoorSuitable = input.nextBoolean();

        Furniture newFurniture = new Furniture( itemName,  brand,  price,  quantity,  description,  returnPolicy,  isRoomSpecific, materialType,  requiresAssembly,  outdoorSuitable);
        return newFurniture;
    }
    /**
     * create/add new instance of cleaning supplies to inv.
     * @return new cleaning supply
     */
    public static CleaningSupply createCleaningSupply(){
        Scanner input = new Scanner(System.in);
        System.out.println("\n--- Create an item of cleaning supplies ---");

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

        System.out.print("Enter if it's room specific (true/false): ");
        boolean isRoomSpecific = input.nextBoolean();

        System.out.print("Enter the scent of the product:");
        String scent = input.nextLine();

        System.out.print("Enter the surface type the product is used for: ");
        String surfaceType = input.nextLine();

        CleaningSupply newCleaningSupply = new CleaningSupply( itemName,  brand,  price,  quantity,  description,  returnPolicy,  isRoomSpecific, scent,  surfaceType);
        return  newCleaningSupply;
    }

}

