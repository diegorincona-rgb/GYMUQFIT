package uniquindio.edu.poo.model;

public enum EstadoMembresia {
    ACTIVO("Usuario activo en el gimnasio"),
    INACTIVO("Usuario inactivo en el gimnasio");

    private final String descripcionUsuario;

    public String getDescripcionUsuario() {
        return descripcionUsuario;
    }

    EstadoMembresia(String descripcionUsuario) {
        this.descripcionUsuario = descripcionUsuario;
    }


}
