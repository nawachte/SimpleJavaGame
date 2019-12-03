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
    private static Hatalsky getInstance(){
        if (hatalsky == null){
            hatalsky = new Hatalsky();
        }
        return hatalsky;
    }
}