/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 

/**
 *
 * @author JEFP
 */
public class Pantalla extends ComponenteElectronico {
    protected int resolucionX;
    protected int resolucionY;

    public Pantalla(String fabricante, String marca, String nombre, double costo) {
        super(fabricante, marca, nombre, costo);
        this.resolucionX = 1280;
        this.resolucionY=720;
    }

    @Override
    public String toString() {
        return "Pantalla{"+super.toString() + "resolucionX=" + resolucionX + ", resolucionY=" + resolucionY + '}';
    }

    
    
    public int getResolucionX() {
        return resolucionX;
    }

    public int getResolucionY() {
        return resolucionY;
    }
    
}
