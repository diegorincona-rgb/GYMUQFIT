package uniquindio.edu.poo.model;

public class Externos extends Usuario{

    private String cargo;
    private String ocupacion;

public Externos(String nombre, String apellido, int identificacion, String correo, String direccion, int telefono, String lugarDondeLabora, int codigoServicio, String cargo ){
    super(nombre,apellido,identificacion,correo,direccion,telefono);
    this.cargo=cargo;
    this.ocupacion=ocupacion;

}

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    @Override
    public String toString() {
        return "Externos{" +
                "cargo='" + cargo + '\'' +
                ", ocupacion='" + ocupacion + '\'' +
                '}';
    }
}
