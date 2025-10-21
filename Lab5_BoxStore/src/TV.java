import java.util.Scanner;

public class TV extends ElectronicsItem{
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
    public TV(String itemName, String brand, double price, int quantity, String description, String returnPolicy, String modelNumber, int warrantyPeriod, int yearReleased,String tvType, String tvResolution) {
        super(itemName, brand, price, quantity, description, returnPolicy, modelNumber, warrantyPeriod, yearReleased);
        this.tvType = tvType;
        this.tvResolution = tvResolution;
    }
    //Getters

    /**
     *
     * @return String getTVType
     */
    public String getTVType() {
        return tvType;
    }

    /**
     *
     * @return String getTVResolution
     */
    public String getTVResolution() {
        return tvResolution;
    }
    //Setters

    /**
     *
     * @param TVType
     */
    public void setTVType(String TVType) {
        this.tvType = TVType;
    }

    /**
     *
     * @param TVResolution
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
        input.nextLine();

        System.out.print("Enter description: ");
        String description = input.nextLine();

        System.out.print("Enter return policy: ");
        String returnPolicy = input.nextLine(); // end of inheritance from storeItem

        System.out.print("Enter model number: ");
        String modelNumber = input.nextLine();

        System.out.print("Enter warranty period : ");
        int warrantyPeriod = input.nextInt();

        System.out.print("Enter the year released: "); // end of inheritance from electronics
        int yearReleased = input.nextInt();

        System.out.print("Enter TV type (i.e. flatscreen, CRT : ");
        String tvType = input.nextLine();

        System.out.print("Enter TV Resolution (i.e. 1920x1080) : ");
        String tvResolution = input.nextLine();

        TV newTV = new TV( itemName,  brand,  price,  quantity,  description,  returnPolicy,  modelNumber,  warrantyPeriod,  yearReleased, tvType,  tvResolution);
        return newTV;
    }
}
