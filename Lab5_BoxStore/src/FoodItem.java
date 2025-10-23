import java.math.BigDecimal;
import java.math.RoundingMode;
public class FoodItem extends StoreItem{

    // VARIABLES
    private String expirationDate;
    private String color;
    private boolean organic;
    private double weight;

    // CONSTRUCTOR
    /**
     *
     * @param itemName
     * @param brand
     * @param price
     * @param quantity
     * @param description
     * @param returnPolicy
     * @param expirationDate
     */
    public FoodItem(String itemName, String brand, double price, int quantity, String description, String returnPolicy, String expirationDate){
        super(itemName, brand, price, quantity, description, returnPolicy);
        this.expirationDate = expirationDate;
        this.color = color;
        this.organic = organic;
        this.weight = weight;


    }

    // GETTERS

    /**
     *
     * @return String expirationDate
     */
    public String getExpirationDate(){
        return expirationDate;
    }

    /**
     *
     * @return String color
     */
    public String getColor(){return color;}

    /**
     *
     * @return boolean organic
     */
    public boolean getOrganic(){return organic;}

    /**
     *
     * @return double weight
     */
    public double getWeight(){return weight;}

    // SETTERS

    /**
     * set expiry date
     * @param expirationDate the exp date
     */
    public void setExpirationDate(String expirationDate){
        this.expirationDate = expirationDate;
    }

    /**
     * set color
     * @param color the color
     */
    public void setColor (String color){
        this.color = color;
    }

    /**
     * set organic
     * @param organic boolean
     */
    public void setOrganic(boolean organic){
        this.organic = organic;
    }

    /**
     *
     * @param weight
     */
    public void setWeight(double weight){
        this.weight = weight;
    }

    /**
     * to get tax rate for item type (food)
     * @return the rate
     */
    @Override
    public double getTaxRate(){
        return 0.02;
    }
}
