
package uniquindio.edu.poo.model;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;


public class Gymuqfit {

    private String nombre;
    private String direccion;
    private int telefonoOficina;
    private int codigo;
    private LocalTime horarioInicioEnLaMañana;
    private LocalTime horarioCierreEnLaMañana;
    private LocalTime horarioInicioEnLaTarde;
    private LocalTime horarioCierreEnLaNoche;


    //COMPOSICION
    private List<Usuario> listUsuario;
    private List<Clases> listClases;
    private List<ActividadDeportiva> listActividadDeportiva;
    private List<Membresia> listMembresia;

    //AGREGACION
    private List<Entrenadores> listEntrenadores;

    //INVOCACION ENUM
    private TipoDeEstado tipoDeEstado;

    /**
     * Cosntructor de la clase GymUQFIT  (Universidad del Quindio).
     * @param nombre del GymUQFIT
     * @param direccion del GymUQFIT
     * @param telefonoOficina del GymUQFIT
     * @param codigo del GymUQFIT
     * @param horarioInicioEnLaMañana del GymUQFIT
     * @param horarioCierreEnLaMañana del GymUQFIT
     * @param horarioInicioEnLaTarde del GymUQFIT
     * @param horarioCierreEnLaNoche del GymUQFIT
     * @param tipoDeEstado del GymUQFIT
     */

    public Gymuqfit(String nombre, String direccion, int telefonoOficina, int codigo, LocalTime horarioInicioEnLaMañana, LocalTime horarioCierreEnLaMañana,LocalTime horarioInicioEnLaTarde, LocalTime horarioCierreEnLaNoche, TipoDeEstado tipoDeEstado) {

        this.nombre = nombre;
        this.direccion = direccion;
        this.telefonoOficina = telefonoOficina;
        this.codigo = codigo;
        this.horarioInicioEnLaMañana = horarioInicioEnLaMañana;
        this.horarioCierreEnLaMañana = horarioCierreEnLaMañana;
        this.horarioInicioEnLaTarde=horarioInicioEnLaTarde;
        this.horarioCierreEnLaNoche=horarioCierreEnLaNoche;
        this.listUsuario = new ArrayList<>();
        this.listClases = new ArrayList<>();
        this.listActividadDeportiva = new ArrayList<>();
        this.listMembresia = new ArrayList<>();
        this.listEntrenadores = new ArrayList<>();
        this.tipoDeEstado=TipoDeEstado.ABIERTO;

    }

    //METODOS GETTERS Y SETTERS




    public List<Usuario> getListUsuario() {
        return listUsuario;
    }

    public List<Clases> getListClases() {
        return listClases;
    }

    public List<ActividadDeportiva> getListActividadDeportiva() {
        return listActividadDeportiva;
    }

    public List<Membresia> getListMembresia() {
        return listMembresia;
    }

    public List<Entrenadores> getListEntrenadores() {
        return listEntrenadores;
    }

    public TipoDeEstado getTipoDeEstado() {
        return tipoDeEstado;
    }

    public void setListUsuario(List<Usuario> listUsuario) {
        this.listUsuario = listUsuario;
    }

    public void setListClases(List<Clases> listClases) {
        this.listClases = listClases;
    }

    public void setListActividadDeportiva(List<ActividadDeportiva> listActividadDeportiva) {
        this.listActividadDeportiva = listActividadDeportiva;
    }

    public void setListMembresia(List<Membresia> listMembresia) {
        this.listMembresia = listMembresia;
    }

    public void setListEntrenadores(List<Entrenadores> listEntrenadores) {
        this.listEntrenadores = listEntrenadores;
    }

    public void setTipoDeEstado(TipoDeEstado tipoDeEstado) {
        this.tipoDeEstado = tipoDeEstado;
    }





    public  void  regristrarUsuario(Usuario usuario){
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



