import processing.core.PImage;

import java.util.List;

public class HardAvenger extends MoveEntity implements Avenger{
    public static final String HARDA_KEY = "hardavenger";
    public HardAvenger(int actionPeriod, List<PImage> images, int imageIndex, Point position){
        super(actionPeriod,images,imageIndex, position);
    }
}
