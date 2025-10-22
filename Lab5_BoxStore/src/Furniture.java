import java.util.Scanner;

public class Furniture extends HouseholdItem {
    //Variables
    private String materialType;
    private boolean requiresAssembly;
    private boolean outdoorSuitable;


    /**
     *
     * @param materialType
     * @param requiresAssembly
     * @param outdoorSuitable
     * @param itemName
     * @param brand
     * @param price
     * @param quantity
     * @param description
     * @param returnPolicy
     * @param isRoomSpecific
     */
    public Furniture(String itemName, String brand, double price, int quantity, String description, String returnPolicy, boolean isRoomSpecific,String materialType, boolean requiresAssembly, boolean outdoorSuitable) {
        super(itemName, brand, price, quantity, description, returnPolicy, isRoomSpecific);
        this.materialType = materialType;
        this.requiresAssembly = requiresAssembly;
        this.outdoorSuitable = outdoorSuitable;
    }
    //Getters

    /**
     *
     * @return String materialType
     */
    public String getMaterialType() {
        return materialType;
    }

    /**
     *
     * @return boolean requiresAssembly
     */
    public boolean getIsRequiresAssembly() {
        return requiresAssembly;
    }

    /**
     *
     * @return String getOutdoorSuitable
     */
    public boolean getOutdoorSuitable() {
        return outdoorSuitable;
    }
    //Setters

    /**
     *
     * @param materialType
     */
    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }

    /**
     *
     * @param requiresAssembly
     */
    public void setRequiresAssembly(boolean requiresAssembly) {
        this.requiresAssembly = requiresAssembly;
    }

    /**
     *
     * @param outdoorSuitable
     */
    public void setOutdoorSuitable(boolean outdoorSuitable) {
        this.outdoorSuitable = outdoorSuitable;
    }
    //other
    /**
     * create/add new instance of furniture to inv.
     * @return new piece of furniture
     */
    public static Furniture createItem(){
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
     * clones instance of furniture
     * @return clone of item
     */
    @Override
    public Furniture clone() {
        Furniture copy = new Furniture(this.getItemName(), this.getBrand(), this.getPrice(), this.getQuantity(), this.getDescription(),
                this.getReturnPolicy(), this.getIsRoomSpecific(),this.getMaterialType(),this.getIsRequiresAssembly(),this.getOutdoorSuitable());
        return copy;
    }
}

