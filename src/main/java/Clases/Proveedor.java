package Clases;

public class Proveedor {
    //Atributos
    private char rut;
    private String nombre;
    private int numeroCuenta;
    private String tipoCuenta;
    private char email;

    //Constructores lleno
    public Proveedor(char rut, String nombre, int numeroCuenta, String tipoCuenta, char email) {
        this.rut = rut;
        this.nombre = nombre;
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.email = email;

    }

    //contructor vacion para cuando necesite una variable de este tipo.
    public Proveedor() {
    }
    //Propiedades del contructor - Traera los valores que tengan las variables.


    public char getRut() {return rut;}
    public String getNombre ( ) {return nombre;}
    public int getNumeroCuenta () {return numeroCuenta;}
    public String getTipoCuenta () {return  tipoCuenta;}
    public char getEmail () {return email;}
}
