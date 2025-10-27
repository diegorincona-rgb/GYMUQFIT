package uniquindio.edu.poo;
import uniquindio.edu.poo.model.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class App {

    public static void main(String[] args) {

    Gymuqfit gymuqfit = new Gymuqfit("GYMUQFIT", "CLL 50 CRA 20 CENTRO",318862555,5556,LocalTime.of(5,0),LocalTime.of(12,0),LocalTime.of(15,0),LocalTime.of(22,0),TipoDeEstado.ABIERTO);


    //HERENCIA USUARIO ESTUDIANTE
        Estudiante estudiante = new Estudiante("Diego","Rincon Alvarez", 1115189532, "diego.rincona@uqvirtual.edu.co", "CLL50", 318862555, 32,74, 1.68,LocalDate.of(1992,11,12),RutinasDeFuerza.BICEPS,"programacion","Ingenieria de Sistemas",2);


    //HERENCIA USUARIO TRABAJADOR UQ
        Trabajadoresuq trabajadoresuq = new Trabajadoresuq("Juan", "Jimenez", 289643, "Cerrito", "juan.j@uqvirtual.edu.co",32122222,20,LocalDate.of(2005,4,15),RutinasDeFuerza.PESO_MUERTO,"Aarea de sistemas seguridad de la informacion", 289643,"jefe seguridad de la informacion d ela universidad del quindio",87,1.90);


    //HERENCIA USUARIO EXTERNOS
        Externos externos = new Externos("Samuel", "alvarado", 108565432, "circasia","samuel.1@gmail.com", 321324321, 23,89,1.60, LocalDate.of(2002,12,26),RutinasDeFuerza.SENTADILLAS,"maestro de construccion","constructor obra negra","avenida centenario");


    // INGRESAR MEMBRESIA
        Membresia membresia = new Membresia("BASICA", "ACTIVO", 100.000, LocalDate.of(2025,8,25),LocalDate.of(2025,9,25),usuario,clase,entrenadores,RutinasDeFuerza.BICEPS);


    //INGRESAR CLASES
        Clases clases = new Clases("Diego", "Rincon Alvarez", 1115189532, LocalDate.of(2025, 8, 25), LocalDate.of(2025, 9, 25), LocalTime.of(8, 0), LocalTime.of(10, 0), membresia.getUsuario(), entrenadores.getActividadDeportiva);


    //INGRESAR ACTIVIDAD DEPORTIVA
        ActividadDeportiva actividadDeportiva = new ActividadDeportiva("Diego", "Rincon Alvarez", 1115189532,318862555,RutinasDeFuerza.BICEPS,);



    //INGRESAR ENTRENADORES
        Entrenadores entrenadores = new Entrenadores("Juan", "peñas","Cerrito","Entrenador","Vacaciones", 59065432, 316666666,"YOGA",listUsuario);



    //SISTEMA DE IMPRESION
        System.out.println("Los Datos Del Estudiante Inscrito Son:"+estudiante.getNombres()+estudiante.getApellidos()+estudiante.getIdentificacion()+estudiante.getDireccion()+estudiante.getCorreo()+estudiante.getTelefono()+estudiante.getEdad()+estudiante.getFechaNacimiento()+estudiante.getRutinasDeFuerza()+estudiante.getCursoAcademico()+estudiante.getPrograma()+estudiante.getSemestre()+"la masa corporal deL estudiante es de:"+estudiante.calcularMedidas());
        System.out.println("Los Datos Persomales Del Usuario Quien Labora En La Universidad Del Quindio Son:"+trabajadoresuq.getNombres()+trabajadoresuq.getApellidos()+trabajadoresuq.getIdentificacion()+trabajadoresuq.getDireccion()+trabajadoresuq.getCorreo()+trabajadoresuq.getTelefono()+trabajadoresuq.getEdad()+trabajadoresuq.getFechaNacimiento()+trabajadoresuq.getRutinasDeFuerza()+trabajadoresuq.getLugarDondeLabora()+trabajadoresuq.getCodigoServicio()+trabajadoresuq.getCargo()+"la masa corporal del Empleado es de:"+trabajadoresuq.calcularMedidas());
        System.out.println("Los datos del usuario Externo son:"+externos.getNombres()+externos.getApellidos()+estudiante.getIdentificacion()+externos.getDireccion()+externos.getCorreo()+externos.getTelefono()+externos.getEdad()+externos.getFechaNacimiento()+externos.getRutinasDeFuerza()+externos.getCargo()+externos.getOcupacion()+externos.getEmpresaDondeLabora()+ "la masa corporal del Usuario Externo es de:"+estudiante.calcularMedidas());
        System.out.println("La membresia a la que se encuentra adscrito es la siguiente"+membresia.getTipoMembresia()+membresia.getEstadoMembresia()+membresia.getCostoMembresia()+membresia.getFechadeInicioMembresia()+membresia.getFechaVencimientoMembresia()+"Bienvenido al Gym UQ FIT");
        System.out.println("Bienvenido. Registra las clases en las que quieras participar"+clases.getNombre()+clases.getApellido()+clases.getIdentificacion()+clases.getFechaInicio()+clases.getFechaFinal()+clases.getHoraInicio()+clases.getHoraFinal());
        System.out.println(" La Actividad Deportiva de hoy es la siguiente"+actividadDeportiva.getNombre()+actividadDeportiva.getApellido()+actividadDeportiva.getIdentificacion()+actividadDeportiva.getTelefono()+actividadDeportiva.getRutinasDeFuerza()+actividadDeportiva.getActividadCardiovascular()+actividadDeportiva.getMaquinas());
        System.out.println("Registro de Entrenadores:"+entrenadores.getNombre()+entrenadores.getApellido()+entrenadores.getDireccion()+entrenadores.getCargo()+entrenadores.getEstado()+entrenadores.getIdentificacion()+entrenadores.getTelefono());


        //REGISTRAR USUARIOS AL GymUQFIT
        gymuqfit.getListUsuario().add(estudiante);
        gymuqfit.getListUsuario().add(trabajadoresuq);
        gymuqfit.getListUsuario().add(externos);

        //REGISTRAR MEMBRESIA AL GymUQFIT
        gymuqfit.getListMembresia().add(membresia);

        //REGISTRAR CLASES AL GymUQFIT
        gymuqfit.getListClases().add(clases);

        //REGISTRAR ACTIVIDAD DEPORTIVA AL GymUQFIT
        gymuqfit.getListActividadDeportiva().add(actividadDeportiva);

        //REGISTRAR ENTRENADORES AL GymUQFIT
        gymuqfit.getListEntrenadores().add(entrenadores);


        //REGISTRO DE USUARIOS

        int clasesEntrenadores= gymuqfit.contarUsuarios();

    }

}







