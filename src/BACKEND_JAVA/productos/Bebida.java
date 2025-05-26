package BACKEND_JAVA.productos;
import java.time.LocalDate;

public class Bebida extends Producto {
    private
    double mililitros;
    LocalDate fecha_vencimiento;
    //Uso el try catch en constructor o al recibir el dato...
    Bebida (double ml, String fecha_venc){
        this.mililitros=ml;
        verificar_fecha_venc(fecha_venc);
        this.fecha_vencimiento = LocalDate.parse(fecha_venc);
    }
    String verficar_fecha_venc(){

    }

}
