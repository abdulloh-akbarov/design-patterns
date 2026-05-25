package creational.singleton.lazy;

public final class DatabaseSynchronized {

    private static DatabaseSynchronized instance;

    private DatabaseSynchronized() {}

    public static synchronized DatabaseSynchronized getInstance() {
        if (instance == null) {
            instance = new DatabaseSynchronized();
        }
        return instance;
    }

    public void connect() {
        System.out.println("Synchronized DB connected");
    }
}