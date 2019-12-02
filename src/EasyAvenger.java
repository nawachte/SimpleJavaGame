import processing.core.PImage;

import java.util.List;

public class EasyAvenger extends MoveEntity implements Avenger{
    public static final String EASYA_KEY = "easyavenger";
    public EasyAvenger(int actionPeriod, List<PImage> images, int imageIndex, Point position){
        super(actionPeriod,images,imageIndex, position);
    }
}
