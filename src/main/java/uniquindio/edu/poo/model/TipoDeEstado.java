package uniquindio.edu.poo.model;

public enum TipoDeEstado {
    ABIERTO("El Gimnacio UQ FIT se encuentra abierto y disponible en este momento", true),
    CERRADO("El Gimnacio UQ FIT se encuentra cerrado, consulta nuestros horarios de atencion", false);

    private final String mensaje;
    private final boolean disponible;


    public String getMensaje() {
        return mensaje;
    }

    TipoDeEstado(String mensaje, boolean disponible) {
        this.mensaje=mensaje;
        this.disponible=disponible;
    }

    public boolean isDisponible() { return disponible; }


}
