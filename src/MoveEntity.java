import processing.core.PImage;
import java.util.List;

abstract class MoveEntity extends Entity{
    int actionPeriod;
    public MoveEntity(int actionPeriod, List<PImage> images, int imageIndex, Point position){
        super(images,imageIndex,position);
        this.actionPeriod = actionPeriod;
    }
//    private PathingStrategy strategy = new AStarPathingStrategy();
    abstract Point nextPosition(WorldModel world, Point destPos);
    private static boolean neighbors(Point p1, Point p2)
    {
        return p1.x+1 == p2.x && p1.y == p2.y ||
                p1.x-1 == p2.x && p1.y == p2.y ||
                p1.x == p2.x && p1.y+1 == p2.y ||
                p1.x == p2.x && p1.y-1 == p2.y;
    }
}
