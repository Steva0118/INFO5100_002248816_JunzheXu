import jdk.swing.interop.SwingInterOpUtils;

public class student {
    //define properties for class student
    private int weight;
    private int height;
    private String SchoolName;
    private String major;
    private String address;
    private String email;
    private int age;
    private String phone;

    //Create empty constructor for class student
    public student() {
    }

    //Create class constructor for class student
    public student(int weight, int height, String SchoolName, String major, String address, String email, int age, String phone) {
        this.weight = weight;
        this.height = height;
        this.SchoolName = SchoolName;
        this.major = major;
        this.address = address;
        this.email = email;
        this.age = age;
        this.phone = phone;
    }

    //Method for student to study
    public void study(){
        System.out.println("student is study now");
    }
    //Method for student to take exam
    public void exam(){
        System.out.println("student is take exam now");
    }
    //Method for student orientation
    public void orientation(){
        System.out.println("student is successful orientated");
    }

    /**
     * Get weight of student
     * @return weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Set weight of student
     * @param weight
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * Get height of student
     * @return height
     */
    public int getHeight() {
        return height;
    }

    /**
     * Set height of student
     * @param height
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Get school name of student
     * @return SchoolName
     */
    public String getSchoolName() {
        return SchoolName;
    }

    /**
     * Set school name of student
     * @param SchoolName
     */
    public void setSchoolName(String SchoolName) {
        this.SchoolName = SchoolName;
    }

    /**
     * Get major of student
     * @return major
     */
    public String getMajor() {
        return major;
    }

    /**
     * Set major of student
     * @param major
     */
    public void setMajor(String major) {
        this.major = major;
    }

    /**
     * Get address of student
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Set address of student
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Get email of student
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set email of student
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Get age of student
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * Set age of student
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Get phone number of student
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Set phone number of student
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String toString() {
        return "student{weight = " + weight + ", height = " + height + ", SchoolName = " + SchoolName + ", major = " + major + ", address = " + address + ", email = " + email + ", age = " + age + ", phone = " + phone + "}";
    }
}


