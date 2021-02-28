package net.emmecilab.strategy;

/**
 *
 * @author Mauro Cicolella
 */
public class Client {

    public static void main(String[] args) {
        Document doc = new Document();
        doc.setSavingStrategy(new SaveAsTxt());
        doc.save("Data to save");

    }
}
