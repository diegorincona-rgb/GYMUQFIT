package uniquindio.edu.poo.model;


import java.util.ArrayList;
import java.util.List;

public class ActividadDeportiva {
    private String nombre;




    private List<TipoDeMaquinas> listTipoDeMaquinasDeActividadDeportivas;
    private List<RutinasDeFuerza> listRutinasDeFuerzas;

    public ActividadDeportiva(String nombre) {

        this.nombre = nombre;
        this.listTipoDeMaquinasDeActividadDeportivas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public List<TipoDeMaquinas> getListTipoDeMaquinasDeActividadDeportivas() {
        return listTipoDeMaquinasDeActividadDeportivas;
    }

    public void setListTipoDeMaquinasDeActividadDeportivas(List<TipoDeMaquinas> listTipoDeMaquinasDeActividadDeportivas) {
        this.listTipoDeMaquinasDeActividadDeportivas = listTipoDeMaquinasDeActividadDeportivas;
    }


}

