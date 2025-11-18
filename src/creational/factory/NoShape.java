package creational.factory;

public class NoShape implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Nothing");
    }
}
