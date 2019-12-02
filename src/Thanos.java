import processing.core.PImage;
import java.util.List;

public class Thanos extends MoveEntity{
    public static final String THANOS_KEY = "thanos";
    private Point position;
    private int stoneCount;
    private static Thanos thanos;
    private Thanos(int stoneCount, int actionPeriod, List<PImage> images, int imageIndex, Point position){
        super(actionPeriod,images,imageIndex, position);
        this.stoneCount = stoneCount;
    }
    Point nextPosition(WorldModel world, Point destPos){
        return this.position;
    }
    public static Thanos getInstance(){
        if (thanos == null){
            thanos = new Thanos(0,asdf,new Point(3,3));
        }
        return thanos;
    }
    public void setPosition(int dx,int dy) {
        this.position = new Point(this.position.x+dx,this.position.y+dy);
    }

}
