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

        System.out.println("Store's inventory:"); // going through each item in the store's inventory.
        for (StoreItem item : storeInventory) {
            System.out.println(item);
        }
        displayMenu(storeInventory);

        //Updated Inventory after adding/selling
        System.out.println("Updated Inventory");
        for (StoreItem item : storeInventory) {
            System.out.println(item);}
    }

        /**
         * Display menu that allows the user to either add to the inventory or sell from the inventory
         */
        public static void displayMenu(ArrayList<StoreItem> storeInventory){
            Scanner input = new Scanner(System.in);
            boolean stillAdding = true;

            while (stillAdding){
                System.out.println("\nWould you like to sell an item or one to the inventory?");
                System.out.println("1. Add item to inventory");
                System.out.println("2. Sell item");
                System.out.println("3. Exit");

                int choice = input.nextInt();
                input.nextLine();

                switch (choice){
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
                System.out.print("Add more items (Y/N)?");
                String inp = input.nextLine().trim();
                if (!inp.equalsIgnoreCase("Y")){
                    stillAdding = false
                }
            }
        }

        /**
         * Menu that asks the user if they want to add an item to clothing, electronics, food, or household
         */
        public static void addInventory(ArrayList<StoreItem> storeInventory){
            Scanner input = new Scanner(System.in);

            while (true){
                System.out.println("\nChoose a department to add items to: ");
                System.out.println("1. Clothing");
                System.out.println("2. Electronics");
                System.out.println("3. Food");
                System.out.println("4. Household");
                System.out.println("5. Return to menu");

                int choice = input.nextInt();
                input.nextLine();

                switch (choice){
                    case 1:
                        itemsinCategory(storeInventory, ClothingItem.class);
                        addtoInventory(storeInventory, ClothingItem.class);

                        break;
                    case 2:
                        itemsinCategory(storeInventory, ElectronicsItem.class);
                        addtoInventory(storeInventory, ElectronicsItem.class);

                        break;
                    case 3:
                        itemsinCategory(storeInventory, FoodItem.class);
                        addtoInventory(storeInventory, FoodItem.class);

                        break;
                    case 4:
                        itemsinCategory(storeInventory, HouseholdItem.class);
                        addtoInventory(storeInventory, HouseholdItem.class);

                        break;
                    case 5:
                        System.out.println("Returning");

                        return;

                    default:
                        System.out.println("Invalid input.");
                }
            }
        }
        public static void sellItem(){
            Scanner input = new Scanner(System.in);

        }

    /**
     * helper for addInventory to display items within selected category.
     * @param storeInventory an array of the store's inventory
     * @param type the class type. the category of item being looked for.
     */
    public static void itemsinCategory(ArrayList<StoreItem> storeInventory, Class type){
            for (StoreItem item : storeInventory){
                if (type.isInstance(item)) {
                    System.out.println(item);
                }
            }
        }

    /**
     * To add to preexisting items in the store's inventory.
     * @param storeInventory the store's inventory.
     * @param type the category.
     */
    public static void addtoInventory(ArrayList<StoreItem> storeInventory, Class type){
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

                    for (StoreItem item : storeInventory){
                        if (item.getItemName().equals(name)){
                            found = true; // to prevent accidentally notifying as not present when iterating through the rest of the list
                            System.out.println("Enter how many more of the item you'd like.");

                            //getting exists quantity through the accessor, adding to amt requested, then reassigning the attribute through mutator.
                            int moreQuantity = input.nextInt();
                            int newQuantity = moreQuantity + item.getQuantity();
                            item.setQuantity(newQuantity);
                        }
                        }
                    if (found == false){
                        System.out.println("not present");
                    }
                    }
//                highlight below + hit Ctrl + /
//                if (choice == 2 ){
//                System.out.println("Enter the name of item you would like to add.");
//                }

                }
                }


