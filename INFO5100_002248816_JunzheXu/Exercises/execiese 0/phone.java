public class phone {
    //define properties for class phone
    private int weight;
    private String ScreenSize;
    private String color;
    private String chip;
    private String GPU;
    private String camera;
    private int memory;
    private int storage;

    //Create empty constructor for class phone
    public phone() {
    }

    //Create class constructor for class phone
    public phone(int weight, String ScreenSize, String color, String chip, String GPU, String camera, int memory, int storage) {
        this.weight = weight;
        this.ScreenSize = ScreenSize;
        this.color = color;
        this.chip = chip;
        this.GPU = GPU;
        this.camera = camera;
        this.memory = memory;
        this.storage = storage;
    }
    //Method for phone to call
    public void call(){
        System.out.println("The phone is making the call");
    }
    //Method for phone to text
    public void text(){
        System.out.println("The phone is texting");
    }
    //Method for phone to take photo
    public void photo(){
        System.out.println("The phone is taking photo");
    }


    /**
     * Get weight oft phone
     * @return weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Set weight of phone
     * @param weight
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * Get screen size of phone
     * @return ScreenSize
     */
    public String getScreenSize() {
        return ScreenSize;
    }

    /**
     * Set screen size of phone
     * @param ScreenSize
     */
    public void setScreenSize(String ScreenSize) {
        this.ScreenSize = ScreenSize;
    }

    /**
     * Get color of phone
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * Set color of phone
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Get chip of phone
     * @return chip
     */
    public String getChip() {
        return chip;
    }

    /**
     * Set chip of phone
     * @param chip
     */
    public void setChip(String chip) {
        this.chip = chip;
    }

    /**
     * Get GPU of phone
     * @return GPU
     */
    public String getGPU() {
        return GPU;
    }

    /**
     * Set GPU of phone
     * @param GPU
     */
    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    /**
     * Get camera of phone
     * @return camera
     */
    public String getCamera() {
        return camera;
    }

    /**
     * Set camera of phone
     * @param camera
     */
    public void setCamera(String camera) {
        this.camera = camera;
    }

    /**
     * Get memory of phone
     * @return memory
     */
    public int getMemory() {
        return memory;
    }

    /**
     * Set memory of phone
     * @param memory
     */
    public void setMemory(int memory) {
        this.memory = memory;
    }

    /**
     * Get storage of phone
     * @return storage
     */
    public int getStorage() {
        return storage;
    }

    /**
     * Set storage of phone
     * @param storage
     */
    public void setStorage(int storage) {
        this.storage = storage;
    }

    public String toString() {
        return "phone{weight = " + weight + ", ScreenSize = " + ScreenSize + ", color = " + color + ", chip = " + chip + ", GPU = " + GPU + ", camera = " + camera + ", memory = " + memory + ", storage = " + storage + "}";
    }
}
