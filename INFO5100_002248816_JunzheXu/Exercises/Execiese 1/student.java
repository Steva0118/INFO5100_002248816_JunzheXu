public class student {
    //define properties for super class student
    public String name;
    private String address;
    public String email;
    private String DateOfBirth;
    public String gender;
    public int[] QuizScore;
    public String StudentType;


    //Create empty constructor for class student
    public student() {
    }

    //Create class constructor for class student
    public student(String name,String address, String email, String DateOfBirth, String gender,  int[] QuizScore, String StudentType) {
        this.address = address;
        this.email = email;
        this.DateOfBirth = DateOfBirth;
        this.gender = gender;
        this.QuizScore = QuizScore;
        this.StudentType = StudentType;
        this.name = name;
    }


    /**
     * method to get address of student
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * method to set address of student
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * method to get name of student
     * @return name
     */
    public String getName() {
        return name;
    }


    /**
     * method to set name of student
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * method to get email of student
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * method to set email of student
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * method to get date of birth of student
     * @return DateOfBirth
     */
    public String getDateOfBirth() {
        return DateOfBirth;
    }

    /**
     * method to set date of birth of student
     * @param DateOfBirth
     */
    public void setDateOfBirth(String DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    /**
     * method to get gender of student
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * method to set gender of student
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }



    /**
     * method to get quiz score of student
     * @return QuizScore
     */
    public int[] getQuizScore() {
        return QuizScore;
    }

    /**
     * method to set quiz score of student
     * @param QuizScore
     */
    public void setQuizScore(int[] QuizScore) {
        this.QuizScore = QuizScore;
    }

    /**
     * method to get part-time or full time student
     */
    public String getStudentType(){
        return StudentType;
    }

    /**
     * method to set type of student
     */
    public void setStudentType(String studentType){
        this.StudentType = studentType;
    }

    public String toString() {
        return "student{name = " + name + ", address = " + address + ", email = " + email + ", DateOfBirth = " + DateOfBirth + ", gender = " + gender + ", QuizScore = " + QuizScore + "}";
    }
}