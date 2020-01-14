package vv.dp.bridge;

public class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    public void drawShape() {
        System.out.println("Drawing SQUARE");
        this.color.applyColor();
    }
}
