package BACKEND_JAVA.menu;
import BACKEND_JAVA.productos.*;
import BACKEND_JAVA.services.*;

import java.util.Scanner;

public class MenuPrincipal {
    private static Scanner scanner;

    public MenuPrincipal(StockProductos stock){
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            System.out.print("\nElija una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    agregarProducto(stock);
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
    public static void agregarProducto(StockProductos stock) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Menu para agregar un producto:");
        System.out.println("Ingrese el nombre del producto: ");
        String nombre = entrada.nextLine();
        System.out.printf("Ingrese el precio de %s: ", nombre);
        double precio = entrada.nextDouble();
        System.out.printf("Ingrese el stock de %s: ", nombre);
        int cantidad = entrada.nextInt();

        int min = 0;
        int max = 1000;
        int randomNumber;

        // Bucle para asegurarnos de que el ID no se repita
        do {
            randomNumber = (int) (Math.random() * (max - min + 1)) + min;
        } while (stock.buscarProductoPorId(randomNumber) != null);

        Producto producto = new Producto(randomNumber, nombre, precio, cantidad);
        stock.agregarProducto(producto);
        System.out.println("☣ Producto cargado exitosamente! ☣");
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




