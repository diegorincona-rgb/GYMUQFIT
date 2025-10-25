package uniquindio.edu.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Entrenadores {
    private String nombre;
    private String Apellido;
    private String direccion;
    private String cargo;
    private String estado;
    private int identificacion;
    private int telefono;


    //ASOCIACION
    private Usuario usuario;
    private List<Membresia> listMembresiaParaEntrenadores;
    private List<Clases> listClasesParaEntrenadores;
    private List<ActividadDeportiva> listEntrenadoresParaLasActividadesDeportivas;

public Entrenadores(String nombre, String apellido,  String direccion, String cargo, String estado, int identificacion, int telefono, Usuario usuario) {
    this.nombre = nombre;
    this.Apellido = apellido;
    this.direccion = direccion;
    this.cargo = cargo;
    this.estado = estado;
    this.identificacion = identificacion;
    this.telefono = telefono;
    this.usuario = usuario;
    this.listMembresiaParaEntrenadores = new ArrayList<>();
    this.listClasesParaEntrenadores = new ArrayList<>();
    this.listEntrenadoresParaLasActividadesDeportivas = new ArrayList<>();


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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
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

    @Override
    public String toString() {
        return "Entrenadores{" +
                "nombre='" + nombre + '\'' +
                ", Apellido='" + Apellido + '\'' +
                ", direccion='" + direccion + '\'' +
                ", cargo='" + cargo + '\'' +
                ", estado='" + estado + '\'' +
                ", identificacion=" + identificacion +
                ", telefono=" + telefono +
                ", usuario=" + usuario +
                '}';
    }
}
