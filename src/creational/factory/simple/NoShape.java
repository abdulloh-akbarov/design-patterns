package creational.factory.simple;

public class NoShape implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Nothing");
    }
}
