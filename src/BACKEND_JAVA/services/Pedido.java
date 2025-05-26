package BACKEND_JAVA.services;

import BACKEND_JAVA.productos.*;

import java.util.ArrayList;

public class Pedido {
    private
        int id;
        ArrayList <Producto> Productos = new ArrayList <>();
        Pedido(){}
    @Override
    public String toString(){
            return "ID: "+this.id + " Lista de Productos: " + this.Productos;
    }
}
