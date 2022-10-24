package it.fi.itismeucci;

import java.io.File;
import java.util.*;
import com.fasterxml.jackson.databind.ObjectMapper;

public class App
{
    public static void main( String[] args )
    {
        Alunno Battishtini = new Alunno("Niccolò", "Batistini", new Date(2004, 6, 30));
        Alunno Barletti = new Alunno("Leonardo", "Barletti", new Date(2004, 9, 23));
        Alunno Lanzi = new Alunno("Guido", "Lanzi", new Date(2004, 3, 29));
        Alunno Nencioni = new Alunno("Daniele", "Nencioni", new Date(2004, 3, 27));

        ArrayList<Alunno> lista = new ArrayList<>();
        lista.add(Battishtini);
        lista.add(Barletti);
        lista.add(Lanzi);
        lista.add(Nencioni);

        Classe CIA = new Classe(5, "C", "IA", lista);
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File("classe.json"), CIA);
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}
