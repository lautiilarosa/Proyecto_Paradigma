package Entidades;

public class Limpieza extends EtapasElaboracion{
    //Atributos
    private int fase;

    //Constructor
    public Limpieza(int fase, int turno){ //???
        super(turno);
        this.fase=fase;
    }
    public Limpieza(){
    }

    //Getters y Setters
    public int getFase(){
        return fase;}
    public void setFase(int fase){
        this.fase=fase;}

}
