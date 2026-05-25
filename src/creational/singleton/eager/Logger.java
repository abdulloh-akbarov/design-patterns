package creational.singleton.eager;

public class Logger {
    private Logger() {
    }

    private static final Logger INSTANCE = new Logger();

    public static Logger getInstance() {
        return INSTANCE;
    }
}
