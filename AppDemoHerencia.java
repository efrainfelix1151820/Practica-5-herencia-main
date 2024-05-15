/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

 

import java.util.ArrayList;

/**
 *
 * @author JEFP
 */
public class AppDemoHerencia {
    static private ArrayList <Smartphone> listaDeSmartphones;
    static private ArrayList <Television> listaDeTVs;
    
    
    public static void main(String[] args) {
        AppDemoHerencia p6 = new AppDemoHerencia();
        
        Play play = new Play(listaDeSmartphones,listaDeTVs);
        play.ImagenCanvas();
    }
}
