public class Circle2D {

    //data fields
    double x, y;
    double radius;

    //constructors
    public Circle2D() {
        this.x = 0;
        this.y = 0;
        this.radius = 1;
    }
    public Circle2D(double x, double y, double  radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    //get methods
    public double getArea() {
        return Math.pow(this.radius, 2) * Math.PI;
    }

    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    //containing or overlapping circles methods
    public boolean contains(double x, double y) {
        return Math.sqrt(Math.pow(x - this.x, 2)) + Math.pow(y - this.y, 2) <= this.radius;
    }

    public boolean contains(Circle2D circle){
        double distance = Math.sqrt(Math.pow(this.x - circle.x, 2) + Math.pow(this.y - circle.y, 2));
        return this.contains(circle.x, circle.y) && this.radius <= distance + circle.radius;
    }

    public boolean overlaps(Circle2D circle) {
        double distance = Math.sqrt(Math.pow(this.x - circle.x, 2) + Math.pow(this.y - circle.y, 2));
        return (distance <= this.radius + circle.radius) && !this.contains(circle);
    }
}
