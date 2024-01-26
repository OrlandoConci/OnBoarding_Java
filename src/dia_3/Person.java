package dia_3;

import java.util.HashSet;
import java.util.Set;

public class Person {

    private String nombre, apellido, documento;
    private int age;
    private double altura;
    private boolean casado;
    private Set<Pet> nombreMascotas = new HashSet<>();

    public Person(String nombre, String apellido, String documento, int age, double altura, boolean casado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.age = age;
        this.altura = altura;
        this.casado = casado;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    public Set<Pet> getNombreMascotas() {
        return nombreMascotas;
    }

    public void addPets(Pet mascota) {
        mascota.getPropietario(this);
        this.nombreMascotas.add(mascota);
    }

    public void presentacion(String nombre, String apellido, int edad, double altura, boolean casado, String documento, Set<Pet> nombreMascotas) {
        System.out.println("Hola! Mi nombre es " + nombre + " " + apellido + ".");
        System.out.println("Tengo " + edad + " años y mido " + altura + " metros de altura.");
        if (casado) {
            System.out.println("Estoy casado/a.");
        } else {
            System.out.println("No estoy casado/a.");
        }
        System.out.println("Mi DNI es " + documento + ".");
        if (!nombreMascotas.isEmpty()) {
            System.out.println("Mis mascotas se llaman: ");
            for (Pet mascota : nombreMascotas) {
                System.out.println("- " + mascota.getNombre());
            }
        } else {
            System.out.println("No tengo mascotas.");
        }
    }


}
