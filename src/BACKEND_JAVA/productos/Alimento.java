package BACKEND_JAVA.productos;

import java.util.Date;

public class Alimento extends Producto{
    private
    double peso;
    Date fecha_vencimiento;
    Alimento (double peso, Date fec_venc){
        this.peso=peso;
        this.fecha_vencimiento=fec_venc;
    }
}
