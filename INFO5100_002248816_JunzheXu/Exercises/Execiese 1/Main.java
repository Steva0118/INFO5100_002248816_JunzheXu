import java.util.Date;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        //create 20 student objects
        student ptstu1 = new PartTimeStudent("a","123 st", "123@mail",DummyDate() , "male", DummyQuiz(), "part-time");
        student ptstu2 = new PartTimeStudent("b","343 st", "1adf3@mail", DummyDate(), "male", DummyQuiz(), "part-time");
        student ptstu3 = new PartTimeStudent("c","1763 st", "1ae@mail", DummyDate(), "male", DummyQuiz(), "part-time");
        student ptstu4 = new PartTimeStudent("d","136 st", "1asd@mail", DummyDate(), "male", DummyQuiz(), "part-time");
        student ptstu5 = new PartTimeStudent("e","145 st", "1sd@mail", DummyDate(), "male", DummyQuiz(), "part-time");
        student ptstu6 = new PartTimeStudent("f","129 st", "4rf@mail", DummyDate(), "male", DummyQuiz(), "part-time");
        student ptstu7 = new PartTimeStudent("g","1245 st", "earg3@mail", DummyDate(), "male",  DummyQuiz(), "part-time");
        student ptstu8 = new PartTimeStudent("h","1234 st", "aedf@mail", DummyDate(), "male",  DummyQuiz(), "part-time");
        student ptstu9 = new PartTimeStudent("i","23 st", "asdf@mail", DummyDate(), "male", DummyQuiz(), "part-time");
        student ptstu10 = new PartTimeStudent("j","145 st", "asdf@mail", DummyDate(), "male", DummyQuiz(), "part-time");
        student ftstu1 = new FullTimeStudent("k","nwe st","iui@mail",DummyDate(),"female",DummyQuiz(),"full-time",DummyExamScore());
        student ftstu2 = new FullTimeStudent("l","rty st","i34@mail",DummyDate(),"female",DummyQuiz(),"full-time",DummyExamScore());
        student ftstu3 = new FullTimeStudent("m","uki st","i35@mail",DummyDate(),"female",DummyQuiz(),"full-time",DummyExamScore());
        student ftstu4 = new FullTimeStudent("n","sde st","i56@mail",DummyDate(),"female",DummyQuiz(),"full-time",DummyExamScore());
        student ftstu5 = new FullTimeStudent("o","erd st","i78@mail",DummyDate(),"female",DummyQuiz(),"full-time",DummyExamScore());
        student ftstu6 = new FullTimeStudent("p","tgr st","i89@mail",DummyDate(),"female",DummyQuiz(),"full-time",DummyExamScore());
        student ftstu7 = new FullTimeStudent("q","efr st","i56@mail",DummyDate(),"female",DummyQuiz(),"full-time",DummyExamScore());
        student ftstu8 = new FullTimeStudent("r","sdf st","ief@mail",DummyDate(),"female",DummyQuiz(),"full-time",DummyExamScore());
        student ftstu9 = new FullTimeStudent("s","rft st","i34@mail",DummyDate(),"female",DummyQuiz(),"full-time",DummyExamScore());
        student ftstu10 = new FullTimeStudent("t","thy st","fdi@mail",DummyDate(),"female",DummyQuiz(),"full-time",DummyExamScore());

        //create session object
        student[] stList= {ptstu1,ptstu2,ptstu3,ptstu4,ptstu5,ptstu6,ptstu7,ptstu8,ptstu9,ptstu10,ftstu1,ftstu2,ftstu3,ftstu4,ftstu5,ftstu6,ftstu7,ftstu8,ftstu9,ftstu10};
        Session s =new Session(stList);
        //call method for calculate average quiz score of each student in session
        s.AveQuizScore(stList);
        System.out.println("------------------------------------------");
        //call method for print names of part-time students
        s.PrintNamePartTime(stList);
        System.out.println("------------------------------------------");
        //call method for print exam scores of full-time students
        s.PrintExamFullTime(stList);
        System.out.println("------------------------------------------");
        //call method for print all quiz scores of students
        s.PrintQuizScore(stList);

    }

    //method to create dummy quiz
    public static int[] DummyQuiz() {
        Random r = new Random();
        int[] dummy = new int[15];
        for (int j = 0; j < 15; j++) {
            dummy[j] = r.nextInt(20);
        }
        return dummy;
    }

    //method to create dummy date of birth
    public static String DummyDate() {
        Random r = new Random();
        String d = ((String.valueOf(r.nextInt(1,12)))+'-'+(String.valueOf(r.nextInt(1,30)))+'-'+(String.valueOf(r.nextInt(1998,2003))));
        return d;
    }
    //method to create dummy exam score
    public static int[] DummyExamScore() {
        Random r = new Random();
        int[] dummy = new int[2];
        for (int j = 0; j < 2; j++) {
            dummy[j] = r.nextInt(100);
        }
        return dummy;
    }
}
