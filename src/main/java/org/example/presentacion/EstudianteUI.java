package org.example.presentacion;
import org.example.business.Estudiante;
import org.example.business.EstudianteService;
import java.util.Scanner;


public class EstudianteUI {
    private static final EstudianteService service = new EstudianteService();
    public static void  mostrarMenu(Scanner sc){
        int opcion;
        do{

            System.out.println("\n=== GESTIÓN ESTUDIANTE ===");
            System.out.println("1. Registrar");
            System.out.println("2. Listar");
            System.out.println("3. Actualizar");
            System.out.println("4. Eliminar");
            System.out.println("5. Regresar");
            System.out.print("Seleccione una opción: ");

            opcion=sc.nextInt();
            sc.nextLine();
            switch (opcion){
            case 1:
                System.out.print ("Id:");
                int id= sc.nextInt();
                sc.nextLine();
                System.out.print ("Nombre:");
                String nombre=sc.nextLine();
                sc.nextLine();
                System.out.print ("Correo:");
                service.registrar(new Estudiante(id,nombre,correo));
                System.out.println("Estudiante Registrado");
                sc.nextLine();

                break;
            case 2:
                service.listar().forEach(estudiante e->
                        System.out.println(e.getId()+ "" + e.getNombre()+""+ e.getCorreo()+"\n"));
                break;
            case 3:
                break;
            case 4:
                break;

            }
    } while (opcion!=0);

    }
