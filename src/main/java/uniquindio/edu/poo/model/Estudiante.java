package uniquindio.edu.poo.model;

import java.time.LocalDate;

public class Estudiante extends Usuario {

    private String cursoAcademico;
    private String programa;
    private int semestre;
    private double peso;
    private double altura;

    public Estudiante(String nombre, String apellido, int identificacion, String direccion, String correo, int telefono, int edad, double peso, double altura, LocalDate fechaNacimiento,RutinasDeFuerza rutinasDeFuerza, String cursoAcademico, String programa, int semestre) {
        super(nombre,apellido,identificacion, direccion,correo, telefono,edad,fechaNacimiento,rutinasDeFuerza);
        this.cursoAcademico = cursoAcademico;
        this.programa = programa;
        this.semestre = semestre;
        this.peso=peso;
        this.altura=altura;

    }
    public double calcularMedidas() {
        double resultado = peso / (altura * altura);
        return resultado;
    }

    public String getCursoAcademico() {
        return cursoAcademico;
    }

    public void setCursoAcademico(String cursoAcademico) {
        this.cursoAcademico = cursoAcademico;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "cursoAcademico='" + cursoAcademico + '\'' +
                ", programa='" + programa + '\'' +
                ", semestre=" + semestre +
                '}';
    }
}
