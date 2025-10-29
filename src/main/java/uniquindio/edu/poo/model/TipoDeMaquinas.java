package uniquindio.edu.poo.model;

public enum TipoDeMaquinas {
    CAMINADORA ("la Caminadora se encuentra en buen estado",true),
    BICICLETA("la Bicicleta se encuentra en buen estado",true),
    ELIPTICA("la Eliptica se encuentra en buen estado",true),
    ESCALADORA("la Escaladora se encuentra en buen estado",true),
    PRENSA("la Prensa se encuentra en buen estado",true),
    MANCUERNAS("las Mancuernas se encuentra en buen estado",true),
    BARRAS("las Barras se encuentra en buen estado",true),
    POLEA("la Polea se encuentra en buen estado",true);

    private final String mensaje;
    private final boolean disponible;

    public String getMensaje() {return mensaje;}

    TipoDeMaquinas(String mensaje, boolean disponible) {
        this.mensaje = mensaje;
        this.disponible = disponible;


    }

    public boolean isDisponible() {return disponible;}


}
