package creational.factory;

public class ShapeFactory {
    public Shape getShape(String shapeType) {
        return switch (shapeType.toLowerCase()) {
            case "circle" -> new Circle();
            case "square" -> new Square();
            default -> new NoShape();
        };
    }
}
