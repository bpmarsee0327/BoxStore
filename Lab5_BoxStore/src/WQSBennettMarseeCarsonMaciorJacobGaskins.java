import java.util.ArrayList;
import java.util.Scanner;

public class WQSBennettMarseeCarsonMaciorJacobGaskins {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        boolean done = false; // done flag for while loop

        ArrayList<StoreItem> storeInventory = new ArrayList<>(); // init the inventory of the store

        // Initializing the array with one of every lowest level category
        storeInventory.add(new ShelfStable("Penne Pasta", "Raos", 3.99, 4, "penne shaped pasta", "unopened, within 7 days", false, "10/14/2028", false));
        storeInventory.add(new Fruit("Mango", "Greenwise", 4.00, 5, "tropical fruit", "N/A", true, "10/31/2025", "Yellow", true, 2));
        storeInventory.add(new Vegetable("Carrot", "Bugs", 2.99, 5, "root vegetable", "N/A", true, "11/10/2025", "orange", true, 2, true));

        storeInventory.add(new Laptop("Macbook Air", "Apple", 999.99, 3, "lightweight laptop", "within 14 days", "A1234", true, 1, 2024, 13.6, "macOS"));
        storeInventory.add(new TV("Samsung Smart TV", "Samsung", 599.99, 4, "smart TV", "within 14 days", "B2345", false, 1,2024, "flatscreen", "4k"));
        storeInventory.add(new Phone("iPhone 16 Pro", "Apple", 999.99, 13, "the latest iPhone", "within 14 days", "C3456", true, 1, 2024, true, "cell"));

        storeInventory.add(new Outerwear("Rain Jacket", "North Face", 89.99, 6, "waterproof rain jacket", "exchanged or returned within 30 days", "L", "Unisex", "Black", "Polyester", "Jacket"));
        storeInventory.add(new Shoe("Running", true, "Zooms", "Nike", 91.99, 16, "lightweight running shoes", "exchanged or returned within 30 days", "10", "M", "White", "Mesh"));
        storeInventory.add(new Shirt("Graphic T Shirt", "American Eagle", 29.99, 20, "t shirt with a graphic on it", "exchanged or returned within 30 days", "L", "F", "Red", "Cotton", "werewolf tipping fedora"));

        storeInventory.add(new CleaningSupply("Multi Surface Cleaner", "Lysol", 2.99, 25, "cleans and disinfects surfaces", "unused, within 14 days", false, "Lavender", "All"));
        storeInventory.add(new Furniture("Dresser", "IKEA", 399.99, 2, "wooden dresser", "within 30 days", true, "Wood", false, "No"));

        // boolean flag controlled while loop so user can add/sell as much as they want
        while (!done){
            System.out.printf("%n%s%n%s%n%s%n%s%n",
                    "Welcome to the Wilmington Quick Shop, would you like to add or sell an item?",
                    "Enter (1) to ADD an item",
                    "Enter (2) to SELL an item",
                    "Enter (3) to EXIT");
            int choice = input.nextInt();
            input.nextLine();

            switch(choice){
                case 1:
                    addToInventory(storeInventory);
                    break;
                case 2:
                    sellInventoryItem(storeInventory);
                    break;
                case 3:
                    done = true;
                    break;
                default:
                    System.out.print("Invalid choice");
            }


        }
    }

    /**
     *
     */
    public static void addToInventory(ArrayList<StoreItem> storeInventory){

    }

    /**
     *
     */
    public static void sellInventoryItem(ArrayList<StoreItem> storeInventory){

    }
}
