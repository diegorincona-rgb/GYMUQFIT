package uniquindio.edu.poo;
import uniquindio.edu.poo.model.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {

    Gymuqfit gymuqfit = new Gymuqfit( "GYMUQFIT", "CLL 15 CRA 18 CENTRO", 318862555, 5556, LocalTime.of(5,0),LocalTime.of(12,0),LocalTime.of(15,0),LocalTime.of(22,0),TipoDeEstado.ABIERTO);

    int opcion=-1;

    while(opcion!=0){
        System.out.print("\n - - - Bienvenido al Gym UQ FIT - - - ");
        System.out.print("\n ingrese al menu y seleccione la opcion requerida: ");
        System.out.print("1. registrar Usuario");
        System.out.print("2. registrar Membresia");
        System.out.print("3. registrar Clases");
        System.out.print("4. registrar ActividadDeportiva");
        System.out.print("5. verificar Informacion Usuario");
        System.out.print("6. verificar Membresia");
        System.out.print("7. verificar Clases");
        System.out.print("8. agendar Clases");
        System.out.print("9. agendar Usuarios");
        System.out.print("10. agendar Entrenadores");
        System.out.print("11. agendar ActividadDeportiva");
        System.out.print("12. generar informacion");
        System.out.print("0. Salir");

        System.out.print("\n Ingrese la opcion que desea registrar");
        opcion=scanner.nextInt();
        scanner.nextLine().trim();
        if(opcion==1){
            registrarUsuario(Gymuqfit);
        } else  if(opcion==2){
            registrarMembresia(Gymuqfit);
        } else if (opcion==3){
            registrarClases(Gymuqfit);
        } else if (opcion==4){
            registrarActividadDeportiva(Gymuqfit);
        } else if (opcion==5){
            verificarInformacionUsuario(Gymuqfit);
        } else if (opcion==6) {
            verificarMembresia(Gymuqfit);
        } else if (opcion==7) {
            verificarClases(Gymuqfit);
        } else if (opcion==8) {
            agendarClases(Gymuqfit);
        } else if (opcion==9) {
            agendarUsuario(Gymuqfit);
        } else if (opcion==10) {
            agendarEntrenadores(Gymuqfit);
        } else if (opcion==11) {
            agendarActividadDeportiva(Gymuqfit);
        } else if (opcion==12) {
            generarInformacion(Gymuqfit);
        } else if (opcion==0) {
            System.exit(0);
        } else {
            System.out.println("Opcion Incorrecta");
        }
        }
    scanner.close();
    }

    public static  void registrarUsuario(Usuario usuario) {

        System.out.println("Ingrese el nombre del usuario");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese la apellido del usuario");
        String apellido = scanner.nextLine();

        System.out.println("Ingrese la identificacion del usuario");
        int identificacion = scanner.nextInt();

        System.out.println("Ingrese la direccion del usuario");
        String direccion = scanner.nextLine();

        System.out.println("Ingrese la correo del usuario");
        String correo = scanner.nextLine();

        System.out.println("Ingrese la telefono del usuario");
        int telefono = scanner.nextInt();

        System.out.println("Ingrese la edad del usuario");
        int edad = scanner.nextInt();

        System.out.println("Ingrese la peso del usuario");
        double peso = scanner.nextDouble();

        System.out.println("Ingrese la altura del usuario");
        double altura = scanner.nextDouble();

        System.out.println("Ingrese el Año de nacimiento del usuario");
        int anio = scanner.nextInt();

        System.out.println("Ingrese el Mes de nacimiento del usuario");
        int mes = scanner.nextInt();

        System.out.println("Ingrese el Dia de nacimiento del usuario");
        int dia = scanner.nextInt();

        LocalDate fechaNacimiento= LocalDate.of(anio,mes,dia);
        System.out.println("La fecha de Nacimiento del usuario"+fechaNacimiento);

        System.out.println("ingrese el curso Academico que cursa");
        String cursoAcademico = scanner.nextLine();

        System.out.println("Ingrese el Programa Academico en el que se encuentra");
        String programa = scanner.nextLine();

        System.out.println("Ingrese el semestre en el que se encuentra");
        int semestre = scanner.nextInt();

        System.out.println("Ingrese el lugar donde labora");
        String lugarDondeLabora = scanner.nextLine();

        System.out.println("Ingrese el codigo de servicio asignado");
        int codigoServicio = scanner.nextInt();

        System.out.println("Ingrese el Cargo ");
        String cargo = scanner.nextLine();

        System.out.println("Ingrese la ocupacion del usuario");
        String ocupacion = scanner.nextLine();

        System.out.println("Ingrese la Empresa donde labora el usuario");
        String empresaDondeLabora = scanner.nextLine();

        Estudiante estudiante =new Estudiante(nombre, apellido,identificacion,direccion,correo,telefono,edad,peso,altura,fechaNacimiento,RutinasDeFuerza.PESO_MUERTO,cursoAcademico,programa,semestre);

        Trabajadoresuq trabajadoresuq = new Trabajadoresuq(nombre,apellido,identificacion,direccion,correo,telefono,edad,fechaNacimiento,RutinasDeFuerza.SENTADILLAS,lugarDondeLabora,codigoServicio,cargo,peso,altura);

        Externos externos =new Externos(nombre,apellido,identificacion,direccion,correo,telefono,edad,peso,altura,fechaNacimiento,RutinasDeFuerza.PESO_MUERTO,cargo,ocupacion,empresaDondeLabora);
    }

    public  static void registrarMembresia(Membresia membresia) {
        System.out.println("Ingrese el tipo de membresia");
        String tipoMembresia = scanner.nextLine();

        System.out.println("Ingrese el estado de membresia");
        String estadoDeMembresia = scanner.nextLine();

        System.out.println("Ingrese el costo de membresia");
        String costoMembresia = scanner.nextLine();

        System.out.println("Ingrese fecha de inicio de la membresia");
        String fechaInicioMembresia = scanner.nextLine();

        System.out.println("Ingrese la identificacion del membresia");
        int fechaVencimiemtoMembresia = scanner.nextInt();

    }

    public static void registrarActividadDeportiva(ActividadDeportiva actividadDeportiva) {
        System.out.println("Ingrese el nombre de la actividad deportiva");
        String nombreActividadDeportiva = scanner.nextLine();

        System.out.println("Ingrese el apellido de la actividad deportiva");
        String apellidoActividadDeportiva = scanner.nextLine();

        System.out.println("Ingrese la identificacion del usuario para la actividad deportiva");
        int identificacionActividadDeportiva = scanner.nextInt();

        System.out.println("Ingrese los ejercicios de Fuerza de la actividad deportiva");
        String fuerzaActividadDeportiva = scanner.nextLine();

        System.out.println("Ingrese los ejercicios cardiovasculares de la actividad deportiva");
        String cardiovascularesActividadDeportiva = scanner.nextLine();

        System.out.println("Ingrese los tipos de maquinas para la actividad deportiva");
        String maquinaActividadDeportiva = scanner.nextLine();

        System.out.println("Ingrese el telefono del usuario para la actividad deportiva");
        int telefonoActividadDeportiva = scanner.nextInt();
    }

    public  static void registrarClases(Clases classes) {
        System.out.println("Ingrese el nombre del usuario");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese la apellido del usuario");
        String apellido = scanner.nextLine();

        System.out.println("Ingrese la identificacion del usuario");
        int identificacion = scanner.nextInt();

        System.out.println("Ingrese la fecha de ingreso del usuario");
        String fechaIngreso = scanner.nextLine();

        System.out.println("Ingrese la fecha de salida del usuario");
        String fechaSalida = scanner.nextLine();

        System.out.println("Ingrese la hora de ingreso del usuario");
        String horaIngreso = scanner.nextLine();

        System.out.println("Ingrese la hora de salida del usuario");
        String horaSalida = scanner.nextLine();

    }
    public  static void verificarInformacionUsuario(Usuario usuario){
        System.out.println("Ingrese el nombre del usuario");
        String verificarNombreDeUsuario=scanner.nextLine();

        System.out.println("Ingrese el apellido del usuario");
        String verificarCedulaUsuario=scanner.nextLine();

        System.out.println("Ingrese el numero de identificacion del usuario");
        int verificarIdentificacionDeUsuario=scanner.nextInt();

    }

    public  static void verificarClases(Clases clases){
        System.out.println("Ingrese el numero de identificacion del usuario");
        String verificarIdentificacionDeUsuario=scanner.nextLine();

        System.out.println("Ingrese el fecha de inicio de las clases");
        String fechaInicio=scanner.nextLine();

        System.out.println("Ingrese el fecha de finaliza de las clases");
        String fechaFinal=scanner.nextLine();

        System.out.println("Ingrese la hora de inicio de las clases");
        String horaInicio=scanner.nextLine();

        System.out.println("Ingrese la hora de finaliza de las clases");
        String horaFinal=scanner.nextLine();

    }

    public  static void  verificarMembresia(Membresia membresia) {
        System.out.println("Ingrese el tipo de membresia");
        String tipoMembresia = scanner.nextLine();

        System.out.println("Ingrese el estado de membresia");
        String estadoMembresia = scanner.nextLine();

        System.out.println("Ingrese el costo de membresia");
        String costoMembresia = scanner.nextLine();

        System.out.println("Ingrese la fecha de vinculacion de membresia ");
        String fechaInicio = scanner.nextLine();

        System.out.println("Ingrese la fecha de finalizacion de la membresia");
        String fechaFinalizacion = scanner.nextLine();
    }

    public  static void agendarClases(Clases clases) {
        System.out.println("Ingrese el nombre del usuario");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese la apellido del usuario");
        String apellido = scanner.nextLine();

        System.out.println("Ingrese la identificacion del usuario");
        int identificacion = scanner.nextInt();

        System.out.println("Ingrese el fecha de inicio de las clases");
        String fechaInicio = scanner.nextLine();

        System.out.println("Ingrese el fecha de finaliza de las clases");
        String fechaFinalizacionClase = scanner.nextLine();

        System.out.println("Ingrese la hora de inicio de las clases");
        String horaInicio = scanner.nextLine();

        System.out.println("Ingrese la hora de finaliza de las clases");
        String horaDeFinalizacionClase = scanner.nextLine();
    }

    public  static void agendarUsuario(Usuario usuario){
        System.out.println("Ingrese el nombre del usuario");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese la apellido del usuario");
        String apellido = scanner.nextLine();

        System.out.println("Ingrese la identificacion del usuario");
        int identificacion = scanner.nextInt();

        System.out.println("Ingrese el fecha de inicio de las clases");
        String fechaInicio = scanner.nextLine();

        System.out.println("Ingrese el fecha de finaliza de las clases");
        String fechaFinalizacionClase = scanner.nextLine();

        System.out.println("Ingrese la hora de inicio de las clases");
        String horaInicio = scanner.nextLine();

        System.out.println("Ingrese la hora de finaliza de las clases");
        String horaDeFinalizacionClase = scanner.nextLine();

    }

    public  static void agendarEntrenadores(Entrenadores entrenadores){
        System.out.println("Ingrese el nombre del Entrenador");
        String nombreEntrenador = scanner.nextLine();

        System.out.println("Ingrese la apellido del Entrenador");
        String apellidoEntrenador = scanner.nextLine();

        System.out.println("Ingrese la identificacion del Entrenador");
        int identificacionEntrenador = scanner.nextInt();

        System.out.println("Ingrese el fecha de inicio de las clases");
        String fechaInicioClases = scanner.nextLine();

        System.out.println("Ingrese el fecha de finaliza de las clases");
        String fechaFinalizacionClase = scanner.nextLine();

        System.out.println("Ingrese la hora de inicio de las clases");
        String horaInicioClase = scanner.nextLine();

        System.out.println("Ingrese la hora de finaliza de las clases");
        String horaDeFinalizacionClase = scanner.nextLine();

    }

    public  static void agendarActividadDeportiva(ActividadDeportiva actividadDeportiva){
        System.out.println("Ingrese el nombre del usuario para la actividad deportiva");
        String nombreActividadDeportiva = scanner.nextLine();

        System.out.println("Ingrese la identificacion del usuario para la actividad de portiva");
        int identificacionActividadDeportiva = scanner.nextInt();

        System.out.println("Ingrese el fecha de ingreso a la actividad deportiva");
        String fechaIngresoActividadDeportiva = scanner.nextLine();

        System.out.println("Ingrese la fecha de terminacion de la actividad deportiva");
        String fechaTerminacionActividadDeportiva = scanner.nextLine();


    }

    public  static void generarInformacion(Gymuqfit gymuqfit,Usuario usuario,Membresia membresia,Clases clases,ActividadDeportiva actividadDeportiva,Entrenadores entrenadores,Estudiante estudiante,Externos externos,Trabajadoresuq trabajadoresuq,RutinasDeFuerza rutinasDeFuerza,TipoDeEstado tipoDeEstado){


        System.out.println("Ingrese el nombre del usuario");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese la apellido del usuario");
        String apellido = scanner.nextLine();

        System.out.println("Ingrese la identificacion del usuario");
        int identificacion = scanner.nextInt();

        System.out.println("Ingrese el fecha de inicio de las clases");
        String fechaIngreso = scanner.nextLine();

        System.out.println("Ingrese el fecha de finaliza de las clases");
        String fechaDeVencimiento = scanner.nextLine();

        System.out.println("Ingrese el tipo de membresia");
        String tipoMembresia = scanner.nextLine();

        System.out.println("Ingrese el estado de membresia");
        String estadoMembresia = scanner.nextLine();

        System.out.println("Ingrese el costo de membresia");
        double costoMembresia = scanner.nextDouble();

        System.out.println("Ingrese el nombre del entrebnador");
        String nombreEntrenador = scanner.nextLine();


    }


    public static void TipoDeEstado(String mensaje) {
            TipoDeEstado estado = TipoDeEstado.ABIERTO;
            String tipoDeEstado = scanner.nextLine();
            System.out.println("Tipo de Estado:" + estado);
            System.out.println("Mensaje:" + estado.getMensaje());
            System.out.println("Disponible:" + estado.isDisponible());
        }


}