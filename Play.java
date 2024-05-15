/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 
import java.awt.*;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


/**
 *
 * @author JEFP
 */
public class Play {
    private Pantalla displayUI;
    private Smartphone SmatphoneUI;
    private Television TelevisionUI;
    private Microprocesador CPU_UI;
    private Sensor sensorUI;
    private Computadora PC_UI;
    /** 
     * en la clase Play contiene el codigo que genera los Arraylist 
       de TVs y de Smartphones, tambien se incluye el codigo que genera
       el frame con las imagenes junto con los objetos que se crean para
       mostrar el contenido de ellas en cuando se presionan en la imagen
    **/

    public Play(ArrayList listaDeSmartphones,ArrayList ListaDeTVs) {
        ListaDeTVs = new ArrayList<>();
        listaDeSmartphones = new ArrayList<>();
        listaDeSmartphones(listaDeSmartphones);
        listaDeTVs(ListaDeTVs);
        viewElementos(listaDeSmartphones,ListaDeTVs);
        CreateProducts();
        
    }
    public void viewElementos(ArrayList listaDeSmartphones,ArrayList listaDeTVs){ //aqui se muestra el contenido de los Arraylist
        System.out.println("elementos disponibles (smartphones):");
        for(int k=0;k<listaDeSmartphones.size();k++){
            System.out.println(listaDeSmartphones.get(k).toString());
        }
        System.out.println("elementos disponibles(TV):");
        for(int k=0;k<listaDeTVs.size();k++){
           System.out.println(listaDeTVs.get(k).toString());
       }
    }
    //aqui se muestra como se crean los objetos Television para ser agregados al ArrayList
    public void listaDeTVs(ArrayList listaDeTVs){ 
        String fabricante1 = "Samsung";
        String fabricante2 = "TCL";
        String numeroSerie1 = "1XXTVXX1";
        String numeroSerie2 = "1XXTVXX2";
        String marca1 = "crystal UHD";
        String marca2 = "QLED";
        String nombre1 = "TU690T";
        String nombre2 = "65S555";
        Pantalla PantallaTelevisionUI = new Pantalla("Samsung","IPS-LED", "VTQ432", 200);
        Pantalla PantallaTV2 = new Pantalla("Samsung","OLED", "VTQ234",50);
        Television TelevisionUI = new Television(fabricante1, numeroSerie1,marca1,nombre1,450.0,PantallaTelevisionUI);
        Television TV2 = new Television(fabricante2, numeroSerie2,marca2 ,nombre2,550.0,PantallaTV2);
        listaDeTVs.add(TelevisionUI);
        listaDeTVs.add(TV2);
    }
    //aqui se muestra como se crean los objetos Smartphone para ser agregados al ArrayList
   public void listaDeSmartphones(ArrayList listaDeSmartphones){
        
        String fabricante1 = "Apple";
        String fabricante2 = "Samsung";
        String numeroSerie1 = "1XXXXXX1";
        String numeroSerie2 = "1XXXXXX2";
        String marca1 = "Iphone";
        String marca2 = "Galaxy";
        String nombre1 = "11 Pro";
        String nombre2 = "S22 Ultra";
        Microprocesador cpu1 = new Microprocesador("Apple","Apple A-series", "A13",4096);
        Microprocesador cpu2 = new Microprocesador("Samsung", "Exynos", "7805",33);
        Pantalla PantallaSmartphone1 = new Pantalla("Samsung","OLED", "VTQ432", 60);
        Pantalla PantallaSmartphone2 = new Pantalla("Samsung","OLED", "VTQ234",50);
        Sensor sensorHuellaSmartphone1 = new Sensor("Skyworks","sky5","SKY58271-19",25.0, "Proximidad","mm",123);
        Sensor sensorHuellaSmartphone2 = new Sensor("Skyworks","sky5","SKY58276-17",35.0, "Proximidad","mm",123);
        Smartphone smartphone1 = new Smartphone(fabricante1,numeroSerie1,marca1,nombre1,1599.0,PantallaSmartphone1,sensorHuellaSmartphone1,4096,cpu1);
        Smartphone smartphone2 = new Smartphone(fabricante2,numeroSerie2,marca2,nombre2,1299.0,PantallaSmartphone2,sensorHuellaSmartphone2,3072, cpu2);
        listaDeSmartphones.add(smartphone1);
        listaDeSmartphones.add(smartphone2);
    } 
    //aqui se muestra como se crean los objetos de todas las clases para ser usadas en el metodo ImagenCanvas
   public void CreateProducts(){
       Pantalla PantallaSmartphone2 = new Pantalla("Samsung","OLED", "VTQ234",50);
       Sensor sensorHuellaSmartphone2 = new Sensor("Skyworks","sky5","SKY58276-17",35.0, "Proximidad","mm",123);
       Microprocesador cpu2 = new Microprocesador("Samsung", "Exynos", "7805",33);
       this.CPU_UI= new Microprocesador("intel","Core","i7-1165G7",469.0);
       Pantalla PantallaTelevisionUI = new Pantalla("Samsung","IPS-LED", "VTQ432", 200);
       this.TelevisionUI=new Television("Samsung","1XXTVXX1","Crystal UHD","TU690T",450.0,PantallaTelevisionUI);
       this.PC_UI= new Computadora("Microsoft","1XXPC_UIXX1","Surface","Surface Laptop Go",500.0,4096,CPU_UI);
       this.displayUI=new Pantalla("Samsung","LCD","4X32LD",45.0);
       this.sensorUI = new Sensor("Sony","Exmor","4XD3R3-2",5.0,"Fotografico","in",45);
       this.SmatphoneUI = new Smartphone("Samsung","1XXXXXX1","Galaxy","S22 Ultra",1299.0,PantallaSmartphone2,sensorHuellaSmartphone2,3072,cpu2);
        
   }
   //aqui se toman las imagenes y se colocan en un Frame y se asignan las acciones cuando se hace un clic sobre ellas
   public void ImagenCanvas(){
       
       // Rutas de las imágenes
        String rutaImagen1 = "samsung_TV.jpg";
        String rutaImagen2 = "display.jpg";
        String rutaImagen3 = "iphone11pro.jpg";
        String rutaImagen4 = "sensor.png";
        String rutaImagen5 = "laptop.jpg";
        String rutaImagen6 = "Intel.jpg";

        // Crear las instancias de las imágenes
        ImageIcon imagenIcono1 = new ImageIcon(rutaImagen1);
        ImageIcon imagenIcono2 = new ImageIcon(rutaImagen2);
        ImageIcon imagenIcono3 = new ImageIcon(rutaImagen3);
        ImageIcon imagenIcono4 = new ImageIcon(rutaImagen4);
        ImageIcon imagenIcono5 = new ImageIcon(rutaImagen5);
        ImageIcon imagenIcono6 = new ImageIcon(rutaImagen6);

        // Obtener la imagen subyacente y redimensionarla
        Image imagen1 = imagenIcono1.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        Image imagen2 = imagenIcono2.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        Image imagen3 = imagenIcono3.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        Image imagen4 = imagenIcono4.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        Image imagen5 = imagenIcono5.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        Image imagen6 = imagenIcono6.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);

