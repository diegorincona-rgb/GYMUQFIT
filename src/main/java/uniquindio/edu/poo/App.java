package uniquindio.edu.poo;
import uniquindio.edu.poo.model.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class App {

    public static void main(String[] args) {

    Gymuqfit gymuqfit = new Gymuqfit("GYMUQFIT", "CLL 50 CRA 20 CENTRO",318862555,5556, LocalTime.of(5,0),LocalTime.of(10,0));

    // INGRESAR USUARIO
        Usuario usuario = new Usuario("Diego", "Rincon Alvarez", 1115189532, "Cll 50 PUERTO ESPEJO", "diego.rincona@uqvirtual.edu.co", 318862555, LocalDate.of(1992,11,12));

    //HERENCIA USUARIO ESTUDIANTE
        Estudiante estudiante = new Estudiante("Diego","Rincon Alvarez", 1115189532, "diego.rincona@uqvirtual.edu.co", "CLL50", 318862555, "ingenieria", "Programacion",2);

    //HERENCIA USUARIO TRABAJADOR UQ
        Trabajadoresuq trabajadoresuq = new Trabajadoresuq("Juan", "Jimenez", 289643,"juan.j@uqvirtual.edu.co", "Cerrito", 32122222,"GIMNNACIO",2111, "Entrenador");

    // INGRESAR MEMBRESIA
        Membresia membresia = new Membresia("BASICA", "ACTIVO", 100.000, LocalDate.of(2025,8,25),LocalDate.of(2025,9,25));

    //INGRESAR CLASES
        Clases clases = new Clases("Diego","Rincon Alvarez",1115189532, LocalDate.of(2025,8,25),LocalDate.of(2025,9,25),LocalTime.of(8,0),LocalTime.of(10,0));

    //INGRESAR ACTIVIDAD DEPORTIVA
        ActividadDeportiva actividadDeportiva = new ActividadDeportiva("Diego", "Rincon Alvarez", RutinasDeFuerza.BICEPS, );

    //INGRESAR ENTRENADORES
        Entrenadores entrenadores = new Entrenadores("Juan", "Jimenez","Cerrito","Entrenador","Vacaciones", 289643, 32122222);





    }

}