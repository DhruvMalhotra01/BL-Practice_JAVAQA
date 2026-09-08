interface Drawable {

    void draw();
}


class Circle implements Drawable {

    @Override
    public void draw() {

        System.out.println("Drawing a Circle");
    }
}


class Square implements Drawable {

    @Override
    public void draw() {

        System.out.println("Drawing a Square");
    }
}


public class Problem01_InterfaceMultipleImplementation {

    public static void main(String[] args) {

        Drawable circle = new Circle();
        Drawable square = new Square();

        circle.draw();
        square.draw();
    }
}