package Empleados;


public class Vendedor extends Empleado {
    private String coche;
    private String movil;
    private String areaDeVenta;
    private double porcentajeComision;

    public Vendedor(String nombre, String apellidos, String DNI, String direccion, int antiguedad, String telefono, double salario, String coche, String movil, String areaDeVenta, double porcentajeComision) {
        super(nombre, apellidos, DNI, direccion, antiguedad, telefono, salario);
        this.coche = coche;
        this.movil = movil;
        this.areaDeVenta = areaDeVenta;
        this.setPorcentajeComision(porcentajeComision);
    }

    @Override
    public void incrementarSalario(double porcentaje) {
        super.incrementarSalario(10);  
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Puesto: Vendedor, Coche: " + coche + ", Móvil: " + movil + ", Área de Venta: " + areaDeVenta);
    }

    public void darAltaCliente() {
        System.out.println("Cliente dado de alta.");
    }

    public void darBajaCliente() {
        System.out.println("Cliente dado de baja.");
    }

	public double getPorcentajeComision() {
		return porcentajeComision;
	}

	public void setPorcentajeComision(double porcentajeComision) {
		this.porcentajeComision = porcentajeComision;
	}
}

