package Simulador;

public abstract class Vehiculo {
    private String matricula;
    private int velocidad;

    // Constructor
    public Vehiculo(String matricula) {
        this.matricula = matricula;
        this.velocidad = 0; 
    }
 
    public void acelerar(int incremento) {
        velocidad += incremento;
    }
 
    @Override
    public String toString() {
        return "Matrícula: " + matricula + ", Velocidad: " + velocidad + " km/h";
    }

    public int getVelocidad() {
        return velocidad;
    }
}

