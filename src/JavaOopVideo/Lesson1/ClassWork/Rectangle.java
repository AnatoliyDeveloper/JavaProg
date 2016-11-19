package JavaOopVideo.Lesson1.ClassWork;

/**
 * Created by Anatoliy on 14.11.2016.
 */
public class Rectangle {

    public static final String NAME = "Rectangle";

    private int width;
    private int height;

    public Rectangle() {
        width = 10;
        height = 5;
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int square(){
        return width * height;
    }

    public static Rectangle combine(Rectangle r1, Rectangle r2){
        return new Rectangle(r1.width + r2.width, r1.height + r2.height);
    }
}
