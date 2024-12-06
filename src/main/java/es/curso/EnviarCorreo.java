package es.curso;

public class EnviarCorreo implements Observador{

public void notificar(String noticia) {

    System.out.println("enviar un correo :"+noticia);
}

}
