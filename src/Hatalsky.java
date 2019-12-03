import processing.core.PImage;

import java.util.List;

public class Hatalsky extends MoveEntity{
    private int charger_part_count = 0;
    private static Hatalsky hatalsky;
    private Hatalsky(String id, Point position, List<PImage> images, int imageIndex, int actionPeriod,
                     int animationPeriod){
        super(id,position,images,imageIndex, actionPeriod,animationPeriod);
        this.charger_part_count = charger_part_count;
    }
    public static Hatalsky getInstance(){
        if (hatalsky == null){
            hatalsky = new Hatalsky();
        }
        return hatalsky;
    }
    public Point nextPosition(){
        return getPosition();
    }
    public void moveHatalsky(int dx, int dy){
        int newX = getPosition().x;
        int newY = getPosition().y;
        setPosition(new Point(newX, newY));
    }
}