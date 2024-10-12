package Empleados;


public class Empleado {
    private String nombre;
    private String apellidos;
    private String DNI;
    private String direccion;
    private int antiguedad;
    private String telefono;
    private double salario;
    private Empleado supervisor;

    public Empleado(String nombre, String apellidos, String DNI, String direccion, int antiguedad, String telefono, double salario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.direccion = direccion;
        this.setAntiguedad(antiguedad);
        this.telefono = telefono;
        this.salario = salario;
    }

    public void imprimir() {
        System.out.println("Nombre: " + nombre + " " + apellidos + ", DNI: " + DNI + ", Dirección: " + direccion + ", Teléfono: " + telefono + ", Salario: " + salario);
    }

    public void cambiarSupervisor(Empleado supervisor) {
        this.setSupervisor(supervisor);
    }

    public void incrementarSalario(double porcentaje) {
        salario += salario * porcentaje / 100;
    }

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public Empleado getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(Empleado supervisor) {
		this.supervisor = supervisor;
	}
}
