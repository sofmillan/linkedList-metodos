package Guia;

public class Main {
    public static void main(String[] args) {

        Evento evento = new Evento(10);
        evento.agregarTiquete(3);
        evento.agregarTiquete(5);
        evento.agregarTiquete(2);
        evento.agregarTiquete(4);
        int procesados = evento.procesarHastaAgotarExistencia();

        EditorTexto editor = new EditorTexto();
        editor.agregarTecla("M");
        editor.agregarTecla("P");
        editor.agregarTecla("T");
        editor.deshacer();
        editor.deshacer();
        editor.deshacer();
    }

}
