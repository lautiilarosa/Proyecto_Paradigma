package Entidades;

public class SegundaFermentacion extends EtapasElaboracion{
    //Atributos
    private String tipo;

    //Constructor
    public SegundaFermentacion(String tipo){
        this.tipo=tipo;}

    //Getters y Setters
    public String getTipo(){
        return tipo;}
    public void setTipo(String tipo){
        this.tipo=tipo;}

}
