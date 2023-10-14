public class light {
    //define properties of class light
    private String color;
    private String brand;
    private int MaxLumen;
    private int MaxWatt;
    private String TypeBulb;
    private int size;
    private short price;
    private String ProduceCountry;

    //Create empty constructor for class light
    public light() {
    }
    //Create class constructor for class light
    public light(String color, String brand, int MaxLumen, int MaxWatt, String TypeBulb, int size, short price, String ProduceCountry) {
        this.color = color;
        this.brand = brand;
        this.MaxLumen = MaxLumen;
        this.MaxWatt = MaxWatt;
        this.TypeBulb = TypeBulb;
        this.size = size;
        this.price = price;
        this.ProduceCountry = ProduceCountry;
    }

    //Method for light to control color of lighting
    public void ControlColor(){
        System.out.println("light is change the color");
    }
    //Method for light to dim the lighting
    public void DimLight(){
        System.out.println("light is dimming the lighting");
    }
    //Method for light to close
    public void close(){
        System.out.println("light is close");
    }



    /**
     * Get color of light
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * Set color of light
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Get brand of light
     * @return brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Set brand of light
     * @param brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Get max lumen of light
     * @return MaxLumen
     */
    public int getMaxLumen() {
        return MaxLumen;
    }

    /**
     * Set max lumen of light
     * @param MaxLumen
     */
    public void setMaxLumen(int MaxLumen) {
        this.MaxLumen = MaxLumen;
    }

    /**
     * Get max watt of light
     * @return MaxWatt
     */
    public int getMaxWatt() {
        return MaxWatt;
    }

    /**
     * Set max watt of light
     * @param MaxWatt
     */
    public void setMaxWatt(int MaxWatt) {
        this.MaxWatt = MaxWatt;
    }

    /**
     * Get type bulb to use of light
     * @return TypeBulb
     */
    public String getTypeBulb() {
        return TypeBulb;
    }

    /**
     * Set type bulb to use of light
     * @param TypeBulb
     */
    public void setTypeBulb(String TypeBulb) {
        this.TypeBulb = TypeBulb;
    }

    /**
     * Get size of light
     * @return size
     */
    public int getSize() {
        return size;
    }

    /**
     * Set size of light
     * @param size
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * Get price of light
     * @return price
     */
    public short getPrice() {
        return price;
    }

    /**
     * Set price of light
     * @param price
     */
    public void setPrice(short price) {
        this.price = price;
    }

    /**
     * Get produce country of light
     * @return ProduceCountry
     */
    public String getProduceCountry() {
        return ProduceCountry;
    }

    /**
     * Set produce country of light
     * @param ProduceCountry
     */
    public void setProduceCountry(String ProduceCountry) {
        this.ProduceCountry = ProduceCountry;
    }

    public String toString() {
        return "light{color = " + color + ", brand = " + brand + ", MaxLumen = " + MaxLumen + ", MaxWatt = " + MaxWatt + ", TypeBulb = " + TypeBulb + ", size = " + size + ", price = " + price + ", ProduceCountry = " + ProduceCountry + "}";
    }
}
