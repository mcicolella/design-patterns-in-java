package net.emmecilab.design.pattern.factory;

/**
 *
 * @author Mauro Cicolella
 */
public class Triangolo implements FiguraGeometrica {

    @Override
    public void disegna() {
        System.out.println("Sto disegnando un triangolo");
    }

}
