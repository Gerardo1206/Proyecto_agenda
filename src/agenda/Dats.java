package agenda;

import java.io.Serializable;
import java.util.ArrayList;

public class Dats implements Serializable {
    private ArrayList<Evento> eventos;
    private Integer n;

    public ArrayList<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(ArrayList<Evento> eventos) {
        this.eventos = eventos;
    }

    public Integer getN() {
        return n;
    }

    public void setN(Integer n) {
        this.n = n;
    }

    public Dats(ArrayList<Evento> eventos, Integer n) {
        this.eventos = eventos;
        this.n = n;
    }

    public Dats() {
    }

    @Override
    public String toString() {
        return "Dats{" + "eventos=" + eventos + ", n=" + n + '}';
    }
    
    
}
