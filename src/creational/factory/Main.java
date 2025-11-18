package creational.factory;

public class Main {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape square = factory.getShape("square");
        Shape circle = factory.getShape("circle");
        Shape rectangle = factory.getShape("rectangle");

        square.draw();
        circle.draw();
        rectangle.draw();
    }
}
