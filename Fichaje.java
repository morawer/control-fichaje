import java.time.LocalDateTime;

public class Fichaje {

    private String tipo;
    private String nombre;
    private String apellidos;
    private int codigo;
    private LocalDateTime fecha;

    public Fichaje() {
    }

    public Fichaje(String tipo, String nombre, String apellidos, int codigo) {
        this.tipo = tipo;
        this.fecha = LocalDateTime.now();
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.codigo = codigo;
       
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return 
        "\n*FICHAJE: " +
        "\n-Nombre: " + nombre +
        "\n-Apellido: " + apellidos +
        "\n-ID: " + codigo +
        "\n-Tipo fichaje: " + tipo +
        "\n-Fecha: " + fecha;
        }

   




}