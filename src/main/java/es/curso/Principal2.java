package es.curso;

public class Principal2 {
    public static void main(String[] args) {
        //observable
        ProcesadorNoticias pn= new ProcesadorNoticias();
        //dos observadores
        pn.addObservador(new SalvarDB());
        pn.addObservador(new EnviarCorreo());
        pn.addObservador(new BorrarNoticia());
        pn.procesar("un politico ha dimitido");
    }
}
