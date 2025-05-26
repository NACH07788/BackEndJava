package BACKEND_JAVA.menu;
import BACKEND_JAVA.productos.*;
import BACKEND_JAVA.services.*;

import java.util.Scanner;

public class MenuPrincipal {
    public MenuPrincipal(){
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            System.out.print("\nElija una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    agregarProducto();
                    break;
                case 2:
                    listarProductos();
                    break;
                case 3:
                    buscarActualizarProducto();
                    break;
                case 4:
                    eliminarProducto();
                    break;
                case 5:
                    crearPedido();
                    break;
                case 6:
                    listarPedidos();
                    break;
                case 7:
                    System.out.println("Saliendo del sistema. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }

        } while (opcion != 6);

        scanner.close();
    }
    public static void mostrarMenu() {
        System.out.println("\n===================================");
        System.out.println("SISTEMA DE GESTIÓN - TECHLAB");
        System.out.println("===================================");
        System.out.println("1) Agregar producto");
        System.out.println("2) Listar productos");
        System.out.println("3) Buscar/Actualizar producto");
        System.out.println("4) Eliminar producto");
        System.out.println("5) Crear un pedido");
        System.out.println("6) Listar pedidos");
        System.out.println("7) Salir");
    }
    public static void agregarProducto() {
        //Acá tengo que armar una lista de productos
        //Y
        System.out.println("Función 'Agregar producto' aún no implementada.");
    }

    public static void listarProductos() {
        System.out.println("Función 'Listar productos' aún no implementada.");
    }

    public static void buscarActualizarProducto() {
        System.out.println("Función 'Buscar/Actualizar producto' aún no implementada.");
    }

    public static void eliminarProducto() {
        System.out.println("Función 'Eliminar producto' aún no implementada.");
    }

    public static void crearPedido() {
        System.out.println("Función 'Crear un pedido' aún no implementada.");
    }

    public static void listarPedidos() {
        System.out.println("Función 'Listar pedidos' aún no implementada.");
    }
    }




