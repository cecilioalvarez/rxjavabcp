package es.curso;

import java.util.ArrayList;
import java.util.List;

//observable
public class ProcesadorNoticias {

   List<Observador> lista= new ArrayList<>();

   public void addObservador(Observador o) {

       lista.add(o);
   }
    public void procesar(String noticia) {

       System.out.println("la noticia se procesa");
      for (Observador o: lista) {
          o.notificar(noticia);
      }
    }
}
