package creational.singleton.lazy;

public final class DatabaseDCL {

    private static volatile DatabaseDCL instance;

    private DatabaseDCL() {}

    public static DatabaseDCL getInstance() {
        if (instance == null) {
            synchronized (DatabaseDCL.class) {
                if (instance == null) {
                    instance = new DatabaseDCL();
                }
            }
        }
        return instance;
    }

    public void connect() {
        System.out.println("DCL DB connected");
    }
}