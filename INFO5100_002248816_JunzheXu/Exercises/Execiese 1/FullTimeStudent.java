public class FullTimeStudent extends student{
    //define properties of full time student
    public int[] ExamScore;

    //Create empty constructor for class full time student
    public FullTimeStudent() {
    }

    public FullTimeStudent(String name,String address, String email, String DateOfBirth, String gender, int[] QuizScore, String StudentType, int[] examScore) {
        super(name,address, email, DateOfBirth, gender, QuizScore, StudentType);
        ExamScore = examScore;
    }

    //Create class constructor for class full time student
    public FullTimeStudent(int[] ExamScore) {
        this.ExamScore = ExamScore;
    }

    /**
     * Get exam score
     * @return ExamScore
     */

    public int[] getExamScore() {
        return ExamScore;
    }

    /**
     * set exam score
     * @param ExamScore
     */

    public void setExamScore(int[] ExamScore) {
        this.ExamScore = ExamScore;
    }

    public String toString() {
        return "FullTimeStudent{ExamScore = " + ExamScore + "}";
    }
}
