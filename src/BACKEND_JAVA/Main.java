package BACKEND_JAVA;
import java.util.Scanner;
import BACKEND_JAVA.menu.MenuPrincipal;
import BACKEND_JAVA.productos.StockProductos;

public class Main {

    public static void main(String[] args) {
        StockProductos stock = new StockProductos();
        MenuPrincipal menuPrincipal= new MenuPrincipal(stock);
    }
}



