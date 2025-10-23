import java.util.Scanner;

public class TV extends ElectronicsItem {
    //Variables
    private String tvType;
    private String tvResolution;

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
     */
    public TV(String itemName, String brand, double price, int quantity, String description, String returnPolicy, String modelNumber, int warrantyPeriod, int yearReleased, String tvType, String tvResolution) {
        super(itemName, brand, price, quantity, description, returnPolicy, modelNumber, warrantyPeriod, yearReleased);
        this.tvType = tvType;
        this.tvResolution = tvResolution;
    }
    //Getters

    /**
     *gets the tv type
     * @return String getTVType
     */
    public String getTVType() {
        return tvType;
    }

    /**
     *gets the resolution
     * @return String getTVResolution
     */
    public String getTVResolution() {
        return tvResolution;
    }
    //Setters

    /**
     *sets the tv type
     * @param TVType tv type
     */
    public void setTVType(String TVType) {
        this.tvType = TVType;
    }

    /**
     *sets the resolution
     * @param TVResolution the resolution
     */
    public void setTVResolution(String TVResolution) {
        this.tvResolution = TVResolution;
    }

    /**
     * create/add new tv
     * @return new tv
     */
    public static TV createItem() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n--- Create TV ---");

        System.out.print("Enter item name: ");
        String itemName = input.nextLine();

        System.out.print("Enter brand: ");
        String brand = input.nextLine();

        System.out.print("Enter price: ");
        double price = input.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();
        input.nextLine(); // consume newline

        System.out.print("Enter description: ");
        String description = input.nextLine();

        System.out.print("Enter return policy: ");
        String returnPolicy = input.nextLine();

        System.out.print("Enter model number: ");
        String modelNumber = input.nextLine();

        System.out.print("Enter warranty period: ");
        int warrantyPeriod = input.nextInt();

        System.out.print("Enter the year released: ");
        int yearReleased = input.nextInt();
        input.nextLine(); // consume newline (important here!)

        System.out.print("Enter TV type (i.e. flatscreen, CRT): ");
        String tvType = input.nextLine();

        System.out.print("Enter TV Resolution (i.e. 1920x1080): ");
        String tvResolution = input.nextLine();

        TV newTV = new TV(itemName, brand, price, quantity, description,
                returnPolicy, modelNumber, warrantyPeriod,
                yearReleased, tvType, tvResolution);

        return newTV;
    }
    /**
     * clones instance of TV
     * @return clone of item
     */
    @Override
    public TV clone() {
        TV copy = new TV(this.getItemName(), this.getBrand(),this.getPrice(),this.getQuantity(),this.getDescription(),this.getReturnPolicy(),this.getModelNumber(),this.getWarrantyPeriod(),
                this.getYearReleased(), this.getTVType(),this.getTVResolution());
        return copy;
    }
}