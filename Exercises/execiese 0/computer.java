public class computer {
    //define properties for class computer
    private String screen;
    private String keyboard;
    private String speaker;
    private int storage;
    private int memory;
    private String OS;
    private int size;
    private String color;
    //Create nested class cpu
    public class cpu{
        //define properties in class cpu
        private String brand;
        private int CoreNum;
        private String version;

        //Create empty constructor for class cpu
        public cpu() {
        }

        //Create class constructor for class cpu
        public cpu(String brand, int CoreNum, String version) {
            this.brand = brand;
            this.CoreNum = CoreNum;
            this.version = version;
        }
        //Method for cpu to process instructions
        public void Process(){
            System.out.println("Cpu is processing");
        }
        //Method for cpu to control time
        public void ControlTime(){
            System.out.println("Cpu is successful control the time for difference instructions");

        }
        /**
         * Get brand of cpu
         * @return brand
         */
        public String getBrand() {
            return brand;
        }

        /**
         * Set brand of cpu
         * @param brand
         */
        public void setBrand(String brand) {
            this.brand = brand;
        }

        /**
         * Get core number of cpu
         * @return CoreNum
         */
        public int getCoreNum() {
            return CoreNum;
        }

        /**
         * Set core number of cpu
         * @param CoreNum
         */
        public void setCoreNum(int CoreNum) {
            this.CoreNum = CoreNum;
        }

        /**
         * Get version of cpu
         * @return version
         */
        public String getVersion() {
            return version;
        }

        /**
         * Set version of cpu
         * @param version
         */
        public void setVersion(String version) {
            this.version = version;
        }

        public String toString() {
            return "cpu{brand = " + brand + ", CoreNum = " + CoreNum + ", version = " + version + "}";
        }
    }

    //Create empty constructor for class computer
    public computer() {
    }

    //Create class constructor for class computer
    public computer(String screen, String keyboard, String speaker, int storage, int memory, String OS, int size, String color) {
        this.screen = screen;
        this.keyboard = keyboard;
        this.speaker = speaker;
        this.storage = storage;
        this.memory = memory;
        this.OS = OS;
        this.size = size;
        this.color = color;
    }
    //Method for computer to starting up
    public void start(){
        System.out.println("Computer is starting up");
    }
    //Method for computer to shut down
    public void ShutDown(){
        System.out.println("The computer is shut down");
    }
    //Method for computer to playing video
    public void PlayVideo(){
        System.out.println("The computer is playing the video");
    }

    /**
     * Get screen of computer
     * @return screen
     */
    public String getScreen() {
        return screen;
    }

    /**
     * Set screen of computer
     * @param screen
     */
    public void setScreen(String screen) {
        this.screen = screen;
    }

    /**
     * Get keyboard of computer
     * @return keyboard
     */
    public String getKeyboard() {
        return keyboard;
    }

    /**
     * Set keyboard of computer
     * @param keyboard
     */
    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    /**
     * Get speaker of computer
     * @return speaker
     */
    public String getSpeaker() {
        return speaker;
    }

    /**
     * Set speaker of computer
     * @param speaker
     */
    public void setSpeaker(String speaker) {
        this.speaker = speaker;
    }

    /**
     * Get storage of computer
     * @return storage
     */
    public int getStorage() {
        return storage;
    }

    /**
     * Set storage of computer
     * @param storage
     */
    public void setStorage(int storage) {
        this.storage = storage;
    }

    /**
     * Get memory of computer
     * @return memory
     */
    public int getMemory() {
        return memory;
    }

    /**
     * Set memory of computer
     * @param memory
     */
    public void setMemory(int memory) {
        this.memory = memory;
    }

    /**
     * Get operational system of computer
     * @return OS
     */
    public String getOS() {
        return OS;
    }

    /**
     * Set operational system of computer
     * @param OS
     */
    public void setOS(String OS) {
        this.OS = OS;
    }

    /**
     * Get size of computer
     * @return size
     */
    public int getSize() {
        return size;
    }

    /**
     * Set size of computer
     * @param size
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * Get color of computer
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * Set color of computer
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "computer{screen = " + screen + ", keyboard = " + keyboard + ", speaker = " + speaker + ", storage = " + storage + ", memory = " + memory + ", OS = " + OS + ", size = " + size + ", color = " + color + "}";
    }





}
