import java.util.ArrayList;

import sun.jvmstat.perfdata.monitor.PerfStringConstantMonitor;

public class Fichaje {

    private String tipo;
    private String fecha;
    private ArrayList<Persona> p;

    public Fichaje(String tipo, String fecha, Persona p) {
        this.tipo = tipo;
        this.fecha = fecha;
        this.p = new ArrayList<Persona>(nombre, apellidos, codigo);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Persona> getP() {
        return p;
    }

    public void setP(ArrayList<Persona> p) {
        this.p = p;
    }

    


    




}