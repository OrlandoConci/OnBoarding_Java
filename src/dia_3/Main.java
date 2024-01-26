package dia_3;
import static dia_3.tiposPet.*;

public class Main {
    public static void main(String[] args) {

        Pet mascota1 = new Pet("Andy", GATO, 6);
        Pet mascota2 = new Pet("Archie", GATO, 4);
        Pet mascota3 = new Pet("Tango", PERRO, 3);

        Person persona1 = new Person("Orlando", "Conci", "42.798.850", 22, 1.65, false);
        Person persona2 = new Person("Lucía", "Perez", "A427988B", 45, 1.70, true);

        persona1.addPets(mascota1);
        persona1.addPets(mascota2);
        persona1.addPets(mascota3);

        persona1.presentacion(persona1.getNombre(), persona1.getApellido(), persona1.getAge(), persona1.getAltura(), persona1.isCasado(), persona1.getDocumento(), persona1.getNombreMascotas());
        System.out.println("--------------------------------------");
        persona2.presentacion(persona2.getNombre(), persona2.getApellido(), persona2.getAge(), persona2.getAltura(), persona2.isCasado(), persona2.getDocumento(), persona2.getNombreMascotas());

    }
}
