/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 

/**
 *
 * @author JEFP
 */
public class Computadora extends DispositivoElectronicoDeConsumo {
    private Microprocesador cpu;
    private long ramMB;
    public Computadora(String fabricante, String numeroSerie, String marca, String nombre, double costo,int newRamMB,Microprocesador cpu) {
        super(fabricante, numeroSerie, marca, nombre, costo);
        this.cpu = cpu;
        this.ramMB  = newRamMB;
    }

    @Override
    public String toString() {
        return "Computadora{"+super.toString() + "cpu=" + cpu + ", ramMB=" + ramMB + '}';
    }

    public void setCpu(Microprocesador cpu) {
        this.cpu = cpu;
    }

    public void setRamMB(long ramMB) {
        this.ramMB = ramMB;
    }

    public Microprocesador getCpu() {
        return cpu;
    }

    public long getRamMB() {
        return ramMB;
    }
    
}
