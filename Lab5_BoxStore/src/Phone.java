import java.util.Scanner;

public class Phone extends ElectronicsItem{
    //Variables
    private String phoneType;


    /**
     * @param phoneType
     * @param itemName
     * @param brand
     * @param price
     * @param quantity
     * @param description
     * @param returnPolicy
     * @param modelNumber
     * @param warrantyPeriod
     * @param yearReleased
     */
    public Phone(String itemName, String brand, double price, int quantity, String description, String returnPolicy, String modelNumber, int warrantyPeriod, int yearReleased,  String phoneType) {
        super(itemName, brand, price, quantity, description, returnPolicy, modelNumber, warrantyPeriod, yearReleased);
        this.phoneType = phoneType;
    }
    //getters


    /**
     *
     * @return String getPhoneType
     */
    public String getPhoneType() {
        return phoneType;
    }
    //setters


    /**
     *
     * @param phoneType
     */
    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }
    //other
    /**
     * create/add new phone
     *
     * @return new phone
     */
    public static Phone createItem() {

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
     * clones instance of phone
     * @return clone of item
     */
    @Override
    public Phone clone() {
        Phone copy = new Phone(this.getItemName(), this.getBrand(), this.getPrice(), this.getQuantity(), this.getDescription(),
                this.getReturnPolicy(), this.getModelNumber(), this.getWarrantyPeriod(),this.getYearReleased(),this.getPhoneType());
        return copy;
    }
}
