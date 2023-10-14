import java.util.Date;

public class PartTimeStudent extends student{


    public PartTimeStudent() {
    }

    public PartTimeStudent(String name,String address, String email, String DateOfBirth, String gender, int[] QuizScore, String StudentType) {
        super(name,address, email, DateOfBirth, gender, QuizScore, StudentType);
    }

    public String toString() {
        return "PartTimeStudent{}";
    }
}
