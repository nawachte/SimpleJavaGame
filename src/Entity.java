import java.util.List;
import processing.core.PImage;

public class Entity {
    private Point position;
    private List<PImage> images;
    private int imageIndex;
    public Entity(List<PImage> images, int imageIndex,Point position){
        this.images = images;
        this.imageIndex = imageIndex;
        this.position = position;
    }
    Point getPosition(){
        return this.position;
    }

    void setPosition(Point p){
        this.position = p;
    }

    PImage getCurrentImage(){
        return images.get(imageIndex);
    }

    List<PImage> getImages(){
        return this.images;
    }

    int getImageIndex(){return this.imageIndex;}

    void setImageIndex(int i){this.imageIndex = i;}

}
