package uniquindio.edu.poo.model;


public class ActividadDeportiva {
    private String nombre;
    private String apellido;
    private String actividadDeFuerza;
    private String actividadCardiovascular;
    private String maquinas;
    private int identificacion;
    private int telefono;



public ActividadDeportiva(String nombre, String apellido, String actividadDeFuerza, String actividadCardiovascular, String maquinas, int identificacion, int telefono) {

    this.nombre=nombre;
    this.apellido=apellido;
    this.actividadDeFuerza=actividadDeFuerza;
    this.actividadCardiovascular=actividadCardiovascular;
    this.maquinas=maquinas;
    this.identificacion=identificacion;
    this.telefono=telefono;
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getActividadDeFuerza() {
        return actividadDeFuerza;
    }

    public void setActividadDeFuerza(String actividadDeFuerza) {
        this.actividadDeFuerza = actividadDeFuerza;
    }

    public String getActividadCardiovascular() {
        return actividadCardiovascular;
    }

    public void setActividadCardiovascular(String actividadCardiovascular) {
        this.actividadCardiovascular = actividadCardiovascular;
    }

    public String getMaquinas() {
        return maquinas;
    }

    public void setMaquinas(String maquinas) {
        this.maquinas = maquinas;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "ActividadDeportiva{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", actividadDeFuerza='" + actividadDeFuerza + '\'' +
                ", actividadCardiovascular='" + actividadCardiovascular + '\'' +
                ", maquinas='" + maquinas + '\'' +
                ", identificacion=" + identificacion +
                ", telefono=" + telefono +
                '}';
    }
}
