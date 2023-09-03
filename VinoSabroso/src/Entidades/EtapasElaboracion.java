package Entidades;

public abstract class EtapasElaboracion  {
    //Atributos
    protected int turno;
    protected String etapa;
    //Constructores
    public EtapasElaboracion(){
    }
    public EtapasElaboracion(int turno){
        this.turno=turno;
    }
    //Getters y Setters
    public int getTurno(){
        return turno;}
    public void setTurno(int turno){
        this.turno=turno;}
    public String getEtapa(){
        return etapa;}
    public void setEtapa(String etapa){
        this.etapa=etapa;}



}
