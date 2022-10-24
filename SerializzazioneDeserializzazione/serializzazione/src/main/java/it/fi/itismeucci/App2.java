package it.fi.itismeucci;

import java.util.*;
import java.io.File;
import com.fasterxml.jackson.databind.ObjectMapper;

public class App2 {
    public static void main( String[] args )
    {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            System.out.println("--------");
            
            Classe c3 = objectMapper.readValue(new File("classe.json"), Classe.class);
            System.out.println("--------");

            System.out.println(c3.getSezione() + c3.getAula());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
