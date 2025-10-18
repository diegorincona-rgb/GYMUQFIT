package uniquindio.edu.poo.model;

import java.time.LocalDate;

public class Membresia {

    private String tipoMembresia;
    private String estadoMembresia;
    private double costoMembresia;
    private LocalDate fechadeInciioMembresia;
    private LocalDate fechaVencimientoMembresia;

    public Membresia(String tipoMembresia, String estadoMembresia, double costoMembresia, LocalDate fehcaInicioMembresia, LocalDate fechaVencimientoMembresia  ) {
        this.tipoMembresia = tipoMembresia;
        this.estadoMembresia=estadoMembresia;
        this.costoMembresia=costoMembresia;
        this.fechadeInciioMembresia=fehcaInicioMembresia;
        this.fechaVencimientoMembresia=fechaVencimientoMembresia;


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

    public double getCostoMembresia() {
        return costoMembresia;
    }

    public void setCostoMembresia(double costoMembresia) {
        this.costoMembresia = costoMembresia;
    }

    public LocalDate getFechadeInciioMembresia() {
        return fechadeInciioMembresia;
    }

    public void setFechadeInciioMembresia(LocalDate fechadeInciioMembresia) {
        this.fechadeInciioMembresia = fechadeInciioMembresia;
    }

    public LocalDate getFechaVencimientoMembresia() {
        return fechaVencimientoMembresia;
    }

    public void setFechaVencimientoMembresia(LocalDate fechaVencimientoMembresia) {
        this.fechaVencimientoMembresia = fechaVencimientoMembresia;
    }

    @Override
    public String toString() {
        return "Membresia{" +
                "tipoMembresia='" + tipoMembresia + '\'' +
                ", estadoMembresia='" + estadoMembresia + '\'' +
                ", costoMembresia=" + costoMembresia +
                ", fechadeInciioMembresia=" + fechadeInciioMembresia +
                ", fechaVencimientoMembresia=" + fechaVencimientoMembresia +
                '}';
    }
}
