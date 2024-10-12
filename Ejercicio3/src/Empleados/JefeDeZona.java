package Empleados;

public class JefeDeZona extends Empleado {
    private String despacho;
    private Secretario Secretario;
    private Vendedor[] Vendedores;
    private String coche;

    public JefeDeZona(String nombre, String apellidos, String DNI, String direccion, int antiguedad, String telefono, double salario, String despacho, String coche) {
        super(nombre, apellidos, DNI, direccion, antiguedad, telefono, salario);
        this.despacho = despacho;
        this.coche = coche;
        this.setVendedores(new Vendedor[10]);  
    }

    @Override
    public void incrementarSalario(double porcentaje) {
        super.incrementarSalario(20); 
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Puesto: Jefe de Zona, Despacho: " + despacho + ", Coche: " + coche);
    }

    public void cambiarSecretario(Secretario secretario) {
        this.setSecretario(secretario);
    }

    public void darAltaVendedor(Vendedor vendedor) {
      
    }

    public void darBajaVendedor(Vendedor vendedor) {
       
    }

	public Vendedor[] getVendedores() {
		return Vendedores;
	}

	public void setVendedores(Vendedor[] vendedores) {
		Vendedores = vendedores;
	}

	public Secretario getSecretario() {
		return Secretario;
	}

	public void setSecretario(Secretario secretario) {
		Secretario = secretario;
	}
}
