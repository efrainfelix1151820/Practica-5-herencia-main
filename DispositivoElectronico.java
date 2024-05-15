/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 

import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author JEFP
 */
public abstract class DispositivoElectronico {
    private boolean tipo;
    protected String fabricante;
    protected String numeroSerie;
    protected String marca;
    protected String nombre;
    protected double costo;
    protected ArrayList <ComponenteElectronico> componentes;
    
    public DispositivoElectronico(String fabricante, String numeroSerie, String marca, String nombre, double costo) {
        this.fabricante = fabricante;
        this.numeroSerie = numeroSerie;
        this.marca = marca;
        this.nombre = nombre;
        this.costo = costo;
        this.componentes = new ArrayList<>();
        this.tipo =false;
    }
    public DispositivoElectronico(String fabricante , String marca,String nombre, double costo){
        this.fabricante = fabricante;
        this.marca = marca;
        this.nombre = nombre;
        this.costo = costo;
        this.tipo =true;
    }

    @Override
    public String toString() {
        if(tipo){
        return "DispositivoElectronico{" + "fabricante=" + fabricante + ", numeroSerie=" + numeroSerie + ", marca=" + marca + ", nombre=" + nombre + ", costo=" + costo + ", componentes=" + componentes + '}';
        }else{
            return "DispositivoEectronico: fabricante: "+fabricante +" marca:"+marca+ " nombre:"+ nombre+" costo:"+costo;
        }
    }
    
    protected void setCosto(double costo) {
        this.costo = costo;
    }

    protected void setComponentes(ArrayList<ComponenteElectronico> componentes) {
        this.componentes = componentes;
    }

    protected double getCosto() {
        return costo;
    }

    protected ArrayList<ComponenteElectronico> getComponentes() {
        return componentes;
    }
    protected void agregarComponenetes(ComponenteElectronico ce){
        componentes.add(ce);
    } 
    protected void removerComponentes(ComponenteElectronico ce){
        componentes.remove(ce);
    }
    
    
}
