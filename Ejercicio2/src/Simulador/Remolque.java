package Simulador;

public class Remolque {
    private int peso;
    

    public Remolque(int peso) {
        this.peso = peso;
    }
    
    @Override
    public String toString() {
        return "Remolque [Peso: " + peso + " kg]";
    }
}
