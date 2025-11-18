package creational.singleton;

public class Main {
    public static void main(String[] args) {
        Database database = Database.getInstance();
        Database database2 = Database.getInstance();

        System.out.println(database.getConnection());
        System.out.println(database2.getConnection());
    }
}
