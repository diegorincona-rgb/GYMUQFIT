package uniquindio.edu.poo.model;

public enum NombreMembresia {

    BASICO("Incluye acceso general a maquinas"),
    PREMIUM ("Incluye acceso a maquinas y Clases Grupales"),
    VIP("Incluye acceso Ilimitado a todas las Clases,Areas de Spa y Entrenador Personal");

    private final String resultado;

    public String getResultado() {
        return resultado;

    }

    NombreMembresia(String resultado) {
            this.resultado = resultado;
    }




}
