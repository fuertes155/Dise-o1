package Simulador;


public class Main {
    public static void main(String[] args) {
   
        Coche coche = new Coche("ABC123", 4);
        coche.acelerar(60);
        System.out.println(coche.toString());

      
        Camion camion = new Camion("XYZ789");
        camion.acelerar(50);
        System.out.println(camion.toString());

       
        Remolque remolque = new Remolque(2000);
        camion.ponRemolque(remolque);
        camion.acelerar(60); 
        System.out.println(camion.toString());

        
        camion.quitaRemolque();
        camion.acelerar(30); 
        System.out.println(camion.toString());
    }
}