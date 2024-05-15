/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 

/**
 *
 * @author JEFP
 */
public class Sensor extends ComponenteElectronico {
    private String tipo;
    private String unidadMedia;
    private int valor;  

    public Sensor(String fabricante, String marca, String nombre, double costo, String newTipo, String newUMedia, int newValor) {
        super(fabricante, marca, nombre, costo);
        this.tipo=newTipo;
        this.unidadMedia = newUMedia;
        this.valor=newValor;
    }

    @Override
    public String toString() {
        return "Sensor{"+super.toString() + "tipo=" + tipo + ", unidadMedia=" + unidadMedia + ", valor=" + valor + '}';
    }

   

    public String getTipo() {
        return tipo;
    }

    public String getUnidadMedia() {
        return unidadMedia;
    }

    public int getValor() {
        return valor;
    }
    
}
