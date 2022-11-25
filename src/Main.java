/*
Para practicar la encapsulación:
Crear clase Persona.
Crear variables las privadas edad, nombre y telefono de la clase Persona.
Crear gets y sets de cada propiedad.
Crear un objeto persona en el main.
Utiliza los gets y sets para darle valores a las
propiedades edad, nombre y telefono, por último muéstralas por consola.
*/

public class Main {
    public static void main(String[] args) {

        Persona personaUno = new Persona();

        personaUno.setNombre("Javier");
        personaUno.setEdad(55);
        personaUno.setTelefono(75488995);

        System.out.println("**------Nombre de la persona------**");
        System.out.println(personaUno.getNombre());
        System.out.println("**------Edad------**");
        System.out.println(personaUno.getEdad());
        System.out.println("**------Número de teléfono------**");
        System.out.println(personaUno.getTelefono());
    }
}

class Persona {

    private String nombre;
    private int edad;
    private int telefono;


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }


    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return this.telefono;
    }

}