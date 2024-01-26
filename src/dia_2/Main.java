package dia_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] mascotas1 = {"Andy", "Archie", "Tanquito"};
        String[] mascotas2 = new String[0];

        Person persona1 = new Person("Orlando", "Conci", "42.798.850", 22, 1.65, false, mascotas1);
        Person persona2 = new Person("Lucía", "Merez", "B42798940", 42, 1.65, true, mascotas2);

        persona1.presentacion(persona1.getNombre(), persona1.getApellido(), persona1.getEdad(), persona1.getAltura(), persona1.isCasado(), persona1.getDocumento(), persona1.getNombreMascotas());
        System.out.println("--------------------------------------------------");
        persona2.presentacion(persona2.getNombre(), persona2.getApellido(), persona2.getEdad(), persona2.getAltura(), persona2.isCasado(), persona2.getDocumento(), persona2.getNombreMascotas());
    }
}
