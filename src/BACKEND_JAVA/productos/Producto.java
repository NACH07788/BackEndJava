package BACKEND_JAVA;

public class Producto {
    private
        int id;
        String nombre;
        Double precio;
        int stock;

    public producto(){}
    public producto(int id, String nom, Double precio, int stock){
        this.id=id;
        this.nombre=nom;
        this.precio=precio;
        this.stock=stock;
    }

    //Setters

    public void setId(int id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    public void setStock(int stock) {
        this.stock = stock;

    //Getters
    public int getId() {
        return this.id;
    }
    public String getNombre() {
        return this.nombre;
    }
    public Double getPrecio() {
        return this.precio;
    }
    public int getStock() {
        return this.stock;
    }
    //
    @Override
    public String toString(){
        return " Nombre:" + this.nombre + " Precio: "+ this.precio + " "
    }
}
