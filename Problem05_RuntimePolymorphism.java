class Shape {

    void area() {

        System.out.println("Calculating area");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void area() {
        double result = Math.PI * radius * radius;

        System.out.println("Circle area: " + result);
    }
}


class Rectangle extends Shape {

    double length;
    double width;

    Rectangle(double length, double width) {

        this.length = length;
        this.width = width;
    }

    @Override
    void area() {

        double result = length * width;

        System.out.println("Rectangle area: " + result);
    }
}


public class Problem05_RuntimePolymorphism {

    public static void main(String[] args) {

        Shape[] shapes = {
            new Circle(5),
            new Rectangle(10, 5)
        };

        for (Shape shape : shapes) {

            shape.area();
        }
    }
}