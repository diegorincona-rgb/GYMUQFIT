package uniquindio.edu.poo.model;

import java.time.LocalDate;
import java.util.List;

public class Membresia {


    private String tipoMembresia;
    private String estadoMembresia;
    private LocalDate fechadeInicioMembresia;
    private LocalDate fechaVencimientoMembresia;

    //ASOSIACION

    private Usuario usuario;
    private Clases classes;
    private Entrenadores entrenadores;
    private ActividadDeportiva actividadDeportiva;


    private EstadoMembresia estadoDeMembresiaUsuarios;
    private CostoMembresia costoMembresiaUsuarios;
    private EstadoUsuario estadoUsuario;



    public Membresia(String tipoMembresia, String estadoMembresia, LocalDate fehcaInicioMembresia,
                     LocalDate fechaVencimientoMembresia, EstadoMembresia estadoDeMembresiaUsuarios, Usuario usuario,
                     Clases classes, Entrenadores entrenadores, ActividadDeportiva actividadDeportiva,CostoMembresia costoMembresia,EstadoUsuario estadoUsuario) {

        this.tipoMembresia = tipoMembresia;
        this.estadoMembresia=estadoMembresia;

        this.fechadeInicioMembresia=fehcaInicioMembresia;
        this.fechaVencimientoMembresia=fechaVencimientoMembresia;
        this.usuario=usuario;
        this.classes=classes;
        this.entrenadores=entrenadores;
        this.actividadDeportiva=actividadDeportiva;
        this.estadoDeMembresiaUsuarios=estadoDeMembresiaUsuarios;
        this.costoMembresiaUsuarios=costoMembresiaUsuarios;
        this.estadoUsuario=estadoUsuario;




    }



    @Override
    public String toString() {
        return "Membresia{" +
                "tipoMembresia='" + tipoMembresia + '\'' +
                ", estadoMembresia='" + estadoMembresia + '\'' +
                ", fechadeInciioMembresia=" + fechadeInicioMembresia +
                ", fechaVencimientoMembresia=" + fechaVencimientoMembresia +
                '}';
    }



    public String getTipoMembresia() {
        return tipoMembresia;
    }

    public void setTipoMembresia(String tipoMembresia) {
        this.tipoMembresia = tipoMembresia;
    }

    public String getEstadoMembresia() {
        return estadoMembresia;
    }

    public void setEstadoMembresia(String estadoMembresia) {
        this.estadoMembresia = estadoMembresia;
    }


    public LocalDate getFechadeInicioMembresia() {
        return fechadeInicioMembresia;
    }

    public void setFechadeInicioMembresia(LocalDate fechadeInciioMembresia) {
        this.fechadeInicioMembresia = fechadeInciioMembresia;
    }

    public LocalDate getFechaVencimientoMembresia() {
        return fechaVencimientoMembresia;
    }

    public void setFechaVencimientoMembresia(LocalDate fechaVencimientoMembresia) {
        this.fechaVencimientoMembresia = fechaVencimientoMembresia;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public ActividadDeportiva getActividadDeportiva() {
        return actividadDeportiva;
    }

    public void setActividadDeportiva(ActividadDeportiva actividadDeportiva) {
        this.actividadDeportiva = actividadDeportiva;
    }

    public Clases getClasses() {
        return classes;
    }

    public void setClasses(Clases classes) {
        this.classes = classes;
    }

    public Entrenadores getEntrenadores() {
        return entrenadores;
    }

    public void setEntrenadores(Entrenadores entrenadores) {
        this.entrenadores = entrenadores;
    }

    public EstadoMembresia getEstadoDeMembresiaUsuarios() {
        return estadoDeMembresiaUsuarios;
    }

    public void setEstadoDeMembresiaUsuarios(EstadoMembresia estadoDeMembresiaUsuarios) {
        this.estadoDeMembresiaUsuarios = estadoDeMembresiaUsuarios;
    }

    public CostoMembresia getCostoMembresiaUsuarios() {
        return costoMembresiaUsuarios;
    }

    public void setCostoMembresiaUsuarios(CostoMembresia costoMembresiaUsuarios) {
        this.costoMembresiaUsuarios = costoMembresiaUsuarios;
    }

    public EstadoUsuario getEstadoUsuario() {
        return estadoUsuario;
    }

    public void setEstadoUsuario(EstadoUsuario estadoUsuario) {
        this.estadoUsuario = estadoUsuario;
    }
}


