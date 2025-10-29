package uniquindio.edu.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Entrenadores {
    private String nombre;
    private String Apellido;
    private int identificacion;
    private int telefono;
    private String direccion;
    private String cargo;
    private String estado;
    private String especialidad;


    // VINCULACION CON ENUM
    private EstadoDeEntrenadores estadoDeEntrenadores;


    //ASOCIACION
    private List<Usuario> listUsuarioPorEntrenador;
    private List<Membresia> listMembresiaParaEntrenadores;
    private List<Clases> listClasesParaEntrenadores;
    private List<ActividadDeportiva> listEntrenadoresParaLasActividadesDeportivas;

public Entrenadores(String nombre, String apellido, int identificacion, int telefono, String direccion, String cargo, String estado, String especialidad, Usuario usuario,EstadoDeEntrenadores estadoDeEntrenadores) {
    this.nombre = nombre;
    this.Apellido = apellido;
    this.identificacion = identificacion;
    this.telefono = telefono;
    this.direccion = direccion;
    this.cargo = cargo;
    this.estado = estado;
    this.especialidad = especialidad;
    this.listMembresiaParaEntrenadores = new ArrayList<>();
    this.listClasesParaEntrenadores = new ArrayList<>();
    this.listEntrenadoresParaLasActividadesDeportivas = new ArrayList<>();
    this.estadoDeEntrenadores = estadoDeEntrenadores;
    this.listUsuarioPorEntrenador = new ArrayList<>();


}



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }


    public List<Usuario> getListUsuarioPorEntrenador() {
        return listUsuarioPorEntrenador;
    }

    public void setListUsuarioPorEntrenador(List<Usuario> listUsuarioPorEntrenador) {
        this.listUsuarioPorEntrenador = listUsuarioPorEntrenador;
    }

    public List<Membresia> getListMembresiaParaEntrenadores() {
        return listMembresiaParaEntrenadores;
    }

    public void setListMembresiaParaEntrenadores(List<Membresia> listMembresiaParaEntrenadores) {
        this.listMembresiaParaEntrenadores = listMembresiaParaEntrenadores;
    }

    public List<Clases> getListClasesParaEntrenadores() {
        return listClasesParaEntrenadores;
    }

    public void setListClasesParaEntrenadores(List<Clases> listClasesParaEntrenadores) {
        this.listClasesParaEntrenadores = listClasesParaEntrenadores;
    }

    public List<ActividadDeportiva> getListEntrenadoresParaLasActividadesDeportivas() {
        return listEntrenadoresParaLasActividadesDeportivas;
    }

    public void setListEntrenadoresParaLasActividadesDeportivas(List<ActividadDeportiva> listEntrenadoresParaLasActividadesDeportivas) {
        this.listEntrenadoresParaLasActividadesDeportivas = listEntrenadoresParaLasActividadesDeportivas;
    }

    public EstadoDeEntrenadores getEstadoDeEntrenadores() {
        return estadoDeEntrenadores;
    }

    @Override
    public String toString() {
        return "Entrenadores{" +
                "nombre='" + nombre + '\'' +
                ", Apellido='" + Apellido + '\'' +
                ", identificacion=" + identificacion +
                ", telefono=" + telefono +
                ", direccion='" + direccion + '\'' +
                ", cargo='" + cargo + '\'' +
                ", estado='" + estado + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", estadoDeEntrenadores=" + estadoDeEntrenadores +
                ", listUsuarioPorEntrenador=" + listUsuarioPorEntrenador +
                ", listMembresiaParaEntrenadores=" + listMembresiaParaEntrenadores +
                ", listClasesParaEntrenadores=" + listClasesParaEntrenadores +
                ", listEntrenadoresParaLasActividadesDeportivas=" + listEntrenadoresParaLasActividadesDeportivas +
                '}';
    }
}
