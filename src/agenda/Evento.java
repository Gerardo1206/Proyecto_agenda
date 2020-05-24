package agenda;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ceivg
 */
public class Evento implements Serializable {
   private String titulo;
   private Date inicio;
   private Date end;
   private String comentario;
   private String ubicacion;
   private ArrayList<Invitado> invitados;
   
   
    public Evento(String titulo, Date inicio, Date end, String comentario, String ubicacion, ArrayList<Invitado> invitados) {
        this.titulo = titulo;
        this.inicio = inicio;
        this.end = end;
        this.comentario = comentario;
        this.ubicacion = ubicacion;
        this.invitados = invitados;   
    }
   
   public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public ArrayList<Invitado> getInvitados() {
        return invitados;
    }

    public void setInvitados(ArrayList<Invitado> invitados) {
        this.invitados = invitados;
    }

    @Override
    public String toString() {
        return "Evento{" + "titulo=" + titulo + ", inicio=" + inicio + ", end=" + end + ", comentario=" + comentario + ", ubicacion=" + ubicacion + ", invitados=" + invitados + '}';
    }
    public String toinicio(){
        return new  SimpleDateFormat("EEE, d MMM yyyy h:mm a").format(inicio);
    }
    public String tofinal(){
        return new SimpleDateFormat("EEE, d MMM yyyy h:mm a").format(end);
    }
    
    public String Shorai(){
        String resultado=new SimpleDateFormat("h:mm").format(inicio).toLowerCase();
        if(new SimpleDateFormat("a").format(inicio).toLowerCase().equalsIgnoreCase("p.m.")){
            resultado=resultado+"pm";
        }else if(new SimpleDateFormat("a").format(inicio).toLowerCase().equalsIgnoreCase("a.m.")){
            resultado=resultado+"am";
        }
        return resultado;
    }
    public String Shoraf(){
        String resultado=new SimpleDateFormat("h:mm").format(end).toLowerCase();
        if(new SimpleDateFormat("a").format(end).toLowerCase().equalsIgnoreCase("p.m.")){
            resultado=resultado+"pm";
        }else if(new SimpleDateFormat("a").format(end).toLowerCase().equalsIgnoreCase("a.m.")){
            resultado=resultado+"am";
        }
        return resultado;
    }
}
