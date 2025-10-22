import java.util.Scanner;

public class Laptop extends ElectronicsItem{
    //Variables

    private double screenSize;
    private String operatingSystem;

    /**
     *
     * @param itemName
     * @param brand
     * @param price
     * @param quantity
     * @param description
     * @param returnPolicy
     * @param modelNumber
     * @param warrantyPeriod
     * @param yearReleased
     * @param screenSize
     * @param operatingSystem
     */
    public Laptop(String itemName, String brand, double price, int quantity, String description, String returnPolicy, String modelNumber, int warrantyPeriod, int yearReleased,double screenSize, String operatingSystem) {
        super(itemName, brand, price, quantity, description, returnPolicy, modelNumber, warrantyPeriod, yearReleased);
        this.screenSize = screenSize;
    }
    //Getters

    /**
     *
     * @return double getScreenSize
     */
    public double getScreenSize() {
        return screenSize;
    }

    /**
     *
     * @return String getOperatingSystem
     */
    public String getOperatingSystem() {
        return operatingSystem;
    }
    //Setters

    /**
     *
     * @param screenSize
     */
    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    /**
     *
     * @param operatingSystem
     */
    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
    //other
    /**
     * create a new item of laptop
     * @return a new instance of laptop
     */
    public static Laptop createItem() {

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
     * clones instance of laptop
     * @return clone of item
     */
    @Override
    public Laptop clone() {
        Laptop copy = new Laptop(this.getItemName(), this.getBrand(), this.getPrice(), this.getQuantity(), this.getDescription(),
                this.getReturnPolicy(), this.getModelNumber(),this.getWarrantyPeriod(),this.getYearReleased(),this.getScreenSize(),this.getOperatingSystem());
        return copy;
    }
}

