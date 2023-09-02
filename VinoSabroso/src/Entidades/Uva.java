package Entidades;

public class Uva {
    private TipoUva tipoUva;
    private String maridaje;
    private String cuerpo;
    private String aromaIntensidad;
    private String sabor;
    private String aparienciaVisual;
    private String lugarCosecha;
    private String epocaCosecha;
    private int gradoAlcohol;

        //Constructor

    public Uva(TipoUva tipoUva, String maridaje, String cuerpo, String aromaIntensidad, String sabor, String aparienciaVisual,String lugarCosecha, String epocaCosecha, int gradoAlcohol){
        this.tipoUva = tipoUva;
        this.maridaje = maridaje;
        this.cuerpo = cuerpo;
        this.aromaIntensidad = aromaIntensidad;
        this.sabor = sabor;
        this.aparienciaVisual = aparienciaVisual;
        this.lugarCosecha = lugarCosecha;
        this.epocaCosecha = epocaCosecha;
        this.gradoAlcohol = gradoAlcohol;
    }

    //Getters
    public TipoUva getTipoUva() {return tipoUva;}
    public String getMaridaje() {return maridaje;}

    public String getCuerpo(){return cuerpo;}

    public String getAromaIntensidad(){return aromaIntensidad;}

    public String getSabor() {return sabor;}

    public String getAparienciaVisual() {return aparienciaVisual;}

    public String getLugarCosecha(){return lugarCosecha;}

    public String getEpocaCosecha() {return epocaCosecha;}
    public int getGradoAlcohol() {return gradoAlcohol;}

}
