/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 

/**
 *
 * @author JEFP
 */
public abstract class ComponenteElectronico extends DispositivoElectronico {
    
    public ComponenteElectronico(String fabricante, String marca, String nombre, double costo) {
        super(fabricante, marca, nombre, costo);
    }
    public boolean esParteDe(Object instancia){
        return instancia instanceof ComponenteElectronico;
    }

    @Override
    public String toString() {
        return "ComponenteElectronico:"+ super.toString();
    }
    
}
