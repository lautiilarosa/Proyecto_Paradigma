package Entidades;
public enum TipoUva {
    CABERNET_SAUVIGNON, MERLOT, TEMPRANILLO, GARNACHA, PINOT_NOIR, BONARDA, PINOT_GRIS, CHARDONNAY, SAUVIGNON_BLANC, VERDEJO, ALBARIÑO, GODELLO, MALBEC, MOSCATEL_ALEJANDRIA, CABERNET_FRANC;

    public static void mostrarUvas() {
        int contador = 1;
        for (TipoUva tipoUva : TipoUva.values()) {
            System.out.println(contador + ": " + tipoUva);
            contador++;
        }
    }

}



