public class Position {
    private double x;
    private double y;

    // Constructor
    public Position(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void setX(double X) {
        this.x = X;
    }

    public void setY(double Y) {
        this.y = Y;
    }

    public void setXY(double X, double Y) {
        this.x = X;
        this.y = Y;
    }

    public void move(double dx, double dy) {
        this.setX(this.x + dx);
        this.setY(this.y + dy);
    }

    public double distToOrigin() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }

    public boolean isXaxis() {
        return this.x >= 0;
    }

    public boolean isYaxis() {
        return this.y >= 0;
    }

    public String toString() {
        return this.x + " " + this.y;
    }

}