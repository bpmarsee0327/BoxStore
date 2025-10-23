import java.util.Scanner;

public class CleaningSupply extends HouseholdItem{
    private String scent;
    private String surfaceType;
    /**
     * @param scent
     * @param surfaceType
     * @param itemName
     * @param brand
     * @param price
     * @param quantity
     * @param description
     * @param returnPolicy
     * @param isRoomSpecific
     */
    public CleaningSupply(String itemName, String brand, double price, int quantity, String description, String returnPolicy, boolean isRoomSpecific,String scent, String surfaceType) {
        super(itemName, brand, price, quantity, description, returnPolicy, isRoomSpecific);
        this.scent = scent;
        this.surfaceType = surfaceType;
    }
//getters

    /**
     * get scent
     * @return scent
     */
    public String getScent(){
    return scent;
}

    /**
     * get surfaceType
     * @return surfaceType
     */
    public String getSurfaceType(){
    return surfaceType;}
//setters

    /**
     * set scent
     * @param scent
     */
    public void setScent(String scent){
    this.scent = scent;
}

    /**
     * set surfaceType
     * @param surfaceType
     */
    public void setSurfaceType(String surfaceType){
    this.surfaceType = surfaceType;
}
//other
    /**
     * create/add new instance of cleaning supplies to inv.
     * @return new cleaning supply
     */
    public static CleaningSupply createItem(){

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
        input.nextLine();

        System.out.print("Enter the surface type the product is used for: ");
        String surfaceType = input.nextLine();

        CleaningSupply newCleaningSupply = new CleaningSupply( itemName,  brand,  price,  quantity,  description,  returnPolicy,  isRoomSpecific, scent,  surfaceType);
        return  newCleaningSupply;
    }
    /**
     * clones instance of cleaningsupply
     * @return clone of item
     */
    @Override
    public CleaningSupply clone() {
        CleaningSupply copy = new CleaningSupply(this.getItemName(), this.getBrand(), this.getPrice(), this.getQuantity(), this.getDescription(), this.getReturnPolicy(), this.getIsRoomSpecific(), this.getScent(), this.getSurfaceType());
        return copy;
    }

}