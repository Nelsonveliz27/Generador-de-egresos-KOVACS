package Clases;
public class Egresos extends Proveedor{
    //Atrtibutos de los egresos
    private int numeroEgreso;
    private String sucursal;
    private String fecha;
    private Double total;

    public Egresos (char rut,
                    String nombre,
                    int numeroCuenta,
                    String tipoCuenta,
                    char email,
                    int numeroEgreso,
                    String sucursal,
                    String fecha,
                    Double total)
    {

        super(rut, nombre, numeroCuenta, tipoCuenta, email);
        this.numeroEgreso = numeroEgreso;
        this.fecha = fecha;
        this.total = total;
        this.sucursal =sucursal;
    }
    public Egresos (){}
    public int getNumeroEgreso (){return numeroEgreso;}
    public String getSucursal () {return sucursal;}
    public String getFecha () {return fecha;}
    public Double getTotal () {return total;}
}
