package Punto2.Entidades;
import java.util.Date;
public class Reserva {
    private Date fecha;
    private Date hora;

    public Reserva(Date fecha, Date hora){
        this.fecha = fecha;
        this.hora = hora;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

}
