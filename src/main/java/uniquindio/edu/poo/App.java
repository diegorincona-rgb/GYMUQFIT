package uniquindio.edu.poo;
import uniquindio.edu.poo.model.*;
import uniquindio.edu.poo.model.TipoDeMaquinas;

import java.time.LocalDate;
import java.time.LocalTime;

public class App {

    public static void main(String[] args) {

    Gymuqfit gymuqfit = new Gymuqfit("GYMUQFIT", "CLL 50 CRA 20 CENTRO",318862555,
            5556, LocalTime.of(5,0),LocalTime.of(12,0),LocalTime.of(15,0),
            LocalTime.of(22,0),TipoDeEstado.ABIERTO);


    //HERENCIA USUARIO ESTUDIANTE
     //   Estudiante estudiante = new Estudiante("Diego","Rincon Alvarez", 1115189532, "diego.rincona@uqvirtual.edu.co", "CLL50", 318862555, 32,74, 1.68,LocalDate.of(1992,11,12), "programacion","Ingenieria de Sistemas",2);


    //HERENCIA USUARIO TRABAJADOR UQ
      //  Trabajadoresuq trabajadoresuq = new Trabajadoresuq("Juan", "Jimenez", 289643, "Cerrito", "juan.j@uqvirtual.edu.co",32122222,20,LocalDate.of(2005, 4,15),"Aarea de sistemas seguridad " + "de la informacion", 289643, "jefe seguridad de la informacion d ela universidad" + " del quindio",87,1.90);


    //HERENCIA USUARIO EXTERNOS
      //  Externos externos = new Externos("Samuel", "alvarado", 108565432, "circasia", "samuel.1@gmail.com", 321324321, 23,89,1.60, LocalDate.of(2002, 12,26), "maestro de construccion", "constructor obra negra","avenida centenario");

//INGRESAR ENTRENADORES
        Entrenadores entrenadores = new Entrenadores("Juan", "peñas",59065432,
                316666666,"Cerrito", "Entrenador","ACTIVO","YOGA",
                EstadoDeEntrenadores.LABORANDO);

    // INGRESAR MEMBRESIA
        Membresia membresia = new Membresia(LocalDate.of(2025,8,25),LocalDate.of(2025,
                9,25),EstadoMembresia.ACTIVO, TipoMembresia.MENSUAL, NombreMembresia.PREMIUM);


    //INGRESAR CLASES
      //  Clases clases = new Clases("Diego", "Rincon Alvarez", 1115189532,
     //           LocalDate.of(2025, 8, 25), LocalDate.of(2025, 9, 25),
       //         LocalTime.of(8, 0), LocalTime.of(10, 0), membresia.getUsuario(),
         //       entrenadores.getActividadDeportiva);


    //INGRESAR ACTIVIDAD DEPORTIVA
   //     ActividadDeportiva actividadDeportiva = new ActividadDeportiva("Diego", "Rincon Alvarez",
     //           1115189532,318862555, RutinasDeFuerza.BICEPS,estudiante,TipoDeMaquinas.ELIPTICA,
      //          "");







    //SISTEMA DE IMPRESION


        System.out.println("La membresia a la que se encuentra adscrito es la siguiente"+membresia.getTipoMembresia()
                +membresia.getEstadoMembresia() +membresia.getFechadeInicioMembresia()
                +membresia.getFechaVencimientoMembresia()+"Bienvenido al Gym UQ FIT");

        System.out.println("Bienvenido. Registra las clases en las que quieras participar");

        System.out.println(" La Actividad Deportiva de hoy es la siguiente");

        System.out.println("Registro de Entrenadores:"+entrenadores.getNombre()+entrenadores.getApellido()
                +entrenadores.getDireccion()+entrenadores.getCargo() +entrenadores.getEstado()
                +entrenadores.getIdentificacion()+entrenadores.getTelefono());


        //REGISTRAR USUARIOS AL GymUQFIT
     //   gymuqfit.getListUsuario().add(estudiante);
     //   gymuqfit.getListUsuario().add(trabajadoresuq);
     //   gymuqfit.getListUsuario().add(externos);
     //   gymuqfit.getListUsuario().add(membresia.getUsuario());

        //REGISTROS MEMBRESIA
     //   gymuqfit.getListMembresia().add(membresia);




        //REGISTRAR CLASES AL GymUQFIT
     //   gymuqfit.getListClases().add(clases);

        //REGISTRAR ACTIVIDAD DEPORTIVA AL GymUQFIT
     //   gymuqfit.getListActividadDeportiva().add(actividadDeportiva);

        //REGISTRAR ENTRENADORES AL GymUQFIT
      //  gymuqfit.getListEntrenadores().add(entrenadores);

        //REGISTRAR MEMBRESIAS AL ENUM
     //   gymuqfit.getListMembresia().add(membresia);

     //   System.out.println("La Membresia adscrita es:"+ membresia.getCostoMembresia());

        //INVOCAR ENUM EN EL GYMUQFIT
        LocalTime horaActual = LocalTime.now();
        System.out.println("La hora actual: "+horaActual+TipoDeEstado.ABIERTO);
        System.out.println(gymuqfit.estadoDelGymuqfit(horaActual));




        //INVOCAR ENUM AL MAIN ACTIVIDAD DEPÓRTIVA
     //   System.out.println(actividadDeportiva.toString());


        //INVICAR ENUM EN ENTRENADORES
        System.out.println(entrenadores.toString());

        //INVOCAR ENUM EN ACTIVIDADES DE FUERZA
        System.out.println(); //CALCULAR MASA CORPORAL DEPENDIENDO DEL PESO SE REALIZA LOS SIGUIENTES EJERCICIOS IF ELSE

        //REGISTRO DE USUARIOS

     //   int clasesEntrenadores= gymuqfit.contarUsuarios();

    }

}







