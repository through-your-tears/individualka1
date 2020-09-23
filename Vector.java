public class Vector extends Point{
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
    Vector addition(Vector next) {
        Vector nvector = new Vector(x + next.getX(), y + next.getY(), z + next.getZ());
        return nvector;
    }
    Vector subtraction(Vector next) {
        Vector nvector = new Vector(x - next.getX(), y - next.getY(), z - next.getZ());
        return nvector;
    }
    Point addition(Point next) {
        Point nvector = new Point(x + next.getX(), y + next.getY(), z + next.getZ());
        return nvector;
    }
    Point subtraction(Point next) {
        Point nvector = new Point(x - next.getX(), y - next.getY(), z - next.getZ());
        return nvector;
    }
    double scalar(Vector next) {
        return x*next.getX()+y*next.getY()+y*next.getZ();
    }
    double length() {
        return Math.sqrt(x*x+y*y+z*z);
    }
    double Cos(Vector next) {
        return scalar(next)/(length()*next.length());
    }
    void print() {
        coord.print();
    }
}
