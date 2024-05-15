/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 

/**
 *
 * @author JEFP
 */
public class Microprocesador extends ComponenteElectronico {
    protected int cacheRAM;
    protected long velocidadHz;

    public Microprocesador(String fabricante, String marca, String nombre, double costo) {
        super(fabricante, marca, nombre, costo);
        this.cacheRAM=123;
        this.velocidadHz=123;
    }

    @Override
    public String toString() {
        return "Microprocesador{" + super.toString()+"cacheRAM=" + cacheRAM + ", velocidadRAM=" + velocidadHz + '}';
    }

    

    public int getCacheRAM() {
        return cacheRAM;
    }

    public long getVelocidadHz() {
        return velocidadHz;
    }
    
}
