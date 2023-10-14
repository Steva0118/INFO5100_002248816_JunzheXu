import java.util.Date;

public class desk {
    //define properties for class desk
    private String brand;
    private int weight;
    private int height;
    private String ProductCountry;
    private String shape;
    private String width;
    private Date ProduceDate;
    private int length;

    //Create an empty constructor for class desk
    public desk() {
    }

    //Create a class constructor for class desk
    public desk(String brand, int weight, int height, String ProductCountry, String shape, String width, Date ProduceDate, int length) {
        this.brand = brand;
        this.weight = weight;
        this.height = height;
        this.ProductCountry = ProductCountry;
        this.shape = shape;
        this.width = width;
        this.ProduceDate = ProduceDate;
        this.length = length;
    }

    //Method for Place stuff on desk
    public void Place(){
        System.out.println("Stuff is place on desk successfully");
    }
    //Method for Remove stuff on desk
    public void Remove(){
        System.out.println("Stuff is remove from desk");
    }

    /**
     * Method to get brand
     * @return brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Method to set brand
     * @param brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Method to get weight
     * @return weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     *Method to set weight
     * @param weight
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * Method to get height
     * @return height
     */
    public int getHeight() {
        return height;
    }

    /**
     * Method to set height
     * @param height
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Method to get ProductCounty
     * @return productCountry
     */
    public String getProductCountry() {
        return ProductCountry;
    }

    /**
     * Method to set ProductCounty
     * @param ProductCountry
     */
    public void setProductCountry(String ProductCountry) {
        this.ProductCountry = ProductCountry;
    }

    /**
     * Method to get shape
     * @return shape
     */
    public String getShape() {
        return shape;
    }

    /**
     * Method to set shape
     * @param shape
     */
    public void setShape(String shape) {
        this.shape = shape;
    }

    /**
     * Method to get width
     * @return width
     */
    public String getWidth() {
        return width;
    }

    /**
     * Method to set width
     * @param width
     */
    public void setWidth(String width) {
        this.width = width;
    }

    /**
     * Method to get produce date
     * @return produceDate
     */
    public Date getProduceDate() {
        return ProduceDate;
    }

    /**
     * Method to set produce date
     * @param produceDate
     */
    public void setProduceDate(Date produceDate) {
        this.ProduceDate = produceDate;
    }

    /**
     * Method to get length
     * @return length
     */
    public int getLength() {
        return length;
    }

    /**
     * Method to set length
     * @param length
     */
    public void setLength(int length) {
        this.length = length;
    }

    public String toString() {
        return "desk{brand = " + brand + ", weight = " + weight + ", height = " + height + ", ProductCountry = " + ProductCountry + ", shape = " + shape + ", width = " + width + ", ProduceDate = " + ProduceDate + ", length = " + length + "}";
    }
}
