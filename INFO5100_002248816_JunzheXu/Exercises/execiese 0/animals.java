public class animals {
    //define properties of class animals
    private String Phylum;
    private String Class;
    private String Order;
    private String Family;
    private String Genus;
    private String gender;
    private String OriginCountry;
    private String Species;

    //Create empty constructor for class animals
    public animals() {
    }

    //Create class constructor for class animals
    public animals(String Phylum, String Class, String Order, String Family, String Genus, String gender, String OriginCountry, String Species) {
        this.Phylum = Phylum;
        this.Class = Class;
        this.Order = Order;
        this.Family = Family;
        this.Genus = Genus;
        this.gender = gender;
        this.OriginCountry = OriginCountry;
        this.Species = Species;
    }

    //Method for animal to eat
    public void Eat(){
        System.out.println("This animal is eating");
    }
    //Method for animal to run
    public void Run(){
        System.out.println("This animal is running");
    }
    //Method for animal to sleep
    public void Sleep(){
        System.out.println("This animal is fall into sleep");

    }

    /**
     * Get phylum of animal
     * @return Phylum
     */
    public String getPhylum() {
        return Phylum;
    }

    /**
     * Set phylum of animal
     * @param Phylum
     */
    public void setPhylum(String Phylum) {
        this.Phylum = Phylum;
    }

    /**
     * Get class of animal
     * @return Class
     */
    public String getclass() {
        return Class;
    }

    /**
     * Set class of animal
     * @param Class
     */
    public void setClass(String Class) {
        this.Class = Class;
    }

    /**
     * Get order of animal
     * @return Order
     */
    public String getOrder() {
        return Order;
    }

    /**
     * Set order of animal
     * @param Order
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get family of animal
     * @return Family
     */
    public String getFamily() {
        return Family;
    }

    /**
     * Set family of animal
     * @param Family
     */
    public void setFamily(String Family) {
        this.Family = Family;
    }

    /**
     * Get genus of animal
     * @return Genus
     */
    public String getGenus() {
        return Genus;
    }

    /**
     * Set genus of animal
     * @param Genus
     */
    public void setGenus(String Genus) {
        this.Genus = Genus;
    }

    /**
     * Get gender of animal
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * Set gender of animal
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Get origin country of animal
     * @return OriginCountry
     */
    public String getOriginCountry() {
        return OriginCountry;
    }

    /**
     * Set origin country of animal
     * @param OriginCountry
     */
    public void setOriginCountry(String OriginCountry) {
        this.OriginCountry = OriginCountry;
    }

    /**
     * Get species of animal
     * @return Species
     */
    public String getSpecies() {
        return Species;
    }

    /**
     * Set species of animal
     * @param Species
     */
    public void setSpecies(String Species) {
        this.Species = Species;
    }

    public String toString() {
        return "animals{Phylum = " + Phylum + ", Class = " + Class + ", Order = " + Order + ", Family = " + Family + ", Genus = " + Genus + ", gender = " + gender + ", OriginCountry = " + OriginCountry + ", Species = " + Species + "}";
    }
}