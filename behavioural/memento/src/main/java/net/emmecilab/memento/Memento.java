package net.emmecilab.memento;

/**
 *
 * @author Mauro Cicolella
 */
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
