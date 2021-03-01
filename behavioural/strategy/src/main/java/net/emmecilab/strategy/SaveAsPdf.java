package net.emmecilab.strategy;

/**
 *
 * @author Mauro Cicolella
 */
public class SaveAsPdf implements SavingStrategy {

    @Override
    public void save(String data) {
        System.out.println("New version of Saving '" + data + "' as pdf");
    }
}
