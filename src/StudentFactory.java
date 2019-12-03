import java.util.Random;

public class StudentFactory {
    private static Random rand = new Random();
    //currently setup to select a random student
    public static Student addStudent(WorldModel world){
        int studentNum = rand.nextInt(3);
        if (studentNum == 0){
            MadStudent student = new MadStudent();
            world.addEntity(student);
            return student;
        }
        else if (studentNum == 1){
            InquisiteStudent student = new InquisiteStudent();
            world.addEntity(student);
            return student;
        }
        else{
            AnnoyingStudent student = new AnnoyingStudent();
            world.addEntity(student);
            return student;
        }
    }
}
