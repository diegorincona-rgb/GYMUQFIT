package uniquindio.edu.poo.model;

import java.time.LocalDate;

public class Trabajadoresuq extends Usuario {

    private String lugarDondeLabora;
    private int codigoServicio;
    private String cargo;
    private double peso;
    private double altura;

public Trabajadoresuq(String nombre, String apellido, int identificacion, String direccion, String correo, int telefono, int edad, LocalDate fechaNacimiento,String lugarDondeLabora, int codigoServicio, String cargo, double peso, double altura, TipoMembresia tipoMembresia) {
    super(nombre,apellido,identificacion,direccion,correo,telefono,edad,fechaNacimiento, tipoMembresia);
    this.lugarDondeLabora = lugarDondeLabora;
    this.codigoServicio = codigoServicio;
    this.cargo = cargo;
    this.peso = peso;
    this.altura = altura;


}
    public double calcularMedidas() {
        double resultado = peso / (altura * altura);
        return resultado;
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
