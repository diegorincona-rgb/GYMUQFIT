
package uniquindio.edu.poo.model;
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
    private static List<Entrenadores> listEntrenadores;

    //INVOCACION ENUM
    private TipoDeEstado tipoDeEstado;

    /**
     * Cosntructor de la clase GymUQFIT  (Universidad del Quindio).
     *
     * @param nombre                  del GymUQFIT
     * @param direccion               del GymUQFIT
     * @param telefonoOficina         del GymUQFIT
     * @param codigo                  del GymUQFIT
     * @param horarioInicioEnLaMañana del GymUQFIT
     * @param horarioCierreEnLaMañana del GymUQFIT
     * @param horarioInicioEnLaTarde  del GymUQFIT
     * @param horarioCierreEnLaNoche  del GymUQFIT
     * @param tipoDeEstado            del GymUQFIT
     */

    public Gymuqfit(String nombre, String direccion, int telefonoOficina, int codigo, LocalTime horarioInicioEnLaMañana,
                    LocalTime horarioCierreEnLaMañana, LocalTime horarioInicioEnLaTarde, LocalTime horarioCierreEnLaNoche,
                    TipoDeEstado tipoDeEstado) {

        this.nombre = nombre;
        this.direccion = direccion;
        this.telefonoOficina = telefonoOficina;
        this.codigo = codigo;
        this.horarioInicioEnLaMañana = horarioInicioEnLaMañana;
        this.horarioCierreEnLaMañana = horarioCierreEnLaMañana;
        this.horarioInicioEnLaTarde = horarioInicioEnLaTarde;
        this.horarioCierreEnLaNoche = horarioCierreEnLaNoche;
        this.listUsuario = new ArrayList<>();
        this.listClases = new ArrayList<>();
        this.listActividadDeportiva = new ArrayList<>();
        this.listMembresia = new ArrayList<>();
        this.listEntrenadores = new ArrayList<>();
        this.tipoDeEstado = TipoDeEstado.ABIERTO;


    }

    //VINCULAR ENUM ESTADO DEL GYMUQFIT

    /**
     * Estado del GymUqFit
     * @param horaActual Estado del GymUqFit
     * @return horaActual
     */


    public String estadoDelGymuqfit(LocalTime horaActual) {
        String mensaje;
        if((horaActual.isAfter(LocalTime.of(5,0))&&horaActual.isAfter(LocalTime.of(12,0)))||
                (horaActual.isAfter(LocalTime.of(15,0))&&horaActual.isAfter(LocalTime.of(22,0)))){
            mensaje = "El GymUqFit se encuentra Abierto" + TipoDeEstado.ABIERTO.getMensaje();
        } else if ((horaActual.isAfter(LocalTime.of(12,0))&&horaActual.isAfter(LocalTime.of(15,0)))||
                (horaActual.isAfter(LocalTime.of(22,0))&&horaActual.isAfter(LocalTime.of(5,0)))) {
            mensaje = "El GymUqFit se encuentra Cerrado de 10 de la noche hasta las 5 de la mañana del dia siguiente" +
                    TipoDeEstado.CERRADO.getMensaje();
        } else {
            mensaje = "El GymUqFit se encuentra en Mantenimiento temporalmente";
        }
        return mensaje;
    }

    /**
     * REGISTRAR USUARIOS AL GYMUQFIT
     * @param estudiante Registrar Estudiante al GymUqFit
     * @param trabajadoresuq Registrar TrabajadoresUq al GymUqFit
     * @param externos Registrar Externos al GymUqFit
     */
    public void registarUsuario(Estudiante estudiante, Trabajadoresuq trabajadoresuq, Externos externos) {
        listUsuario.add(estudiante);
        listUsuario.add(trabajadoresuq);
        listUsuario.add(externos);
    }


    /**
     * Buscar Usuario por Identificacion
     * @param identificacion Usuario
     * @return encontrado
     */
    public Usuario buscarUsuarioPorIdentificacion(int identificacion) {
        Usuario encontrado = null;
        for (Usuario usuario : listUsuario) {
            if (usuario.getIdentificacion() == identificacion) {
                encontrado = usuario;
                break;
            }
        }
        return encontrado;
    }


    /**
     * Registrar Entrenadores al GymUqFit
     * @param entrenadores registrados al GymUqFit
     */
    public void registrarEntrenadores(Entrenadores entrenadores) {
        listEntrenadores.add(entrenadores);
    }


    public Membresia registrarMembresia(Membresia membresia) {
        listMembresia.add(membresia);
    return membresia;
    }

    public void CostoMembresia(Membresia membresia ) {
        listUsuario.add(membresia.getUsuario());

    }


    public boolean verificarEntrenadores() {
        boolean resultado = true;
        for (Entrenadores entrenador : listEntrenadores) {
            if (entrenador.getNombre().equals(nombre)) {
                resultado = false;
                break;
            }
        }
        return resultado;
    }

    public boolean buscarMembresia(int identificacion) {
        Usuario registrar = true;
        for (Membresia usuario : listMembresia) {
            if (identificacion == usuario.getUsuario()) {
                registrar = false;
                break;
            }
        }
        return registrar != null;

    }



    public Membresia vincularUsuariosClasesGrupales(Clases_Grupales) {
        Clases encontrado = null;
        for (Clases clases : listClases) {
            if (Clases.Clases_Grupales(YOGA, SPINING, ZUMBA, OTROS) == clases_Grupales) {
                encontrado = clases;
                break;
            }
        }
        return encontrado;
    }

    public Clases agregarClasesYoga(int identificacion) {

    }


    public Entrenadores asignarEntrenadoresClasesGrupales(Clases_Grupales) {
        Entrenadores encontrado = null;
        for (Entrenadores entrenadores : listEntrenadores) {
            if (clases_Grupales.YOGA == entrenadores) {
                encontrado = entrenadores;
                break;
            }
        }
        return encontrado;
    }


    public void registrarClases(Clases clases) {
        listClases.add(clases);
    }

    public void registarMembresia(Membresia membresia) {
        listMembresia.add(membresia);
    }

    public void registrarActividadDeportiva(ActividadDeportiva actividadDeportiva) {
        listActividadDeportiva.add(actividadDeportiva);
    }

    public void verificarUsuario(Usuario usuario) {
        listUsuario.add(usuario);
    }


    public void verificarClases(Clases clases) {
        listClases.add(clases);
    }

    public void verificarEntrenador(Entrenadores entrenadores) {
        listEntrenadores.add(entrenadores);
    }

    public void agendarUsuario(Usuario usuario) {
        listUsuario.add(usuario);
    }

    public void agendarActividadDeportiva(ActividadDeportiva actividadDeportiva) {
        listActividadDeportiva.add(actividadDeportiva);
    }

    public void agendarClases(Clases clases) {
        listClases.add(clases);
    }

    public void agendarEntrenador(Entrenadores entrenadores) {
        listEntrenadores.add(entrenadores);
    }

    public void generarUsuario(Usuario usuario) {
        listUsuario.add(usuario);
    }

    public void eliminarUsuario(Usuario usuario) {
        listUsuario.add(usuario);
    }

    public void TipoDeEstadoDeMaquina(ActividadDeportiva actividadDeportiva) {
        ActividadDeportiva TipoDeMaquinas = null;
        listActividadDeportiva.add(actividadDeportiva);


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




    //INVOCACION ESTADO ENUM



}





