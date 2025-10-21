
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


    //AGRUPACION
    private List<Usuario> listUsuario;
    private List<Clases> listClases;
    private List<ActividadDeportiva> listActividadDeportiva;
    private List<Membresia> listMembresia;

    //ASOCIASION
    private List<Entrenadores> listEntrenadores;

    //

    private TipoDeEstado tipoDeEstado;

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


    public Gymuqfit(String gymuqfit, String direccion, int telefonoOficina, int codigo, LocalDateTime of, int i) {
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefonoOficina() {
        return telefonoOficina;
    }

    public void setTelefonoOficina(int telefonoOficina) {
        this.telefonoOficina = telefonoOficina;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public LocalTime getHorarioInicioEnLaMañana() {
        return horarioInicioEnLaMañana;
    }

    public void setHorarioInicioEnLaMañana(LocalTime horarioInicioEnLaMañana) {
        this.horarioInicioEnLaMañana = horarioInicioEnLaMañana;
    }

    public LocalTime getHorarioCierreEnLaMañana() {
        return horarioCierreEnLaMañana;
    }

    public void setHorarioCierreEnLaMañana(LocalTime horarioCierreEnLaMañana) {
        this.horarioCierreEnLaMañana = horarioCierreEnLaMañana;
    }

    public LocalTime getHorarioInicioEnLaTarde() {
        return horarioInicioEnLaTarde;
    }

    public void setHorarioInicioEnLaTarde(LocalTime horarioInicioEnLaTarde) {
        this.horarioInicioEnLaTarde = horarioInicioEnLaTarde;
    }

    public LocalTime getHorarioCierreEnLaNoche() {
        return horarioCierreEnLaNoche;
    }

    public void setHorarioCierreEnLaNoche(LocalTime horarioCierreEnLaNoche) {
        this.horarioCierreEnLaNoche = horarioCierreEnLaNoche;
    }

    public List<Usuario> getListUsuario() {
        return listUsuario;
    }

    public void setListUsuario(List<Usuario> listUsuario) {
        this.listUsuario = listUsuario;
    }

    public List<Clases> getListClases() {
        return listClases;
    }

    public void setListClases(List<Clases> listClases) {
        this.listClases = listClases;
    }

    public List<ActividadDeportiva> getListActividadDeportiva() {
        return listActividadDeportiva;
    }

    public void setListActividadDeportiva(List<ActividadDeportiva> listActividadDeportiva) {
        this.listActividadDeportiva = listActividadDeportiva;
    }

    public List<Membresia> getListMembresia() {
        return listMembresia;
    }

    public void setListMembresia(List<Membresia> listMembresia) {
        this.listMembresia = listMembresia;
    }

    public List<Entrenadores> getListEntrenadores() {
        return listEntrenadores;
    }

    public void setListEntrenadores(List<Entrenadores> listEntrenadores) {
        this.listEntrenadores = listEntrenadores;
    }

    public TipoDeEstado getTipoDeEstado() {
        return tipoDeEstado;
    }

    public void setTipoDeEstado(TipoDeEstado tipoDeEstado) {
        this.tipoDeEstado = tipoDeEstado;
    }

    @Override
    public String toString() {
        return "Gymuqfit{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefonoOficina=" + telefonoOficina +
                ", codigo=" + codigo +
                ", horarioInicioEnLaMañana=" + horarioInicioEnLaMañana +
                ", horarioCierreEnLaMañana=" + horarioCierreEnLaMañana +
                ", horarioInicioEnLaTarde=" + horarioInicioEnLaTarde +
                ", horarioCierreEnLaNoche=" + horarioCierreEnLaNoche +
                ", listUsuario=" + listUsuario +
                ", listClases=" + listClases +
                ", listActividadDeportiva=" + listActividadDeportiva +
                ", listMembresia=" + listMembresia +
                ", listEntrenadores=" + listEntrenadores +
                ", tipoDeEstado=" + tipoDeEstado +
                '}';
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



