package behavioral.memento;

public class Originator {
    private String text;

    public Originator(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Memento createMemento() {
        return new Memento(text);
    }

    public void restore(Memento memento) {
        this.text = memento.text();
    }
}
