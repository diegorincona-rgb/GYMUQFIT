package uniquindio.edu.poo.model;

public enum TipoMembresia {
    MENSUAL ("El pago a registrar es de ($100.000.oo) Cien Mil pesos Mensuales"),
    TRIMESTRAL ("El pago a registrar es de ($270.000.oo) Doscientos Setenta Mil pesos, tiene un descuento " +
            "por pago Trimestral"),
    ANUAL ("El pago a registrar es de ($1.000.000.oo) un Millon de Pesos, tiene un descuento por pago Anual");

    private String registro;

    public String getRegistro() {return registro;}

    TipoMembresia(String registro) {
        this.registro = registro;
    }


}
