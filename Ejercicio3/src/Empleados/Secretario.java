package Empleados;


public class Secretario extends Empleado {
    private String despacho;
    private String fax;

    public Secretario(String nombre, String apellidos, String DNI, String direccion, int antiguedad, String telefono, double salario, String despacho, String fax) {
        super(nombre, apellidos, DNI, direccion, antiguedad, telefono, salario);
        this.despacho = despacho;
        this.fax = fax;
    }

    @Override
    public void incrementarSalario(double porcentaje) {
        super.incrementarSalario(5); 
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Puesto: Secretario, Despacho: " + despacho + ", Fax: " + fax);
    }
}
