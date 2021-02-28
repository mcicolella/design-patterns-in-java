package net.emmecilab.design.pattern.factory;

/**
 *
 * @author Mauro Cicolella
 */
public class Rettangolo implements FiguraGeometrica {

    @Override
    public void disegna() {
        System.out.println("Sto disegnando un rettangolo");
    }

}
