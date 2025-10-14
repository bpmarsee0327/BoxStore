import java.util.ArrayList;

public class WQSBennettMarseeCarsonMaciorJacobGaskins {
    public static void main(String[] args) {

        ArrayList<StoreItem> storeInventory = new ArrayList<>(); // init the inventory of the store
        storeInventory.add(new Fruit("Mango","Greenwise",4.00,5,"a mango","N//a",true,"12/31/1999"
        ,"yellow/orange",true, 5));

        System.out.println("Store's inventory:"); // going through each item in the store's inventory.
        for (StoreItem item : storeInventory) {
            System.out.println(item);
        }
    }
}
