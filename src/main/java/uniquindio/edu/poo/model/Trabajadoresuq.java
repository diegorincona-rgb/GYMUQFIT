package uniquindio.edu.poo.model;

public class Trabajadoresuq extends Usuario {

    private String lugarDondeLabora;
    private int codigoServicio;
    private String cargo;

public Trabajadoresuq(String nombre, String apellido, int identificacion, String correo, String direccion, int telefono, String lugarDondeLabora, int codigoServicio, String cargo) {
    super(nombre,apellido,identificacion,correo,direccion,telefono);
    this.lugarDondeLabora = lugarDondeLabora;
    this.codigoServicio = codigoServicio;
    this.cargo = cargo;


}

    public String getLugarDondeLabora() {
        return lugarDondeLabora;
    }

    public void setLugarDondeLabora(String lugarDondeLabora) {
        this.lugarDondeLabora = lugarDondeLabora;
    }

    public int getCodigoServicio() {
        return codigoServicio;
    }

    public void setCodigoServicio(int codigoServicio) {
        this.codigoServicio = codigoServicio;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Trabajadoresuq{" +
                "lugarDondeLabora='" + lugarDondeLabora + '\'' +
                ", codigoServicio=" + codigoServicio +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}
