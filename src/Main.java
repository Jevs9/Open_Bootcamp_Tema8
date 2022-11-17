//Para practicar la encapsulación:
//Crear clase Persona.
//Crear variables las privadas edad, nombre y telefono de la clase Persona.
//Crear gets y sets de cada propiedad.
//Crear un objeto persona en el main.
//Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.setEdad(15);
        persona1.setNombre("Jose");
        persona1.setTelefono("3124897556");
        System.out.println("Nombre: "+persona1.getNombre()+"| Edad: "+persona1.getEdad()+"| Teléfono: "+persona1.getTelefono());
    }
}
class Persona{
    private int edad;
    private String nombre;
    private String telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getTelefono() {
        return telefono;
    }
}