package ejemplostreams;

/**
 * Programa principal donde se aplican filtros y cambios a un stream para luego transformarlo en una cadena de texto
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main
{
    public static void main(String[] args)
    {
        List<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(new Persona("Nacho", 42));
        listaPersonas.add(new Persona("Juan", 70));
        listaPersonas.add(new Persona("Mario", 7));
        listaPersonas.add(new Persona("Enrique", 42));
        listaPersonas.add(new Persona("Laura", 4));
        listaPersonas.add(new Persona("May", 41));

        String nombresAdultos = listaPersonas.stream()
                                             .filter(p -> p.getEdad() >= 18)
                                             .map(p -> p.getNombre())
                                             .collect(Collectors.joining(", ",
                                             "Nombres adultos: ", ""));
        System.out.println(nombresAdultos);

    }
}
