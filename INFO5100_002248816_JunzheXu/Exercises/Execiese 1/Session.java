import java.text.DecimalFormat;

public class Session {
    public student studentList[];

    public Session() {
    }

    public Session(student[] studentList) {
        this.studentList = studentList;
    }

    //Method to calculate average quiz scores per student for the whole class
    public void AveQuizScore(student[] stulist){
        for(student stu : stulist){
            int total= 0;//initial variable total
            double average = 0.0;//initial variable average
            int[] quizScore = stu.getQuizScore();//get all quiz score of student
            for (int i = 0; i < quizScore.length; i++) {
                total = total + quizScore[i];//calculate total score of student
            }
            average = (double) total/quizScore.length;//calculate average score of student
            DecimalFormat df = new DecimalFormat("0.00");//use format to keep result in two decimal place
            String formattedAverage = df.format(average);
            System.out.println("Average quiz score of student "+stu.getName()+" is "+formattedAverage);  //return average score of this student
        }
    }

    //Method to print names of part-time students
    public void PrintNamePartTime(student[] stulist){
        System.out.println("full names list of part-time students");
        for(student stu : stulist){ //traverse each elements in stulist
            if(stu.StudentType.equals("part-time")){ //verify if this student is part-time
                System.out.println(stu.name);//print name of student
            }
        }
    }
    //Method to print exam scores of full-time students
    public void PrintExamFullTime(student[] stulist){
        System.out.println("Exam scores of full-time students");
        for(student stu : stulist){ //traverse each elements in stulist
                if (stu instanceof FullTimeStudent) { //verify if student is full time student
                    FullTimeStudent FullTimeStudent = (FullTimeStudent) stu; //transfer object type to full time student
                    int[] examScore = FullTimeStudent.getExamScore(); //use method in full time student class get exam scores
                    System.out.print("Two exam scores for student "+FullTimeStudent.getName()+" is "); //print name of student
                    for (int exam:examScore){ //get and print each score of each student
                        System.out.print(exam+" "); //print score
                    }
                    System.out.println(); //change line for next student
                }
        }
    }
    //Method to list of quiz scores in ascending order
    public void PrintQuizScore(student[] stulist){
        for(student stu:stulist){ //traverse each elements in stulist
            int[] quizScore = stu.getQuizScore(); //get quiz scores for each student
            System.out.print("student "+stu.getName()+" all quiz scores are "); //print which student
            for(int x : quizScore){ //get each quiz score and print it
                System.out.print(x+" ");//print quiz score
            }
            System.out.println(); //change line for next student
        }
    }

    /**
     * method for get student list
     * @return studentList
     */
    public student[] getStudentList() {
        return studentList;
    }

    /**
     * method for set student list
     * @param studentList
     */
    public void setStudentList(student[] studentList) {
        this.studentList = studentList;
    }

    public String toString() {
        return "Session{studentList = " + studentList + "}";
    }
}
