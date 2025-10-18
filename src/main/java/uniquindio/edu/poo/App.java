package uniquindio.edu.poo;
import uniquindio.edu.poo.model.*;

public class App {

    public static void main(String[] args) {

    Gymuqfit gymuqfit = new Gymuqfit("GYMUQFIT", "CLL 50 CRA 20 CENTRO",3188625556,5556, 5:00,);

    // INGRESAR USUARIO
        Usuario usuario = new Usuario("Diego", "Rincon Alvarez", 1115189532, "Cll 50", "12/11/1992", "diego.rincona@uqvirtual.edu.co",313772);

    //HERENCIA USUARIO ESTUDIANTE
        Estudiante estudiante = new Estudiante("Diego","Rincon Alvarez", 1115189532, "diego.rincona@uqvirtual.edu.co", "CLL50", 318862555, "ingenieria", "Programacion",2);
        Estudiante estudiante1 = new Estudiante();

    //HERENCIA USUARIO TRABAJADOR UQ
        Trabajadoresuq trabajadoresuq = new Trabajadoresuq();

    // INGRESAR MEMBRESIA
        Membresia membresia = new Membresia();

    //INGRESAR CLASES
        Clases clases = new Clases();

    //INGRESAR ACTIVIDAD DEPORTIVA
        ActividadDeportiva actividadDeportiva = new ActividadDeportiva();

    //INGRESAR ENTRENADORES
        Entrenadores entrenadores = new Entrenadores();





    }

}