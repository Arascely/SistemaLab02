package org.example.presentacion;
import org.example.business.Estudiante;
import org.example.business.EstudianteService;
import java.util.Scanner;

public class EstudianteUI {
    private static final EstudianteService service = new EstudianteService();

    public static void mostrarMenu(Scanner sc){
        int opcion;
        do {
            System.out.println("\n=== GESTIÓN ESTUDIANTE ===");
            System.out.println("1. Registrar");
            System.out.println("2. Listar");
            System.out.println("3. Actualizar");
            System.out.println("4. Eliminar");
            System.out.println("5. Regresar");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Id: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Correo: ");
                    String correo = sc.nextLine();

                    service.registrar(new Estudiante(id, nombre, correo));
                    System.out.println("Estudiante Registrado correctamente.");
                    break;

                case 2:
                    System.out.println("\n--- Lista de Estudiantes ---");
                    // Mostramos la lista iterando sobre los elementos
                    service.listar().forEach(e ->
                            System.out.println("ID: " + e.getId() + " - Nombre: " + e.getNombre() + " - Correo: " + e.getCorreo())
                    );
                    break;

                case 3:
                    System.out.print("Ingrese el ID del estudiante a actualizar: ");
                    int idActualizar = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nuevo Nombre: ");
                    String nuevoNombre = sc.nextLine();

                    System.out.print("Nuevo Correo: ");
                    String nuevoCorreo = sc.nextLine();

                    service.actualizar(new Estudiante(idActualizar, nuevoNombre, nuevoCorreo));
                    System.out.println("Estudiante actualizado.");
                    break;

                case 4:
                    System.out.print("Ingrese el ID del estudiante a eliminar: ");
                    int idEliminar = sc.nextInt();
                    sc.nextLine();

                    service.eliminar(idEliminar);
                    System.out.println("Estudiante eliminado.");
                    break;

                case 5:
                    System.out.println("Regresando al menú principal...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 5);
    }
}