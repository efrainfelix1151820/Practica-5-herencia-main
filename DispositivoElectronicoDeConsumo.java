/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 

/**
 *
 * @author JEFP
 */
public abstract class DispositivoElectronicoDeConsumo extends DispositivoElectronico{
    protected boolean encendido;

    public DispositivoElectronicoDeConsumo(String fabricante, String numeroSerie, String marca, String nombre, double costo) {
        super(fabricante, numeroSerie, marca, nombre, costo);
    }
    protected void encender(){
        encendido=true;
    }
    protected void apagar(){
        encendido=false;
    }
    protected boolean isEncendido(){
        return encendido;
    }

    @Override
    public String toString() {
        return "DispositivoElectronicoDeConsumo{"+super.toString() + "encendido=" + encendido + '}';
    }
    
}
