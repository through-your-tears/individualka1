public class Vector {
    private double x, y, z;
    private Point coord;
    Vector (Point a, Point b) {
        coord = new Point(b.getX()-a.getX(), b.getY() - a.getY(), b.getZ() - a.getZ());
        x = b.getX() - a.getX();
        y = b.getY() - a.getY();
        z = b.getZ() - a.getZ();
    }
    Vector (Point coord) {
        this.coord = coord;
        x = coord.getX();
        y = coord.getY();
        z = coord.getZ();
    }
    Vector (double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
        coord = new Point(x, y, z);
    }
    Vector() {
        coord = new Point(0, 0, 0);
        x = 0;
        y = 0;
        z = 0;
    }
    Point getCoord() { return coord; }
    void setCoord(Point coord) { this.coord = coord; }
    void setX(double x) { this.x = x; }
    void setY(double y) { this.x = y; }
    void setZ(double z) { this.x = z; }
    double getX() { return x; }
    double getY() { return y; }
    double getZ() { return z; }
    Vector addition(Vector next) {
        Vector nvector = new Vector(coord.getX() + next.getX(), coord.getY() + next.getY(), coord.getZ() + next.getZ());
        return nvector;
    }
    Vector subtraction(Vector next) {
        Vector nvector = new Vector(coord.getX() - next.getX(), coord.getY() - next.getY(), coord.getZ() - next.getZ());
        return nvector;
    }
    Point addition(Point next) {
        Point nvector = new Point(coord.getX() + next.getX(), coord.getY() + next.getY(), coord.getZ() + next.getZ());
        return nvector;
    }
    Point subtraction(Point next) {
        Point nvector = new Point(coord.getX() - next.getX(), coord.getY() - next.getY(), coord.getZ() - next.getZ());
        return nvector;
    }
    double scalar(Vector next) {
        return coord.getX()*next.getX()+coord.getY()*next.getY()+coord.getZ()*next.getZ();
    }
    double length() {
        return Math.sqrt(coord.getX()*coord.getX()+coord.getY()*coord.getY()+coord.getZ()*coord.getZ());
    }
    double Cos(Vector next) {
        return Math.acos(scalar(next)/(length()*next.length()));
    }
    void print() {
        coord.print();
    }
}