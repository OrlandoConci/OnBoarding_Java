package dia_2;

public class Person {
    private String nombre, apellido, documento;
    private int edad;
    private double altura;
    private boolean casado;
    private String[] nombreMascotas;

    public Person(String nombre, String apellido, String documento, int edad, double altura, boolean casado, String[] nombreMascotas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.edad = edad;
        this.altura = altura;
        this.casado = casado;
        this.nombreMascotas = nombreMascotas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public String[] getNombreMascotas() {
        return nombreMascotas;
    }

    public void setNombreMascotas(String[] nombreMascotas) {
        this.nombreMascotas = nombreMascotas;
    }

    public void presentacion(String nombre, String apellido, int edad, double altura, boolean casado, String documento, String[] nombreMascotas) {
        System.out.println("Hola! Mi nombre es " + nombre + " " + apellido + ".");
        System.out.println("Tengo " + edad + " años y mido " + altura + " metros de altura.");
        if (casado) {
            System.out.println("Estoy casado/a.");
        } else {
            System.out.println("No estoy casado/a.");
        }
        System.out.println("Mi DNI es " + documento + ".");
        if (nombreMascotas.length > 0 ) {
            System.out.println("Mis mascotas se llaman: ");
            for (int i = 0; i<nombreMascotas.length; i++) {
                System.out.println("- " + nombreMascotas[i]);
            }
        } else {
            System.out.println("No tengo mascotas.");
        }
    }
}
