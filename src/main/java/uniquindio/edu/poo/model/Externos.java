package uniquindio.edu.poo.model;

import java.time.LocalDate;

public class Externos extends Usuario{

    private String cargo;
    private String ocupacion;
    private String empresaDondeLabora;
    private double peso;
    private double altura;

public Externos(String nombre, String apellido, int identificacion, String direccion, String correo, int telefono, int edad, double peso, double altura, LocalDate fechaNacimiento,RutinasDeFuerza rutinasDeFuerza,String cargo,  String ocupacion, String lugarEmpresaDondeLabora ){
    super(nombre,apellido,identificacion, direccion,correo, telefono,edad,fechaNacimiento,rutinasDeFuerza);
        this.cargo=cargo;
        this.ocupacion=ocupacion;
        this.empresaDondeLabora=lugarEmpresaDondeLabora;
        this.peso=peso;
        this.altura=altura;

}
    public double calcularMedidas() {
        double resultado = peso / (altura * altura);
        return resultado;
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

    public String getEmpresaDondeLabora() {
        return empresaDondeLabora;
    }

    public void setEmpresaDondeLabora(String empresaDondeLabora) {
        this.empresaDondeLabora = empresaDondeLabora;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Externos{" +
                "cargo='" + cargo + '\'' +
                ", ocupacion='" + ocupacion + '\'' +
                ", empresaDondeLabora='" + empresaDondeLabora + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}
