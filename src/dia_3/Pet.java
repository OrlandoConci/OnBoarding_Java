package dia_3;

public class Pet {

    private String nombre;
    private tiposPet tipo;
    private int edad;
    private Person propietario;

    public Pet(String nombre, tiposPet tipo, int edad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public tiposPet getTipo() {
        return tipo;
    }

    public void setTipo(tiposPet tipo) {
        this.tipo = tipo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Person getPropietario(Person person) {
        return propietario;
    }

    public void setPropietario(Person propietario) {
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "nombre='" + nombre + '\'' +
                ", tipo=" + tipo +
                ", edad=" + edad +
                '}';
    }
}
