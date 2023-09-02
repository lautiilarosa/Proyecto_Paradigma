package Entidades;

public class Despalillado extends EtapasElaboracion{
    //Atributos
    private String tipo;

    //Constructor
    public Despalillado(String tipo){
        this.tipo=tipo;}

    //Getters y Setters
    public String getTipo(){
        return tipo;}
    public void setTipo(String tipo){
        this.tipo=tipo;}

}
