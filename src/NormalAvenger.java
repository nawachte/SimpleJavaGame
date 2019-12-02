import processing.core.PImage;

import java.util.List;

public class NormalAvenger extends MoveEntity implements Avenger{
    public static final String NORMALA_KEY = "normalavenger";
    public NormalAvenger(int actionPeriod, List<PImage> images, int imageIndex, Point position){
        super(actionPeriod,images,imageIndex, position);
    }
}
