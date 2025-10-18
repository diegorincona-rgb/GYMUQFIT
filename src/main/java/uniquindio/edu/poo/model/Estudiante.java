package uniquindio.edu.poo.model;

public class Estudiante extends Usuario{

    private String cursoAcademico;
    private String programa;
    private int semestre;

    public Estudiante(String nombre, String apellido,int identificacion, String correo,String direccion, int telefono, String cursoAcademico, String programa, int semestre) {
        super(nombre,apellido,identificacion, correo, direccion, telefono);
        this.cursoAcademico = cursoAcademico;
        this.programa = programa;
        this.semestre = semestre;

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
