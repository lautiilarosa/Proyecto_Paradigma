package Entidades.Uvas;
import Entidades.Uvas.*;
import Entidades.EtapasEnum;

/**
 * Enumeración TiposUva en donde representa los 15 tipos de uva que puede seleccionar el usuario
 * @version 1.3, 07/09/2023
 * @author Lautaro
 */

public enum TiposUva {
    CABERNET_SAUVIGNON(CabernetSauvignon.class),
    MERLOT(Merlot.class),
    TEMPRANILLO(Tempranillo.class),
    GRANACHA(Granacha.class),
    PINOT_NOIR(PinotNoir.class),
    BONARDA(Bonarda.class),
    PINOT_GRIS(PinotGris.class),
    CHARDONNAY(Chardonnay.class),
    SAUVIGNONG_BLANC(SauvignonBlanc.class),
    VERDEJO(Verdejo.class),
    ALBARIÑO(Albariño.class),
    GODELLO(Godello.class),
    MALBEC(Malbec.class) ,
    CABERNET_FRANC(CabernetFranc.class),
    MOSCATEL_ALEJANDRIA(MoscatelAlejandria.class);

    private Class<?> clase;


    /**
     * método que muestra todas las uvas en una lista ordenada
     */
    public static void imprimirTipoUva(){
        int cont = 1;
        for (TiposUva tipo : TiposUva.values()){
            System.out.println(cont+": "+tipo);
            cont++;
        }
        System.out.println("");
    }

    /**
     *
     * @param clase la clase que se asigna como característica al valor del enum
     */
    TiposUva(Class<?> clase){
        this.clase = clase;
    }

    /**
     * @return clase que quiero obtener
     */
    public Class<?> getClase() {
        return clase;
    }
}