        // Crear etiquetas para mostrar las imágenes redimensionadas
        JLabel etiquetaImagen1 = new JLabel(new ImageIcon(imagen1));
        JLabel etiquetaImagen2 = new JLabel(new ImageIcon(imagen2));
        JLabel etiquetaImagen3 = new JLabel(new ImageIcon(imagen3));
        JLabel etiquetaImagen4 = new JLabel(new ImageIcon(imagen4));
        JLabel etiquetaImagen5 = new JLabel(new ImageIcon(imagen5));
        JLabel etiquetaImagen6 = new JLabel(new ImageIcon(imagen6));

        // Agregar un MouseListener a cada etiqueta de imagen
        etiquetaImagen1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Se ha hecho clic en la imagen 1");
                System.out.println(TelevisionUI.toString());
            }
        });

        etiquetaImagen2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Se ha hecho clic en la imagen 2");
                System.out.println(displayUI.toString());
                
            }
        });

        etiquetaImagen3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Se ha hecho clic en la imagen 3");
                System.out.println( SmatphoneUI.toString());
               
            }
        });
       
          etiquetaImagen4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Se ha hecho clic en la imagen 4");
                System.out.println(sensorUI.toString());
            }
        });
           etiquetaImagen5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Se ha hecho clic en la imagen 5");
                System.out.println(PC_UI.toString());
            }
        });
            etiquetaImagen6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Se ha hecho clic en la imagen 6");
                System.out.println(CPU_UI.toString());
            }
        });

        // Crear una ventana JFrame
        JFrame ventana = new JFrame();

        // Configurar el diseño de la ventana (por ejemplo, GridLayout)
         ventana.setLayout(new GridLayout(1, 6)); // Ajusta el número de columnas según tus necesidades

        // Agregar las etiquetas de las imágenes a la ventana
        ventana.add(etiquetaImagen1);
        ventana.add(etiquetaImagen2);
        ventana.add(etiquetaImagen3);
        ventana.add(etiquetaImagen4);
        ventana.add(etiquetaImagen5);
        ventana.add(etiquetaImagen6);
        

        // Configurar la operación por defecto al cerrar la ventana
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Mostrar la ventana
        ventana.revalidate();
        ventana.pack();
        ventana.setVisible(true);
    }
   }

