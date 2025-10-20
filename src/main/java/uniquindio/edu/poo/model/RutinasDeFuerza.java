package uniquindio.edu.poo.model;

public enum RutinasDeFuerza {
    SENTADILLAS("la rutina que debe realizar es la siguiente"),
    PESO_MUERTO("la rutina que debe realizar es la siguiente"),
    ARRANQUE("la rutina que debe realizar es la siguiente"),
    HOMBROS("la rutina que debe realizar es la siguiente"),
    DOMINADA("la rutina que debe realizar es la siguiente"),
    PLANCHA("la rutina que debe realizar es la siguiente"),
    TRICEPS("la rutina que debe realizar es la siguiente"),
    BICEPS("la rutina que debe realizar es la siguiente"),
    ZANCADAS("la rutina que debe realizar es la siguiente");

    private String mensaje;

    public String getMensaje() {
        return mensaje;
    }


    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    RutinasDeFuerza(String mensaje) {
        this.mensaje = mensaje;

    }


}


