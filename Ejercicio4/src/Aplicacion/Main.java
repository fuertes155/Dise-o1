package Aplicacion;

public class Main {
    public static void main(String[] args) {
        GestorPersonas gestor = new GestorPersonas();

       
        Persona alumno = new Persona("Juan", "Pérez", 20, "alumno");
        alumno.setFacultad("Facultad de Ingeniería");

        Persona profesor = new Persona("María", "López", 45, "profesor");
        profesor.setDepartamento("Departamento de Matemáticas");

        Persona administrativo = new Persona("Carlos", "Gómez", 35, "administrativo");
        administrativo.setArea("Área de Recursos Humanos");

       
        gestor.agregarPersona(alumno);
        gestor.agregarPersona(profesor);
        gestor.agregarPersona(administrativo);

        
        gestor.mostrarPersonas();
    }
}
