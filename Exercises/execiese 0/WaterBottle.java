import java.sql.Date;

public class WaterBottle {
    //define properties for WaterBottle
    private String material;
    private String brand;
    private String shape;
    private String origin;
    private String color;
    private int volume;
    private Date produce_date;
    private Date Valid_date;

    //Create a empty constructor for water bottle
    public WaterBottle() {
    }

    //Create a class constructor for water bottle
    public WaterBottle(String material, String brand, String shape, String origin, String color, int volume, Date produce_date, Date Valid_date) {
        this.material = material;
        this.brand = brand;
        this.shape = shape;
        this.origin = origin;
        this.color = color;
        this.volume = volume;
        this.produce_date = produce_date;
        this.Valid_date = Valid_date;
    }


    //Method for filling water
    public void FillBottle(){
        System.out.println("The bottle is filling water");
    }
    //Method for empty the bottle
    public void EmptyBottle(){
        System.out.println("Now empty the water bottle");
    }
    //Method for open the bottle
    public void OpenBottle(){
        System.out.println("The water bottle is now open");
    }
    //Method for close the bottle
    public void CloseBottle(){
        System.out.println("The water bottle is now close");
    }

    /**
     *
     * @return material
     */
    public String getMaterial() {
        return material;
    }

    /**
     *
     * @param material
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     *
     * @return brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     *
     * @param brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     *
     * @return shape
     */
    public String getShape() {
        return shape;
    }

    /**
     *
     * @param shape
     */
    public void setShape(String shape) {
        this.shape = shape;
    }

    /**
     *
     * @return origin
     */
    public String getOrigin() {
        return origin;
    }

    /**
     *
     * @param origin
     */
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     *
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     *
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     *
     * @return volume
     */
    public int getVolume() {
        return volume;
    }

    /**
     *
     * @param volume
     */
    public void setVolume(int volume) {
        this.volume = volume;
    }

    /**
     *
     * @return produce_date
     */
    public Date getProduce_date() {
        return produce_date;
    }

    /**
     *
     * @param produce_date
     */
    public void setProduce_date(Date produce_date) {
        this.produce_date = produce_date;
    }

    /**
     *
     * @return Valid_date
     */
    public Date getValid_date() {
        return Valid_date;
    }

    /**
     *
     * @param Valid_date
     */
    public void setValid_date(Date Valid_date) {
        this.Valid_date = Valid_date;
    }

    public String toString() {
        return "WaterBottle{material = " + material + ", brand = " + brand + ", shape = " + shape + ", origin = " + origin + ", color = " + color + ", volume = " + volume + ", produce_date = " + produce_date + ", Valid_date = " + Valid_date + "}";
    }
}

