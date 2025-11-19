package behavioral.observer;

public class User implements Observer {
    String name;

    @Override
    public void update(String message) {
        System.out.println(name + " Received a message: " + message);
    }

    public User(String name) {
        this.name = name;
    }
}
