import java.util.ArrayList;
import java.util.Scanner;

public class WQSBennettMarseeCarsonMaciorJacobGaskins {
    public static void main(String[] args) {

        ArrayList<StoreItem> storeInventory = new ArrayList<>(); // init the inventory of the store

        Fruit mango = new Fruit("Mango","Greenwise",4.00,5,"a mango","N/a",true,"12/31/1999"
                ,"yellow/orange",true, 5);
        Vegetable carrot = new Vegetable("Carrot","Bugs", 5, 5, "an avg carrot", "N/a",
        true, "12/31/1999","orange", true, 2,true);
        storeInventory.add(mango);
        storeInventory.add(carrot);

        System.out.println("Store's inventory:"); // going through each item in the store's inventory.
        for (StoreItem item : storeInventory) {
            System.out.println(item);
        }

        /**
         * Display menu that allows the user to either add to the inventory or sell from the inventory
         */
        public static void displayMenu(){
            Scanner input = new Scanner(System.in);

            while (true){
                System.out.println("\nWould you like to sell an item or one to the inventory?");
                System.out.println("1. Add item to inventory");
                System.out.println("2. Sell item");
                System.out.println("3. Exit");

                int choice = input.nextInt();
                input.nextLine();

                switch (choice){
                    case 1:
                        addInventory();
                        break;
                    case 2:
                        sellItem();
                        break;
                    case 3:
                        System.out.println("Exiting");
                        input.close();
                        return;
                    default:
                        System.out.println("Invalid input.")
                        break;
                }
            }
        }
        /**
         * Menu that asks the user if they want to add an item to clothing, electronics, food, or household
         */
        public static void addInventory(){
            Scanner input = new Scanner(System.in);

            while (true){
                System.out.println("\nChoose a department to add items to: ");
                System.out.println("1. Clothing");
                System.out.println("2. Electronics");
                System.out.println("3. Food");
                System.out.println("4. Household");

                switch (choice){
                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

                        break;
                    default:
                        System.out.println("Invalid input.")
                }
            }
        }
        public static void sellItem(){
            Scanner input = new Scanner(System.in);

        }
    }
}
