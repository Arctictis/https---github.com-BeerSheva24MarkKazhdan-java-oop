package telran.shapes;

import telran.util.Arrays;

public class Canvas implements Shape{
   Shape[] shapes;
   public Canvas() {
    shapes = new Shape[0];
   }
   public void addShape(Shape shape) {
    int i = 0;
    shapes = Arrays.insert(shapes, i, shape);
    i++;
   }
    @Override
    public int perimeter() {
        int sumPerimeter = 0;
        for (int i = 0; i < shapes.length; i ++ ){
            if (shapes[i].perimeter()> 0 ){
                sumPerimeter += shapes[i].perimeter();
            }

        }
        return sumPerimeter;
    }

    @Override
    public int square() {
  int sumSquare = 0;
  for (int i = 0; i < shapes.length; i++){
    if (shapes[i].square()> 0 ){
    sumSquare += shapes[i].square();
  }
    }
    return sumSquare;
}
}
