import java.util.Random;

public class StudentFactory {
    private static Random rand = new Random();
    //currently setup to select a random student
    public static Student getStudent(){
        int studentNum = rand.nextInt(3);
        if (studentNum == 0){
            return new MadStudent();
        }
        else if (studentNum == 1){
            return new InquisiteStudent();
        }
        else{
            return new AnnoyingStudent();
        }
    }
}
