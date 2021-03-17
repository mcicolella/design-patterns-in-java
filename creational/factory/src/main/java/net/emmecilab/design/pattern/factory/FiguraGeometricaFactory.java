package net.emmecilab.design.pattern.factory;

/**
 *
 * @author Mauro Cicolella
 */
public class FiguraGeometricaFactory {

    public static FiguraGeometrica createFiguraGeometrica(TipoFigura figura) {
        switch (figura) {
            case CERCHIO:
                return new Cerchio();

            case RETTANGOLO:
                return new Rettangolo();

            case TRIANGOLO:
                return new Triangolo();

            default:
                return null;
        }
    }
}
