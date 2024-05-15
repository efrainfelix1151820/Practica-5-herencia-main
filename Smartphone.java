/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 

/**
 *
 * @author JEFP
 */
public class Smartphone extends Computadora {
    private Sensor sensorDeHuella;
    private Pantalla PantallaSmartphone;
    
    public Smartphone(String fabricante, String numeroSerie, String marca, String nombre, double costo,Pantalla newPantallaSmartphone, Sensor newSensorHuella,int newRamMB,Microprocesador cpu) {
        super(fabricante, numeroSerie, marca, nombre, costo,newRamMB,cpu); 
        this.PantallaSmartphone = newPantallaSmartphone;
        this.sensorDeHuella = newSensorHuella;
        
        super.componentes.add(sensorDeHuella);
        super.componentes.add(PantallaSmartphone);
    }

    @Override
    public String toString() {
        return "Smartphone{"+ super.toString()+ "sensorDeHuella=" + sensorDeHuella + ", PantallaSmartphone=" + PantallaSmartphone + '}';
    }

    public Sensor getSensorDeHuella() {
        return sensorDeHuella;
    }

    public Pantalla getPantallaSmartphone() {
        return PantallaSmartphone;
    }
    
}
