package net.emmecilab.design.pattern.factory;

/**
 *
 * @author Mauro Cicolella
 */
public class Client {

    public static void main(String[] args) {

        FiguraGeometrica cerchio = FiguraGeometricaFactory.createFiguraGeometrica(TipoFigura.CERCHIO);
        cerchio.disegna();

        FiguraGeometrica triangolo = FiguraGeometricaFactory.createFiguraGeometrica(TipoFigura.TRIANGOLO);
        triangolo.disegna();
    }
}
