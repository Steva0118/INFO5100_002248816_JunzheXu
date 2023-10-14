public class human {
    //define properties for class human
    private int weight;
    private int height;
    private int age;
    private String BloodType;
    private String race;
    private String gender;
    private String BirthCountry;
    private String nationality;

    //Create empty constructor for class human
    public human() {
    }

    //Create class constructor for class human
    public human(int weight, int height, int age, String BloodType, String race, String gender, String BirthCountry, String nationality) {
        this.weight = weight;
        this.height = height;
        this.age = age;
        this.BloodType = BloodType;
        this.race = race;
        this.gender = gender;
        this.BirthCountry = BirthCountry;
        this.nationality = nationality;
    }

    //Method for human to walk
    public void Walk(){
        System.out.println("Human is walking");
    }
    //Method for human to drink
    public void Drink(){
        System.out.println("Human is drinking");
    }
    //Method for human to Eat
    public void Eat(){
        System.out.println("Human is eating");
    }

    /**
     * Get weight of human
     * @return weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Set weight of human
     * @param weight
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * Get height of human
     * @return height
     */
    public int getHeight() {
        return height;
    }

    /**
     * Set height of human
     * @param height
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Get age of human
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * Set age of human
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Get blood type of human
     * @return BloodType
     */
    public String getBloodType() {
        return BloodType;
    }

    /**
     * Set blood type of human
     * @param BloodType
     */
    public void setBloodType(String BloodType) {
        this.BloodType = BloodType;
    }

    /**
     * Get race of human
     * @return race
     */
    public String getRace() {
        return race;
    }

    /**
     * Set race of human
     * @param race
     */
    public void setRace(String race) {
        this.race = race;
    }

    /**
     * Get gender of human
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * Set gender of human
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Get birth country of human
     * @return BirthCountry
     */
    public String getBirthCountry() {
        return BirthCountry;
    }

    /**
     * Set brith country of human
     * @param BirthCountry
     */
    public void setBirthCountry(String BirthCountry) {
        this.BirthCountry = BirthCountry;
    }

    /**
     * Get nationality of human
     * @return nationality
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Set nationality of human
     * @param nationality
     */
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String toString() {
        return "human{weight = " + weight + ", height = " + height + ", age = " + age + ", BloodType = " + BloodType + ", race = " + race + ", gender = " + gender + ", BirthCountry = " + BirthCountry + ", nationality = " + nationality + "}";
    }
}