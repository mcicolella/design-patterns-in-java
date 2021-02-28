package net.emmecilab.strategy;

/**
 *
 * @author Mauro Cicolella
 */
public class SaveAsTxt implements SavingStrategy {

    @Override
    public void save(String data) {
        System.out.println("Saving '" + data + "' as txt");
    }

}
