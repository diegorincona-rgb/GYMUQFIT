package uniquindio.edu.poo.model;

public enum EstadoDeEntrenadores {
    VACACIONES("El Entrenador se Encuentra de Vacaciones",false),
    INCAPACITADO("El Entrenador se Encuentra Incapacitado",false),
    PERMISO("El Entrenador se Encuentra de Permiso",false),
    LABORANDO("El Entrenador se Encuentra de Laborando",true);

    private final String mensaje;
    private final boolean disponible;


    public String getMensaje() {
        return mensaje;
    }

    EstadoDeEntrenadores(String mensaje, boolean disponible) {
        this.mensaje = mensaje;
        this.disponible = disponible;

    }
    public boolean isDisponible() {return disponible;}
}
