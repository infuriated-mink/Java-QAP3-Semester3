package Problem2;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    // Constructor with x and y coordinates
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // No-arg constructor
    public Point() {

    }

    // Getters
    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float[] getXY() {
        return new float[] { x, y };
    }

    // Setters
    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // toString method to display the x and y coordinates of the point in the format
    // (x, y)
    @Override
    public String toString() {
        return String.format("Point: (x=%.1f, y=%.1f)", x, y);
    }
}