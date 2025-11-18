package creational.prototype;

public class Document implements Prototype {
    private String name;

    public Document(String name) {
        this.name = name;
    }

    public Document() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Document clone() {
        try {
            return (Document) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Document{" + "name='" + name + '\'' + '}';
    }
}
