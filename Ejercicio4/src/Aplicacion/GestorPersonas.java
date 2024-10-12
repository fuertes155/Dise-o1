package Aplicacion;

import java.util.ArrayList;
import java.util.List;

public class GestorPersonas {
    private List<Persona> personas;

    public GestorPersonas() {
        this.personas = new ArrayList<>();
    }

    public void agregarPersona(Persona persona) {
        personas.add(persona);
    }

    public void mostrarPersonas() {
        for (Persona persona : personas) {  
            System.out.println("Nombre: " + persona.getNombre() + ", Apellido: " + persona.getApellido() + ", Edad: " + persona.getEdad() + ", Tipo: " + persona.getTipo());
            
            if (persona.getTipo().equals("alumno")) {
                System.out.println("Facultad: " + persona.getFacultad());
            } else if (persona.getTipo().equals("profesor")) {
                System.out.println("Departamento: " + persona.getDepartamento());
            } else {
                System.out.println("Área: " + persona.getArea());
            }
            System.out.println(); 
        }
    }
}
