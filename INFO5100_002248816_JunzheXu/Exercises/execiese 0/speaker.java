public class speaker {
    //define properties for class speaker
    private String color;
    private String material;
    private String shape;
    private String brand;
    private int MaxVolume;
    private int weight;
    private short price;
    private boolean wireless;

    //Create empty constructor for class speaker
    public speaker() {
    }

    //Create class constructor for class speaker
    public speaker(String color, String material, String shape, String brand, int MaxVolume, int weight, short price, boolean wireless) {
        this.color = color;
        this.material = material;
        this.shape = shape;
        this.brand = brand;
        this.MaxVolume = MaxVolume;
        this.weight = weight;
        this.price = price;
        this.wireless = wireless;
    }
    //Method for speaker to play music
    public void PlayMusic(){
        System.out.println("speaker is playing music");
    }
    //Method for speaker to pause music
    public void pause(){
        System.out.println("speaker now pause the music");
    }
    //Method for speaker to connect bluetooth
    public void bluetooth(){
        System.out.println("speaker connect bluetooth successfully");
    }



    /**
     * Get color of speaker
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * Set color of speaker
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Get material of speaker
     * @return material
     */
    public String getMaterial() {
        return material;
    }

    /**
     * Set material of speaker
     * @param material
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * Get shape of speaker
     * @return shape
     */
    public String getShape() {
        return shape;
    }

    /**
     * Set shape of speaker
     * @param shape
     */
    public void setShape(String shape) {
        this.shape = shape;
    }

    /**
     * Get brand of speaker
     * @return brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Set brand of speaker
     * @param brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Get max volume of speaker
     * @return MaxVolume
     */
    public int getMaxVolume() {
        return MaxVolume;
    }

    /**
     * Set max volume of speaker
     * @param MaxVolume
     */
    public void setMaxVolume(int MaxVolume) {
        this.MaxVolume = MaxVolume;
    }

    /**
     * Get weight of speaker
     * @return weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Set weight of speaker
     * @param weight
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * Get price of speaker
     * @return price
     */
    public short getPrice() {
        return price;
    }

    /**
     * Set price of speaker
     * @param price
     */
    public void setPrice(short price) {
        this.price = price;
    }

    /**
     * Get if speaker is wireless
     * @return wireless
     */
    public boolean isWireless() {
        return wireless;
    }

    /**
     * Set if speaker is wireless
     * @param wireless
     */
    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

    public String toString() {
        return "speaker{color = " + color + ", material = " + material + ", shape = " + shape + ", brand = " + brand + ", MaxVolume = " + MaxVolume + ", weight = " + weight + ", price = " + price + ", wireless = " + wireless + "}";
    }
}
