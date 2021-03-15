package net.emmecilab.design.pattern.factory;

/**
 *
 * @author Mauro Cicolella
 */
public class Client {

    public static void main(String[] args) {

        FiguraGeometrica cerchio = FiguraGeometricaFactory.getFiguraGeometrica(TipoFigura.CERCHIO);
        cerchio.disegna();

        FiguraGeometrica triangolo = FiguraGeometricaFactory.getFiguraGeometrica(TipoFigura.TRIANGOLO);
        triangolo.disegna();
    }
}
