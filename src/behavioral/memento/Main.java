package behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Memento> caretaker = new ArrayList<>();

        Originator originator = new Originator("Hello");
        caretaker.add(originator.createMemento());

        originator.setText("Hello World");
        caretaker.add(originator.createMemento());

        originator.restore(caretaker.get(0));
        System.out.println("Restored: " + originator.getText());

        originator.restore(caretaker.get(1));
        System.out.println("Restored: " + originator.getText());
    }
}
