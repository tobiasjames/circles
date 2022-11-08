public class Main {

    public static void output(Circle2D c1, Circle2D c2) {
        double perimeter = c1.getPerimeter();
        double area = c1.getArea();
        boolean containsPoint = c1.contains(c2.x, c2.y);
        boolean containsCircle = c1.contains(c2);
        boolean overlaps = c1.overlaps(c2);

        System.out.println("Circle 1: x = " + c1.x + ", y = " + c1.y + ", radius = " + c1.radius);
        System.out.println("Circle 2: x = " + c2.x + ", y = " + c2.y + ", radius = " + c2.radius);
        System.out.println("Circle 1 perimeter is " + perimeter);
        System.out.println("Circle 1 area is " + area);
        System.out.println("Does Circle 1 contain point (Circle 2's center)? " + containsPoint);
        System.out.println("Does Circle 1 contain Circle 2? " + containsCircle);
        System.out.println("Does Circle 1 overlap with Circle 2? " + overlaps + "\n");
    }

    public static void main(String[] args) {

        Circle2D c1 = new Circle2D(2, 2, 5.5);
        Circle2D c2 = new Circle2D(3, 3, 0);
        Circle2D c3 = new Circle2D(4, 5, 10.5);
        Circle2D c4 = new Circle2D(3, 5, 2.3);
  //      Circle2D c5 = new Circle2D(0, 0, "3");
        Circle2D[] collection = {c1, c2, c3, c4};

        for (Circle2D c : collection) {
                output(c1, c);
        }
    }
}