package net.emmecilab.strategy;

/**
 *
 * @author Mauro Cicolella
 */
public class Document {

    private SavingStrategy strategy;

    public Document() {
    }

    public Document(SavingStrategy strategy) {
        this.strategy = strategy;
    }

    public void setSavingStrategy(SavingStrategy strategy) {
        this.strategy = strategy;
    }

    public void save(String data) {
        strategy.save(data);

    }

}
