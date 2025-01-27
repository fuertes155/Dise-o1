package Simulador;

public class Camion extends Vehiculo {
    private Remolque remolque;

  
    public Camion(String matricula) {
        super(matricula);
        this.remolque = null;
    }

    
    public void ponRemolque(Remolque remolque) {
        this.remolque = remolque;
    }

 
    public void quitaRemolque() {
        this.remolque = null;
    }

    
    @Override
    public String toString() {
        String info = super.toString();
        if (remolque != null) {
            info += ", " + remolque.toString();
        }
        return info;
    }

    
    @Override
    public void acelerar(int incremento) {
        super.acelerar(incremento);
        if (remolque != null && getVelocidad() > 100) {
            System.out.println("Advertencia: Vas demasiado rápido con un remolque.");
        }
    }
}

