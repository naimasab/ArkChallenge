package arkXacademy.Day7.Geometric;

import java.util.ArrayList;
import java.util.List;
class DrawingBoard {

    private ArrayList<Drawable> shapes = new ArrayList<>();

    public DrawingBoard() {
        shapes = new ArrayList<>();

        shapes.add(new Triangle());
        shapes.add(new Square());

    }

    public void displayAndDrawShapes() {
        for (Drawable shape : shapes) {
            shape.displayShapeType();
            shape.drawShape();
            System.out.println();
        }
    }
}