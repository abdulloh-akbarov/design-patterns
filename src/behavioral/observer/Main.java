package behavioral.observer;

public class Main {
    public static void main(String[] args) {
        User david = new User("David");
        User john = new User("John");
        User moses = new User("Moses");

        Channel channel = new Channel();
        channel.attach(david);
        channel.attach(john);
        channel.attach(moses);

        channel.notifyObservers("Hello");
    }
}
