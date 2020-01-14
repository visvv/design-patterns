package vv.dp.bridge;

// Shape has Color as composite type.
public abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract void drawShape();
}
