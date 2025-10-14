import java.util.ArrayList;

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
    }
}
