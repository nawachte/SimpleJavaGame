import processing.core.PImage;

import java.util.List;

public class InfinityStone extends Entity {
    public static final String STONE_KEY = "infinitystone";
    public InfinityStone(String id, Point position,
                         List<PImage> images, int imageIndex){
        super(images, imageIndex,position);
    }
}
