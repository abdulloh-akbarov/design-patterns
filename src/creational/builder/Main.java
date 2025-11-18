package creational.builder;

public class Main {
    public static void main(String[] args) {
        User user = new UserBuilder()
                .firstName("Adam")
                .lastName("Smith")
                .email("adam.smith@mail.com")
                .build();

        System.out.println(user.toString());
    }
}
