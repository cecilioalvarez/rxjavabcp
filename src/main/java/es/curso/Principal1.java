package es.curso;

import java.util.ArrayList;
import java.util.List;

public class Principal1 {
    public static void main(String[] args) {

        List<String> lista= List.of("h","hola","que","tal","estas","tu");

        //imperativa
    /*
        for (String elemento: lista) {

            System.out.println(elemento);
        }
        System.out.println("***********************");
        //declarativa tu lo que haces es delaras las operaciones
    */
        lista
                .stream()
                .peek(System.out::println)
                .filter((s)->s.length()>3)
                .map(String::toUpperCase)
                .peek(System.out::println)
                .forEach(System.out::println);







    }
}
