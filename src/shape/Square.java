package shape;

public class Square extends Rectangle {
    public Square () { }

    public Square (double side) {
        this.length = side;
        this.width = side;
    }

    public Square (double side, String color, boolean filled) {
        this.length = side;
        this.width = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide () {
        return width;
    }

    public void setSide (double side) {
        this.width = side;
        this.length = side;
    }
    @Override
    public void setWidth (double side) {
        this.width = side;
    }
    @Override
    public void setLength (double side) {
        this.length = side;
    }
    @Override
    public String toString () {
        return "Shape: square, side: "+this.width+", color: "+this.color;
    }
}
