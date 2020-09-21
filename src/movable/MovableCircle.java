package movable;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint centre;

    public MovableCircle (int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        this.centre = new MovablePoint(x, y, xSpeed, ySpeed);
    }
    @Override
    public void moveUp () {
        centre.moveUp();
    }
    @Override
    public void moveDown () {
        centre.moveDown();
    }
    @Override
    public void moveLeft () {
        centre.moveLeft();
    }
    @Override
    public void moveRight () {
        centre.moveRight();
    }
}
