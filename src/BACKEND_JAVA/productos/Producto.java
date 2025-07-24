package BACKEND_JAVA.productos;

public class Producto {
    private
        int id;
        String nombre;
        Double precio;
        int stock;

    public Producto(){}
    public Producto(int id, String nom, Double precio, int stock){
        this.id=id;
        this.nombre=nom;
        this.precio=precio;
        this.stock=stock;
    }

    //Setters

    public void setId(int id) {
        this.id = id;
    }
    public void setNom(String nombre) {
        this.nombre = nombre;
    }
    public void setPre(Double precio) {
        this.precio = precio;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    //Getters
    public int getId() {
        return this.id;
    }
    public String getNom() {
        return this.nombre;
    }
    public Double getPre() {
        return this.precio;
    }
    public int getStock() {
        return this.stock;
    }
    //
    @Override
    public String toString(){
        return "ID: "+this.id + " Nombre:" + this.nombre + " Precio: "+ this.precio + "Stock: " + this.stock;
    }
}
