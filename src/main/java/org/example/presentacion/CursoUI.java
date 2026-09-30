package org.example.presentacion;
import org.example.business.Curso;
import org.example.business.CursoService;
import java.util.Scanner;

public class CursoUI {
    private static final CursoService service = new CursoService();

    public static void mostrarMenu(Scanner sc) {
        int opcion;
        do {
            System.out.println("\n=== GESTIÓN DE CURSOS ===");
            System.out.println("1. Registrar");
            System.out.println("2. Listar");
            System.out.println("3. Actualizar");
            System.out.println("4. Eliminar");
            System.out.println("5. Regresar");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("ID del curso: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nombre del curso: ");
                    String nombre = sc.nextLine();

                    System.out.print("Créditos: ");
                    int creditos = sc.nextInt();
                    sc.nextLine();

                    service.registrar(new Curso(id, nombre, creditos));
                    System.out.println("Curso registrado (si pasó las validaciones).");
                    break;

                case 2:
                    System.out.println("\n--- Lista de Cursos ---");
                    service.listar().forEach(c ->
                            System.out.println("ID: " + c.getId() + " - Nombre: " + c.getNombre() + " - Créditos: " + c.getCreditos())
                    );
                    break;

                case 3:
                    System.out.print("Ingrese el ID del curso a actualizar: ");
                    int idActualizar = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nuevo Nombre: ");
                    String nuevoNombre = sc.nextLine();

                    System.out.print("Nuevos Créditos: ");
                    int nuevosCreditos = sc.nextInt();
                    sc.nextLine();

                    service.actualizar(new Curso(idActualizar, nuevoNombre, nuevosCreditos));
                    System.out.println("Curso actualizado.");
                    break;

                case 4:
                    System.out.print("Ingrese el ID del curso a eliminar: ");
                    int idEliminar = sc.nextInt();
                    sc.nextLine();

                    service.eliminar(idEliminar);
                    System.out.println("Curso eliminado.");
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