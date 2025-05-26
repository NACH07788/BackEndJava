package BACKEND_JAVA;

import java.util.ArrayList;

public class Pedido {
    private
        int id;
        ArrayList <Producto> Productos = New ArrayList <Producto>();
        Pedido(){}
    @Override
    public String toString(){
            return "ID: "this.id+ " "+ "Lista de Productos: "+this.Productos;
    }
}
