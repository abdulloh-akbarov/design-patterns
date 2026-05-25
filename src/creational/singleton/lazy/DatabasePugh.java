package creational.singleton.lazy;

public class DatabasePugh {
    private DatabasePugh() {
    }

    private static class Holder {
        private static final DatabasePugh INSTANCE = new DatabasePugh();
    }

    public static DatabasePugh getInstance() {
        return Holder.INSTANCE;
    }
}
