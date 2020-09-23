public class Point {
    protected double x ,y, z;
    Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    Point () {
        this(0, 0, 0);
    }
    void setX(double x) {
        this.x = x;
    }
    void setY(double y) {
        this.y = y;
    }
    void setZ(double z) { this.z = z; }
    double getX() {
        return x;
    }
    double getY() {
        return y;
    }
    double getZ() { return z; }
    double distance(Point next) {
        return Math.sqrt((this.x-next.x)*(this.x-next.x)+(this.y-next.y)*(this.y-next.y)+(this.z-next.z)*(this.z-next.z));
    }
    void move(double a, double b, double c) {
        x += a;
        y += b;
        z += c;
    }
    void print() {
        System.out.println(x+" "+y+" "+z);
    }
}
