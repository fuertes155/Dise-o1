package Empleados;



public class Main {
    public static void main(String[] args) {
      
        Empleado empleado1 = new Empleado("Samuel", "Molina", "1086578123", "Calle 1", 5, "3158598604", 15000000);
        Secretario secretario1 = new Secretario("Luisa", "Lopez", "13066578", "Calle 2", 10, "3182273725", 1800000, "Despacho 1", "Fax 5555");
        Vendedor vendedor1 = new Vendedor("Gabriel", "Garcia", "13065633", "Calle 3", 3, "3173648171", 200000, "NNN-53H", "666-88", "Norte", 5);
        JefeDeZona jefeZona1 = new JefeDeZona("Laura", "Martinez", "13899665", "Calle 4", 8, "8549222", 2500000, "Despacho 2", "XYZ-789");

        System.out.println("Información de los empleados:");
        empleado1.imprimir();
        secretario1.imprimir();
        vendedor1.imprimir();
        jefeZona1.imprimir();

       
        System.out.println("\nIncrementando salarios...");
        secretario1.incrementarSalario(5);
        vendedor1.incrementarSalario(10);   
        jefeZona1.incrementarSalario(20); 

    
        System.out.println("\nDespués de los aumentos salariales:");
        secretario1.imprimir();
        vendedor1.imprimir();
        jefeZona1.imprimir();

        
        secretario1.cambiarSupervisor(empleado1);
        jefeZona1.cambiarSecretario(secretario1);
        
       
        vendedor1.darAltaCliente();
        vendedor1.darBajaCliente();

        
        jefeZona1.darAltaVendedor(vendedor1);
    }
}
