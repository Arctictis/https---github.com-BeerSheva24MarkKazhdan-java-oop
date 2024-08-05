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
/*short a, b = 10, c=20;
a = (short)(b + c);
//Operator cast is some converting from one type of a primitive to another
//methodX(Object obj); x.methodX(y)
//if(x instanceof Y)(
//.......
//)((Y)x).f1()
}*/
public int count() {
  int count = 0;
  for (Shape shape : shapes ){
if (shape instanceof Canvas){
  count++;
  Canvas canvas = (Canvas) shape;
  count += canvas.count();
} else {
  count +=1;
}
  }
  return count;
}
}
