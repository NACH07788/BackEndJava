package BACKEND_JAVA.productos;

import java.util.ArrayList;
import java.util.Scanner;

public class StockProductos {
    private ArrayList <Producto> Productos = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public void agregarProducto(Producto producto) {
        Productos.add(producto);
    }
    public void listarProductos(){
        for(Producto p: Productos){
            System.out.println(p);
        }
    }
    public void eliminarProducto(Producto producto){
        Productos.remove(producto);
    }
    public void buscarProducto() {
        System.out.print("Ingrese el ID (número) o nombre del producto: ");
        String entrada = scanner.nextLine();

        Producto productoEncontrado = null;

        try {
            int idBuscado = Integer.parseInt(entrada);
            // Buscar por ID
            for (Producto p : productos) {
                if (p.getId() == idBuscado) {
                    productoEncontrado = p;
                    break;
                }
            }
        } catch (NumberFormatException e) {
            // Buscar por nombre (case-insensitive)
            for (Producto p : productos) {
                if (p.getNombre().equalsIgnoreCase(entrada)) {
                    productoEncontrado = p;
                    break;
                }
            }
        }

        if (productoEncontrado != null) {
            System.out.println("\nProducto encontrado:");
            System.out.println(productoEncontrado);

            System.out.println("\n¿Desea modificar este producto? (s/n): ");
            String confirmacion = scanner.nextLine();

            if (confirmacion.equalsIgnoreCase("s")) {
                modificarProducto(productoEncontrado);
            }
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    private void modificarProducto(Producto producto) {
        System.out.print("Nuevo nombre (" + producto.getNombre() + "): ");
        String nuevoNombre = scanner.nextLine();
        if (!nuevoNombre.isBlank()) {
            producto.setNombre(nuevoNombre);
        }

        System.out.print("Nuevo precio (" + producto.getPrecio() + "): ");
        String nuevoPrecio = scanner.nextLine();
        if (!nuevoPrecio.isBlank()) {
            try {
                double precio = Double.parseDouble(nuevoPrecio);
                producto.setPrecio(precio);
            } catch (NumberFormatException e) {
                System.out.println("Precio inválido. Se mantiene el anterior.");
            }
        }

        System.out.println("Producto actualizado:");
        System.out.println(producto);
    }

}
