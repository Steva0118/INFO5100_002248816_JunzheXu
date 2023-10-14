public class cars {
    //define properties for class cars
    private int weight;
    private String ProduceCountry;
    private int height;
    private int length;
    private int width;
    private String TypeBreaks;
    private String TypeHeadlights;
    private String AirConditioning;
    private int MaxSpeed;
    //Create a nested engine class for class cars
    public class engine{
        //define properties in nested class engine
        private int NumCylinder;
        private String CylinderArrangement;
        private String EnergyType;
        private String ProduceCountry;

        //Create empty constructor for nested class engine
        public engine() {
        }
        //Create class constructor for nested class engine
        public engine(int NumCylinder, String CylinderArrangement, String EnergyType, String ProduceCountry) {
            this.NumCylinder = NumCylinder;
            this.CylinderArrangement = CylinderArrangement;
            this.EnergyType = EnergyType;
            this.ProduceCountry = ProduceCountry;
        }

        /**
         * Get number of cylinders
         * @return NumCylinder
         */
        public int getNumCylinder() {
            return NumCylinder;
        }

        /**
         * Set number of cylinders
         * @param NumCylinder
         */
        public void setNumCylinder(int NumCylinder) {
            this.NumCylinder = NumCylinder;
        }

        /**
         * Get arrangement of cylinder
         * @return CylinderArrangement
         */
        public String getCylinderArrangement() {
            return CylinderArrangement;
        }

        /**
         * set arrangement of cylinder
         * @param CylinderArrangement
         */
        public void setCylinderArrangement(String CylinderArrangement) {
            this.CylinderArrangement = CylinderArrangement;
        }

        /**
         * Get what energy the engine use
         * @return EnergyType
         */
        public String getEnergyType() {
            return EnergyType;
        }

        /**
         * Set what energy the engine use
         * @param EnergyType
         */
        public void setEnergyType(String EnergyType) {
            this.EnergyType = EnergyType;
        }

        /**
         * Get produce country of engine
         * @return ProduceCountry
         */
        public String getProduceCountry() {
            return ProduceCountry;
        }

        /**
         * Set produce engine of engine
         * @param ProduceCountry
         */
        public void setProduceCountry(String ProduceCountry) {
            this.ProduceCountry = ProduceCountry;
        }

        public String toString() {
            return "engine{NumCylinder = " + NumCylinder + ", CylinderArrangement = " + CylinderArrangement + ", EnergyType = " + EnergyType + ", ProduceCountry = " + ProduceCountry + "}";
        }
    }

    //Create a nested transmission class for class cars
    public class transmission{
        //define properties for class transmission
        private String TranType;
        private String ProduceCountry;
        private String brand;

        //Create empty constructor for class transmission
        public transmission() {
        }
        //Create class constructor for class transmission
        public transmission(String TranType, String ProduceCountry, String brand) {
            this.TranType = TranType;
            this.ProduceCountry = ProduceCountry;
            this.brand = brand;
        }

        /**
         * Get the type of transmission
         * @return TranType
         */
        public String getTranType() {
            return TranType;
        }

        /**
         * Set the type of transmission
         * @param TranType
         */
        public void setTranType(String TranType) {
            this.TranType = TranType;
        }

        /**
         * Get produce country of transmission
         * @return ProduceCountry
         */
        public String getProduceCountry() {
            return ProduceCountry;
        }

        /**
         * Set produce country of transmission
         * @param ProduceCountry
         */
        public void setProduceCountry(String ProduceCountry) {
            this.ProduceCountry = ProduceCountry;
        }

        /**
         * Get the brand of transmission
         * @return brand
         */
        public String getBrand() {
            return brand;
        }

        /**
         * Set the brand of transmission
         * @param brand
         */
        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String toString() {
            return "transmission{TranType = " + TranType + ", ProduceCountry = " + ProduceCountry + ", brand = " + brand + "}";
        }
    }

    //Create empty constructor for class cars
    public cars() {
    }

    //Create class constructor for class cars
    public cars(int weight, String ProduceCountry, int height, int length, int width, String TypeBreaks, String TypeHeadlights, String AirConditioning, int MaxSpeed) {
        this.weight = weight;
        this.ProduceCountry = ProduceCountry;
        this.height = height;
        this.length = length;
        this.width = width;
        this.TypeBreaks = TypeBreaks;
        this.TypeHeadlights = TypeHeadlights;
        this.AirConditioning = AirConditioning;
        this.MaxSpeed = MaxSpeed;
    }

    /**
     * Get weight of cars
     * @return weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Set weight of cars
     * @param weight
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * Get produce country of cars
     * @return ProduceCountry
     */
    public String getProduceCountry() {
        return ProduceCountry;
    }

    /**
     * Set produce country of cars
     * @param ProduceCountry
     */
    public void setProduceCountry(String ProduceCountry) {
        this.ProduceCountry = ProduceCountry;
    }

    /**
     * Get height of cars
     * @return height
     */
    public int getHeight() {
        return height;
    }

    /**
     * Set height of cars
     * @param height
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Get length of cars
     * @return length
     */
    public int getLength() {
        return length;
    }

    /**
     * Set length of cars
     * @param length
     */
    public void setLength(int length) {
        this.length = length;
    }

    /**
     * Get width of cars
     * @return width
     */
    public int getWidth() {
        return width;
    }

    /**
     * Set width of cars
     * @param width
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * Get what type of breaks car use
     * @return TypeBreaks
     */
    public String getTypeBreaks() {
        return TypeBreaks;
    }

    /**
     * Set what type of breaks car use
     * @param TypeBreaks
     */
    public void setTypeBreaks(String TypeBreaks) {
        this.TypeBreaks = TypeBreaks;
    }

    /**
     * Get what type of headlights car use
     * @return TypeHeadlights
     */
    public String getTypeHeadlights() {
        return TypeHeadlights;
    }

    /**
     * Set what type of headlights car use
     * @param TypeHeadlights
     */
    public void setTypeHeadlights(String TypeHeadlights) {
        this.TypeHeadlights = TypeHeadlights;
    }

    /**
     * Get air conditioning of car use
     * @return AirConditioning
     */
    public String getAirConditioning() {
        return AirConditioning;
    }

    /**
     * Set air conditioning of car use
     * @param AirConditioning
     */
    public void setAirConditioning(String AirConditioning) {
        this.AirConditioning = AirConditioning;
    }

    /**
     * Get max speed of car
     * @return MaxSpeed
     */
    public int getMaxSpeed() {
        return MaxSpeed;
    }

    /**
     * Set max speed of car
     * @param MaxSpeed
     */
    public void setMaxSpeed(int MaxSpeed) {
        this.MaxSpeed = MaxSpeed;
    }

    public String toString() {
        return "cars{weight = " + weight + ", ProduceCountry = " + ProduceCountry + ", height = " + height + ", length = " + length + ", width = " + width + ", TypeBreaks = " + TypeBreaks + ", TypeHeadlights = " + TypeHeadlights + ", AirConditioning = " + AirConditioning + ", MaxSpeed = " + MaxSpeed + "}";
    }







}
