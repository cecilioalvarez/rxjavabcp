package es.curso;

public class BorrarNoticia implements Observador{
    @Override
    public void notificar(String noticia) {
        System.out.println("la noticia se borra"+ noticia);
    }
}
