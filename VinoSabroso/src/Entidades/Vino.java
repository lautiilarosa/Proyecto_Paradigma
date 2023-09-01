package Entidades;
import java.time.LocalDate;
public class Vino {
    private String nombreVino;
    private int id;
    private Uva uva;
    private LocalDate fechaIngreso;
    private int contadorEstado;
    private String Estado;

    public Vino(String nombreVino, int id, Uva uva, LocalDate fechaIngreso, int contadorEstado, String estado) {
        this.nombreVino = nombreVino;
        this.id = id;
        this.uva = uva;
        this.fechaIngreso = fechaIngreso;
        this.contadorEstado = contadorEstado;
        Estado = estado;
    }

    public String getNombreVino() {
        return nombreVino;
    }

    public void setNombreVino(String nombreVino) {
        this.nombreVino = nombreVino;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Uva getUva() {
        return uva;
    }

    public void setUva(Uva uva) {
        this.uva = uva;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public int getContadorEstado() {
        return contadorEstado;
    }

    public void setContadorEstado(int contadorEstado) {
        this.contadorEstado = contadorEstado;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }
}
