package Entidades;

public class Cosecha extends EtapasElaboracion{
    //Atributos
    private String tipo;

    //Constructor
    public Cosecha(String tipo, int turno){
        super(turno);
        this.tipo=tipo;}
    public Cosecha(){
        }

    //Getters y Setters
    public String getTipo(){
        return tipo;}
    public void setTipo(String tipo){
        this.tipo=tipo;}

}
