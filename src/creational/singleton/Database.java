package creational.singleton;

public class Database {
    private final String connection;

    private static Database instance;

    private Database(String connection) {
        this.connection = connection;
    }

    public synchronized static Database getInstance() {
        if (instance == null) {
            instance = new Database("path");
        }
        return instance;
    }

    public String getConnection() {
        return connection;
    }
}
