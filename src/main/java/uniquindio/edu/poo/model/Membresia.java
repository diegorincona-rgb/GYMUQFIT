package uniquindio.edu.poo.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Membresia {


    private LocalDate fechadeInicioMembresia;
    private LocalDate fechaVencimientoMembresia;

    //ASOSIACION

    private List<Usuario> listusuarios;
    private Clases classes;
    private Entrenadores entrenadores;
    private ActividadDeportiva actividadDeportiva;


    private EstadoMembresia estadoMembresia;
    private TipoMembresia tipoMembresiaUsuarios;
    private NombreMembresia nombreMembresia;







    public Membresia(LocalDate fehcaInicioMembresia, LocalDate fechaVencimientoMembresia, EstadoMembresia estadoMembresia,
                     TipoMembresia tipoMembresiaUsuarios, NombreMembresia nombreMembresia) {

        this.fechadeInicioMembresia = fehcaInicioMembresia;
        this.fechaVencimientoMembresia = fechaVencimientoMembresia;
        this.estadoMembresia = estadoMembresia;
        this.tipoMembresiaUsuarios = tipoMembresiaUsuarios;
        this.nombreMembresia = nombreMembresia;
        this.listusuarios = new ArrayList<>();


    }

    public LocalDate getFechadeInicioMembresia() {
        return fechadeInicioMembresia;
    }

    public void setFechadeInicioMembresia(LocalDate fechadeInicioMembresia) {
        this.fechadeInicioMembresia = fechadeInicioMembresia;
    }

    public LocalDate getFechaVencimientoMembresia() {
        return fechaVencimientoMembresia;
    }

    public void setFechaVencimientoMembresia(LocalDate fechaVencimientoMembresia) {
        this.fechaVencimientoMembresia = fechaVencimientoMembresia;
    }

    public EstadoMembresia getEstadoMembresia() {
        return estadoMembresia;
    }

    public void setEstadoMembresia(EstadoMembresia estadoMembresia) {
        this.estadoMembresia = estadoMembresia;
    }

    public TipoMembresia getCostoMembresiaUsuarios() {
        return tipoMembresiaUsuarios;
    }

    public void setCostoMembresiaUsuarios(TipoMembresia tipoMembresiaUsuarios) {
        this.tipoMembresiaUsuarios = tipoMembresiaUsuarios;
    }

    public NombreMembresia getTipoMembresia() {
        return nombreMembresia;
    }

    public void setTipoMembresia(NombreMembresia nombreMembresia) {
        this.nombreMembresia = nombreMembresia;
    }

}



