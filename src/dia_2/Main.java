package dia_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] mascotas1 = {"Andy", "Archie", "Tanquito"};
        String[] mascotas2 = new String[0];

        Person persona1 = new Person("Orlando", "Conci", "42.798.850", 22, 1.65, false, mascotas1);
        Person persona2 = new Person("Lucía", "Merez", "B42798940", 42, 1.65, true, mascotas2);

        persona1.presentacion();
        System.out.println("--------------------------------------------------");
        persona2.presentacion();
    }
}
