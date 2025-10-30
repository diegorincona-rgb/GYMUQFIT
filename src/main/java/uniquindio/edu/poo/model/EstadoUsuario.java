package uniquindio.edu.poo.model;

public enum EstadoUsuario {

        ACTIVO("Usuario activo en el gimnasio",true),
        INACTIVO("Usuario inactivo en el gimnasio",false);

        private final String descripcionUsuario;
        private final boolean estado;

    public String getDescripcionUsuario() {
        return descripcionUsuario;
    }
    EstadoUsuario(String descripcionUsuario) {
        this.descripcionUsuario = descripcionUsuario;
        this.estado = false;
    }

    public boolean isEstado() {
        return estado;
    }




    }
