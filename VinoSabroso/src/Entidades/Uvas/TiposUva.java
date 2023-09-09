package Entidades.Uvas;

import Entidades.EtapasEnum;

/**
 * Enumeración TiposUva en donde representa los 15 tipos de uva que puede seleccionar el usuario
 * @version 1.3, 07/09/2023
 * @author Lautaro
 */

public enum TiposUva {
    CABERNET_SAUVIGNON,
    MERLOT,
    TEMPRANILLO,
    GRANACHA,
    PINOT_NOIR,
    BONARDA,
    PINOT_GRIS,
    CHARDONNAY,
    SAUVIGNONG_BLANC,
    VERDEJO,
    ALBARIÑO,
    GODELLO,
    MALBEC ,
    CABERNET_FRANC,
    MOSCATEL_ALEJANDRIA;

    public static void imprimirTipoUva(){
        int cont = 1;
        for (TiposUva tipo : TiposUva.values()){
            System.out.println(cont+": "+tipo);
            cont += 1;
        }
        System.out.println("");
    }
}
