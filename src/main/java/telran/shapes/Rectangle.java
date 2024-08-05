package telran.shapes;

public class Rectangle implements Shape{
private int width;
private int height;
public Rectangle(int width, int height) {
    this.width = width;
    this.height = height;
   }
    @Override
    public int perimeter() {
       return width == 0 | height == 0 ? -1 : width < 0 | height< 0 ? -1 :2 * (width + height);
    }

    @Override
    public int square() {
        return width == 0 | height == 0 ? -1 : width < 0 | height< 0 ? -1 : width * height;
    }
    @Override
    public int count() {
        return 1;
    }


}
