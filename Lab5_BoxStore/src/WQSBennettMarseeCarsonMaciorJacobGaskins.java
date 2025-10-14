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
                        System.out.println("Invalid input. Enter a number between 1 - 3.")
                        break;
                }
            }
        }
    }
}
