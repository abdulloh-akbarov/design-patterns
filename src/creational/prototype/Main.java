package creational.prototype;

public class Main {
    public static void main(String[] args) {
        Document doc1 = new Document("doc1");
        Document doc2 = doc1.clone();

        System.out.println(doc1);
        System.out.println(doc2);
    }
}
