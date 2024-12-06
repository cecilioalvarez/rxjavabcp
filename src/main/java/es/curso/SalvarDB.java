package es.curso;

public class SalvarDB implements  Observador{

    public void notificar (String noticia) {

        System.out.println("salvamos en db la noticia :"+noticia);

    }
}
