import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import telran.shapes.Canvas;
import telran.shapes.Rectangle;
import telran.shapes.Square;

public class ShapesTests {
    @Test
    void rectangleTest(){
        Rectangle rectangle1 = new Rectangle(10, 15);
        Rectangle rectangle2 = new Rectangle(0, 0);
        Rectangle rectangle3 = new Rectangle(10, 0);
        Rectangle rectangle4 = new Rectangle(-1, -1);
        Rectangle rectangle5 = new Rectangle(10, -1);
        assertEquals(50, rectangle1.perimeter());
        assertEquals(-1, rectangle2.perimeter());
        assertEquals(-1, rectangle3.perimeter());
        assertEquals(-1, rectangle4.perimeter());
        assertEquals(-1, rectangle5.perimeter());
        assertEquals(150, rectangle1.square());
        assertEquals(-1, rectangle2.square());
        assertEquals(-1, rectangle3.square());
        assertEquals(-1, rectangle4.square());
        assertEquals(-1, rectangle5.square());
    }
    @Test
    void squareTest(){
        Square Square1 = new Square(15);
        Square Square2 = new Square(0);
        Square Square3 = new Square(-1);
       
        assertEquals(60, Square1.perimeter());
        assertEquals(-1, Square2.perimeter());
        assertEquals(-1, Square3.perimeter());
        assertEquals(225, Square1.square());
        assertEquals(-1, Square2.square());
        assertEquals(-1, Square3.square());
    }
    @Test
    void canvasTest(){
        Rectangle rectangle1 = new Rectangle(10, 15);
        Square square1 = new Square(15);
        Canvas canvas1 = new Canvas();
        canvas1.addShape(square1);
        canvas1.addShape(rectangle1);
        assertEquals(110, canvas1.perimeter());
        assertEquals(375, canvas1.square());

        Rectangle rectangle2 = new Rectangle(0, 15);
        Square square2 = new Square(15);
        Canvas canvas2 = new Canvas();
        canvas2.addShape(square2);
        canvas2.addShape(rectangle2);
        assertEquals(60, canvas2.perimeter());
        assertEquals(225, canvas2.square());

        Rectangle rectangle3 = new Rectangle(10, 15);
        Square square3 = new Square(0);
        Canvas canvas3 = new Canvas();
        canvas3.addShape(square3);
        canvas3.addShape(rectangle3);
        assertEquals(50, canvas3.perimeter());
        assertEquals(150, canvas3.square());
    }
@Test
void countTest(){
    Rectangle rectangle = new Rectangle(10, 15);
    Square square = new Square(15);
    Canvas canvas = new Canvas();
    Canvas canvas2 = new Canvas();
    Canvas mainCanvas = new Canvas();
    Canvas mainCanvas2 = new Canvas();
    canvas.addShape(square);
    canvas.addShape(rectangle);
    canvas2.addShape(rectangle);
    canvas2.addShape(rectangle);
    mainCanvas.addShape(square);
    mainCanvas.addShape(rectangle);
    mainCanvas.addShape(canvas);
    mainCanvas2.addShape(square);
    mainCanvas2.addShape(rectangle);
    mainCanvas2.addShape(canvas);
    mainCanvas2.addShape(canvas2);
    assertEquals(5, mainCanvas.count());
    assertEquals(8, mainCanvas2.count());
}
}

