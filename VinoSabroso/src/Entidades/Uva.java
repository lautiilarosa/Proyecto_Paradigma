package Entidades;

public enum Uva {
    CABERNET_SAUVIGNON("Tinto", "Mendoza", new String[] { "Febrero", "Marzo" }, new int[] { 12, 36 }, "Rojo y Intensidad media", "Grosella,intenso", "Completo", "Frutas Oscuras","Carnes Rojas Asadas"),
    MERLOT("Tinto","Mendoza",new String[] { "Marzo","Abril" },new int[] {6,24},"Rojo Rubí","Ciruelay Intensidad media","Medio","Suave,Frutal","Pollo,cerdo"),
    TEMPRANILLO("Tinto","Mendoza",new String[] {"Abril","Mayo"}, new int[] {6,48}, "Rojo Granate", "Frutas Rojas y Intensidad media-alta", "Medio", "Frutas Maduras", "Jamón,Cordero"),
    GRANACHA("Tinto","España",new String[] {"Septiembre","Octubre"},new int[] {0},"Rojo Brillante","Frutas Rojas y Intensidad media","Medio", "Bayas,especias","Carnes a la pariila,embutidos"),
    PINOT_NOIR("Tinto","Francia",new String[] {"Agosto","Septiembre"},new int[] {6,24}, "Rojo Claro","Frutas rojas y Intensidad baja-media","ligero","Delicado Frutal","Aves,pescados"),
    BONARDA("Tinto","Argentina (este mendocino),Italia",new String[] {"Agosto","Septiembre"}, new int[] {0}, "Rojo Rubí", "Fruta Roja y Intensidad Media","Medio","Sabor Suave","Quesos Duros(vinos más envejecidos) y Pastas(vinos jóvenes"),
    PINOT_GRIS("Blanco","Francia,Alemania",new String[] {"Febrero","Marzo"},new int[] {3,6},"Amarillo Oscuro","Cítricos y Intensidad Moderada","Medio a pleno","Mezcla de frutas tropicales(melón y mango)","Carnes Blancas,comida asiática"),
    CHARDONNAY("Blanco","Francia,Estados Unidos",new String[] {"Agosto"},new int[] {0},"Amarillo Pálido","Frutos frescos y Intensidad Moderada","Ligero y Fresco","Frutas Blancas y tropicales","Platos de Mariscos"),
    SAUVIGNONG_BLANC("Blanco","Francia,Nueva Zelanda",new String[] {"Febrero","Marzo"},new int[] {1},"Tono amarillo pálido","Refrescante y Intensidad media-alta","Ligero a medio","Notas herbales y vegetales","Mariscos,pescados"),
    VERDEJO("Blanco","España",new String[] {"Septiembre"},new int[] {3,6},"Amarillo Verdoso","Aroma frutal intenso","Ligero a medio","Frutos secos y miel","Pollo ligero y Mariscos"),
    ALBARIÑO("Blanco","España,Argentina",new String[] {"Septiembre","Octubre"},new int[] {6},"Amarillo Pálido","Flores blancas y Intensidad moderada","Ligero a medio","Sabores Cítricos y frutales","Frutas del mar y Carnes Blancas"),
    GODELLO("BLANCO","España",new String[] {"Agosto","Septiembre"},new int[] {3,6},"Color Amarillo Duradero","Manzana y Intensidad Media","Medio-Alto","Frutas blancas y amarillas","Pescados Blancos y quesos suaves"),
    MALBEC("Tinto","Francia,Argentina",new String[] {"Febrero","Marzo"},new int[] {3,12},"Rojo Oscuro y Púrpura","Frutas Negras y Intensidad Media-Alta","Medio-Completo","Frutas negras(ciruelas y moras","Carnes rojas a la parilla"),
    CABERNET_FRANC("Tinto","Francia,Argentina",new String[] {"Septiembre","Octubre"},new int[] {6,18},"Rojo Rubí(Vinos Jóvenes) y Morado Oscuro(Vinos envejecidos)","Vainilla y Intensidad Media-Alta","Medio-Alto","Frutos rojos (frambuesas y cerezas)","Carnes rojas y aves"),
    MOSCATEL_ALEJANDRIA("Blanco","España,Italia",new String[] {"Agosto","Septiembre"},new int[] {3,6},"Color Dorado","Flor de azahary Intensidad Alta","Ligero-Medio","Sabor Canela o Vainilla","Frutas Frescas y secas");

    private final String tipoUva;
    private final String lugarCosecha;
    private final String[] fechaCosecha;
    private final int[] fechaCrianza;
    private final String aparienciaVisual;
    private final String aromasIntensidad;
    private final String cuerpo;
    private final String sabor;
    private final String maridaje;

    private Uva(String tipoUva, String lugarCosecha, String[] fechaCosecha, int[] fechaCrianza, String aparienciaVisual, String aromasIntensidad, String cuerpo, String sabor,String maridaje) {
        this.tipoUva = tipoUva;
        this.lugarCosecha = lugarCosecha;
        this.fechaCosecha = fechaCosecha;
        this.fechaCrianza = fechaCrianza;
        this.aparienciaVisual = aparienciaVisual;
        this.aromasIntensidad = aromasIntensidad;
        this.cuerpo = cuerpo;
        this.sabor = sabor;
        this.maridaje = maridaje;
    }

    // Métodos getter para acceder a los atributos
    public String getTipoUva() {
        return tipoUva;
    }

    public String getLugarCosecha() {
        return lugarCosecha;
    }

    public String[] getFechaCosecha() {
        return fechaCosecha;
    }

    public int[] getFechaCrianza() {
        return fechaCrianza;
    }

    public String getAparienciaVisual() {
        return aparienciaVisual;
    }

    public String getAromasIntensidad() {
        return aromasIntensidad;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public String getSabor() {
        return sabor;
    }

    public String getMaridaje(){
        return maridaje;
    }

    public static void mostrarUvas() {
        int contador = 1;
        for (Uva tiposUva : Uva.values()) {
            System.out.println(contador + ": " + tiposUva);
            contador++;
        }
    }

}
