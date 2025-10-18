
package uniquindio.edu.poo.model;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class Gymuqfit {

    private String nombre;
    private String direccion;
    private int telefonoOficina;
    private int codigo;
    private LocalDateTime horarioInicio;
    private LocalDateTime horarioCierre;


    //AGRUPACION
    private List<Usuario> listUsuario;
    private List<Clases> listClases;
    private List<ActividadDeportiva> listActividadDeportiva;
    private List<Membresia> listMembresia;

    //ASOCIASION
    private List<Entrenadores> listEntrenadores;

    private TipoDeEstado tipoDeEstado;

    public Gymuqfit(String nombre, String direccion, int telefonoOficina, int codigo, LocalDateTime horarioInicio, LocalDateTime horarioCierre) {

        this.nombre = nombre;
        this.direccion = direccion;
        this.telefonoOficina = telefonoOficina;
        this.codigo = codigo;
        this.horarioInicio = horarioInicio;
        this.horarioCierre = horarioCierre;
        this.listUsuario = new ArrayList<>();
        this.listClases = new ArrayList<>();
        this.listActividadDeportiva = new ArrayList<>();
        this.listMembresia = new ArrayList<>();
        this.listEntrenadores = new ArrayList<>();
        this.tipoDeEstado=tipoDeEstado;
    }

    public void regristrarUsuario(Usuario usuario){
        listUsuario.add(usuario);

    }

    public void registrarClases(Clases clases){
        listClases.add(clases);
    }

    public void registarMembresia(Membresia membresia){
        listMembresia.add(membresia);
    }

    public void registrarActividadDeportiva(ActividadDeportiva actividadDeportiva){
        listActividadDeportiva.add(actividadDeportiva);
    }

    public void verificarUsuario(Usuario usuario){
        listUsuario.add(usuario);
    }


    public void verificarClases(Clases clases){
        listClases.add(clases);
    }

    public void verificarEntrenador(Entrenadores entrenadores){
        listEntrenadores.add(entrenadores);
    }

    public void agendarUsuario(Usuario usuario){
        listUsuario.add(usuario);
    }
    public void agendarActividadDeportiva(ActividadDeportiva  actividadDeportiva){
        listActividadDeportiva.add(actividadDeportiva);
    }

    public void agendarClases(Clases clases){
        listClases.add(clases);
    }

    public void agendarEntrenador(Entrenadores entrenadores){
        listEntrenadores.add(entrenadores);
    }
    public void generarUsuario(Usuario usuario){
        listUsuario.add(usuario);
    }
    public void eliminarUsuario(Usuario usuario){
        listUsuario.add(usuario);
    }

}



